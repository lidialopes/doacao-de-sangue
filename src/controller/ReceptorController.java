package controller;

import dao.ReceptorDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import model.Endereco;
import model.Receptor;
import model.TipoSanguineo;
import model.Doador;
import util.CoordenadaUtil;

public class ReceptorController {

    private UsuarioController usuarioController;
    private TipoSanguineoController tipoSanguineoController;
    private EnderecoController enderecoController;
    private ReceptorDao receptorDao;
    private CoordenadaUtil coordenadaUtil;

    public ReceptorController() {
        usuarioController = new UsuarioController();
        tipoSanguineoController = new TipoSanguineoController();
        enderecoController = new EnderecoController();
        receptorDao = new ReceptorDao();
        coordenadaUtil = new CoordenadaUtil();
    }

    public int cadastra(String nome, String hospital, String leito, String obs, String tipoSanguineo, int raio) {
        HashMap<String, Double> coordenadaReceptor = coordenadaUtil.addressToCoordinates(hospital);
        
        TipoSanguineo tipo = tipoSanguineoController.getByTipo(tipoSanguineo);

        Receptor receptor = new Receptor(nome, hospital, leito, obs, tipo);

        try {
            receptorDao.insert(receptor);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return buscaDoadoresProximos(coordenadaReceptor, raio);
    }

    public int buscaDoadoresProximos(HashMap<String, Double> coordenadaReceptor, int raio) {
        int count = 0;
        
        for(Doador doador : usuarioController.getDoadores()){
            HashMap<String, Double> location = new HashMap<>();
            location.put("lat", doador.getEndereco().getLatitude());
            location.put("lon", doador.getEndereco().getLatitude());
            
            if(coordenadaUtil.calculaDistanciaEntre(location, coordenadaReceptor) <= raio) count++;
        }
        return count;
    }
    
    public List<Receptor> buscaReceptores(){
        try{
            return receptorDao.list();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("here");
        return null;
    }    
}
