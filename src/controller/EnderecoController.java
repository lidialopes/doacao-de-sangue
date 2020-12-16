package controller;

import dao.EnderecoDAO;
import model.Endereco;

public class EnderecoController {
    private EnderecoDAO dao;
    
    public EnderecoController(){
        this.dao = new EnderecoDAO();
    }
    
    public void cadastra(Endereco endereco){
        try {
            dao.insert(endereco);
        } catch (Exception e) {
        }
    }
    
    public Endereco getByCampos(String bairro, String cep, String cidade, String rua, String uf, double lat, double lon){
        Endereco endereco = new Endereco();

        try {
            endereco = dao.searchExceptId(bairro, cep, cidade, rua, uf, lat, lon);
            if(endereco == null || endereco.getId() == 0){
                cadastra(new Endereco(bairro, cep, cidade, rua, uf, lat, lon));
                endereco = dao.searchExceptId(bairro, cep, cidade, rua, uf, lat, lon);
            }
        } catch (Exception e) {
        }
        return endereco;
    }
}
