package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import model.TipoSanguineo;

public class TipoSanguineoDAO {
    public List<String> getAllTipos() throws SQLException{
        List<String> tipos = new ArrayList<>();
        Connection con = Conexao.getConnection();
        PreparedStatement stm = con.prepareStatement("select tipo from tipo_sanguineo");
        ResultSet res = stm.executeQuery();

        while(res.next()){
            tipos.add(res.getString("tipo"));
        }            
        return tipos;
    }
    
    public HashMap<Integer, TipoSanguineo> getAll() throws SQLException{
        HashMap<Integer, TipoSanguineo> tipos = new HashMap<>();
        Connection con = Conexao.getConnection();
        PreparedStatement stm = con.prepareStatement("select * from tipo_sanguineo");
        ResultSet res = stm.executeQuery();

        while(res.next()){
            TipoSanguineo tipo = new TipoSanguineo();
            tipo.setId(res.getInt("tipo_sanguineo.id"));
            tipo.setTipo(res.getString("tipo_sanguineo.tipo"));
            tipos.put(tipo.getId(), tipo);
        }            
        return tipos;
    }
    
    public int getIdByTipo (String tipo) throws SQLException{
        Connection con = Conexao.getConnection();
        PreparedStatement stm = con.prepareStatement("select id from tipo_sanguineo where tipo = ?");
        stm.setString(1, tipo);
        ResultSet res = stm.executeQuery();
        
        while(res.next())
            return res.getInt("id");
        return 0;
    }
    
    public TipoSanguineo getByTipo(String tipo) throws SQLException{
        TipoSanguineo tipoSanguineo = null;
        Connection con = Conexao.getConnection();
        PreparedStatement stm = con.prepareStatement("select * from tipo_sanguineo where tipo = ?");
        stm.setString(1, tipo);
        ResultSet res = stm.executeQuery();

        while(res.next()){
            tipoSanguineo.setId(res.getInt("tipo_sanguineo.id"));
            tipoSanguineo.setTipo(res.getString("tipo_sanguineo.tipo"));
        }
        return tipoSanguineo;
    } 
}
