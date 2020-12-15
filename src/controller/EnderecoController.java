package controller;

import dao.EnderecoDAO;
import model.Endereco;

public class EnderecoController {
    private EnderecoDAO dao;
    
    public EnderecoController(){
        this.dao = new EnderecoDAO();
    }
    
    public int exists(Endereco endereco){
        try {
            int id = dao.getIdByCepERua(endereco.getCep(), endereco.getRua());
            if(id == 0)
                return cadastra(endereco);
            return id;
        } catch (Exception e) {
        }
        return 0;
    }
    
    public int cadastra(Endereco endereco){
        try {
            return dao.insert(endereco);
        } catch (Exception e) {
        }
        return 0;
    }
}
