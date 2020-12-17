package controller;

import model.*;
import dao.DoadorDAO;
import org.json.*;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UsuarioController {
    
    private DoadorDAO dao;
    private EnderecoController enderecoController;
    private TipoSanguineoController tipoController;
    
    public UsuarioController() {
        this.dao = new DoadorDAO();
        this.enderecoController = new EnderecoController();
        this.tipoController = new TipoSanguineoController();
    }
    
    public boolean autentica(String login, String password) {
        Doador d = null;
        try {
            d = dao.searchByLogin(login);
            
        } catch (NullPointerException npe) {
            System.out.println("Doador não cadastrado");
        } catch (SQLException e) {
            e.getMessage();
        }
        
        if (d.getLogin() == null) {
            System.out.println("Doador não cadastrado!");
            return false;
        }
        
        return d.getLogin().equals(login) 
                && d.getSenha().equals(password);
    }
    
    public HashMap<String, Double> addressToCoordinates(List<String> endereco){
        String uri = "https://nominatim.openstreetmap.org/search";
        StringBuilder builderParams = new StringBuilder(uri);
        builderParams.append("?").append("format=json").append("&q=");
        
        for (String campo : endereco) {
            builderParams.append(campo.replace(" ", "+"));
            if(endereco.indexOf(campo) < endereco.size() - 1)
                builderParams.append("+");
        }
               
        JSONObject res = sendGet(builderParams.toString());
        
        HashMap<String, Double> coordinates = new HashMap<>();
        coordinates.put("lat", res.getDouble("lat"));
        coordinates.put("lon", res.getDouble("lon"));
        
        return coordinates;
    }
    
    public JSONObject getAddressInfoByCep(String cep){
        String uri = "https://viacep.com.br/ws/" + cep + "/json/";
        return sendGet(uri);
    }

    private JSONObject sendGet(String uri){
        JSONObject res = new JSONObject();
        try {
            HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .GET()
                .build();
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            
            System.out.println(uri);
            System.out.println(request);
            
            
            String body = response.body();
            if(body.charAt(0) != '{')
                body = body.substring(1, body.length()-1);

            res = new JSONObject(body);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    
    public boolean cadastra(String bairro, String cep, String email, String login, 
            String municipio,String nome, String rua, String senha, 
            String uf, String tipoSanguineo){

        List<String> enderecoList = new ArrayList<>();
        enderecoList.add(rua);
        enderecoList.add(bairro);
        enderecoList.add(municipio);
        enderecoList.add(uf);
        enderecoList.add(cep);

        HashMap<String, Double> coordinates = addressToCoordinates(enderecoList);
        
        TipoSanguineo tipo = tipoController.getByTipo(tipoSanguineo);
        Endereco endereco = enderecoController.getByCampos(bairro, cep, municipio, rua, uf, coordinates.get("lat"), coordinates.get("lon"));

        Doador doador = new Doador(login, nome, email, senha, tipo, endereco);
        
        try {
            dao.insert(doador);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
            return true;        
    }
}
