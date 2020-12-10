package controller;

import model.Doador;
import dao.DoadorDAO;
import java.sql.SQLException;

public class DoadorController {
    
    private DoadorDAO dao;

    public DoadorController() {
        this.dao = new DoadorDAO();
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
    
    
}
