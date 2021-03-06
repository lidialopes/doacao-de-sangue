package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Doador;
import model.Receptor;
import model.TipoSanguineo;

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
    
    public ArrayList<Receptor> list() throws SQLException {
        Connection con = Conexao.getConnection();
        PreparedStatement stm = con.prepareStatement("select n.id, n.nome, n.hospital, n.leito, n.obs, t.tipo, t.id " +
                "from necessitado n " +
                "join tipo_sanguineo t on n.id_tipo_sanguineo = t.id;");
        ResultSet res = stm.executeQuery();
        
        ArrayList<Receptor> necessitados = new ArrayList<>();
        
        while (res.next()) {
            Receptor r = new Receptor();
            TipoSanguineo tipo = new TipoSanguineo();
            r.setId(res.getInt("n.id"));
            r.setNome(res.getString("n.nome"));
            r.setHospital(res.getString("n.hospital"));
            r.setLeito(res.getString("n.leito"));
            r.setObs(res.getString("n.obs"));
            tipo.setId(res.getInt("t.id"));
            tipo.setTipo(res.getString("t.tipo"));
            r.setTipoSanguineo(tipo);
            necessitados.add(r);
        }
        return necessitados;
    };
}
