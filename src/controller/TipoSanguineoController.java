package controller;

import dao.TipoSanguineoDAO;
import java.util.List;
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
            
    public TipoSanguineo getByTipo(String tipo){
        try {
            return dao.getByTipo(tipo);
        } catch (Exception e) {
        }
        return null;
    }

    public TipoSanguineo getById(int id){
        try {
            return dao.getById(id);
        } catch (Exception e) {
        }
        return null;
    }
}
