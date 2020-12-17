package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Receptor;

public class ReceptorDao {
    public void insert(Receptor receptor) throws SQLException{
        Connection con = Conexao.getConnection();
        PreparedStatement stm = con.prepareStatement("insert into receptor(nome, email, id_tipo_sanguineo, id_endereco) values (?, ?, ?, ?, ?, ?)");
        stm.setString(1, receptor.getNome());
        stm.setString(2, receptor.getEmail());
        stm.setInt(5, receptor.getTipoSanguineo().getId());
        stm.setInt(6, receptor.getEndereco().getId());
        stm.executeUpdate();
    };
}
