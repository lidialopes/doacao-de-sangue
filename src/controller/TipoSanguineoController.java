package controller;

import dao.TipoSanguineoDAO;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import model.TipoSanguineo;

public class TipoSanguineoController {
    private TipoSanguineoDAO dao;

    public TipoSanguineoController() {
        this.dao = new TipoSanguineoDAO();
    }
   
    public List<String> getTipos(){
        List<String> tipos = null;
        try {
            tipos = dao.getAllTipos();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tipos;
    }
    
    public HashMap<Integer, TipoSanguineo> getAll(){
        HashMap<Integer, TipoSanguineo> tipoSanguineoMap = null;
        try {
            tipoSanguineoMap = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tipoSanguineoMap;
    }
    
    public int getIdByTipo(String tipo){
        try {
            return dao.getIdByTipo(tipo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
