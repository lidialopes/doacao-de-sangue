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

    public boolean cadastra(String bairro, String cep, String email,
            String municipio, String nome, String rua, String uf,
            String tipoSanguineo) {

        List<String> enderecoList = new ArrayList<>();
        enderecoList.add(rua);
        enderecoList.add(bairro);
        enderecoList.add(municipio);
        enderecoList.add(uf);
        enderecoList.add(cep);

        HashMap<String, Double> coordinates = usuarioController
                .addressToCoordinates(enderecoList);

        TipoSanguineo tipo = tipoSanguineoController.getByTipo(tipoSanguineo);
        Endereco endereco = enderecoController.getByCampos(bairro, cep, municipio, rua, uf, coordinates.get("lat"), coordinates.get("lon"));

        Receptor receptor = new Receptor(nome, email, tipo, endereco);

        try {
            receptorDao.insert(receptor);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public double buscaDoadoresProximos() {
        double distancia = coordenadaUtil.calculaDistanciaEntre(coordenadaDoador, coordenadaReceptor);
        return distancia;
    }

}
