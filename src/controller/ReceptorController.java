package controller;

import dao.ReceptorDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import model.Endereco;
import model.Receptor;
import model.TipoSanguineo;
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
        
        int qntDoa = usuarioController.getDoadores().size();
        
        //Fazer um for verificando capturando a lat e lon e calculando a distancia comparando com o raio, depois somar o count
//        double distancia = coordenadaUtil.calculaDistanciaEntre(coordenadaDoador, coordenadaReceptor);
        
        return qntDoa;
    }

}
