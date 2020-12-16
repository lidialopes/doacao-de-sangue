package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
            
    public TipoSanguineo getByTipo(String tipo) throws SQLException{
        TipoSanguineo tipoSanguineo = new TipoSanguineo();
        Connection con = Conexao.getConnection();
        PreparedStatement stm = con.prepareStatement("select * from tipo_sanguineo where tipo = ?");
        stm.setString(1, tipo);
        ResultSet res = stm.executeQuery();

        if(res.next()){            
            tipoSanguineo.setId(res.getInt("tipo_sanguineo.id"));
            tipoSanguineo.setTipo(res.getString("tipo_sanguineo.tipo"));
        }
        return tipoSanguineo;
    } 
}
