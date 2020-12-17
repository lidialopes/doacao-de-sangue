package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Receptor;

public class ReceptorDao {
    public void insert(Receptor receptor) throws SQLException{
        Connection con = Conexao.getConnection();
        PreparedStatement stm = con.prepareStatement("insert into necessitado(nome, hospital, leito, obs, id_tipo_sanguineo) values (?, ?, ?, ?, ?)");
        stm.setString(1, receptor.getNome());
        stm.setString(2, receptor.getHospital());
        stm.setString(3, receptor.getLeito());
        stm.setString(4, receptor.getObs());
        stm.setInt(5, receptor.getTipoSanguineo().getId());
        stm.executeUpdate();
    };
}
