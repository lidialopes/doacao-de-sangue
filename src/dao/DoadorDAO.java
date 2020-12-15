package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Doador;

public class DoadorDAO {    
    public void insert(Doador d) throws SQLException{
        Connection con = Conexao.getConnection();
        PreparedStatement stm = con.prepareStatement("insert into doador(nome, email, login, senha, id_tipo_sanguineo, id_endereco) values (?, ?, ?, ?, ?, ?)");
        stm.setString(1, d.getNome());
        stm.setString(2, d.getEmail());
        stm.setString(3, d.getLogin());
        stm.setString(4, d.getSenha());
        stm.setInt(5, d.getTipoSanguineo().getId());
        stm.setInt(6, d.getEndereco().getId());
        stm.executeUpdate();
    };
    
    public Doador searchByLogin(String login) throws SQLException, NullPointerException { 
        Connection con = Conexao.getConnection();
        PreparedStatement stm = con.prepareStatement("select * from doador where login = ?");
        stm.setString(1, login);
        ResultSet res = stm.executeQuery();
        
        Doador d = new Doador();
        
        if (res.next()) {    
            d.setEmail(res.getString("doador.email"));
            d.setId(res.getInt("doador.id"));
            d.setNome(res.getString("doador.nome"));
            d.setLogin(res.getString("doador.login"));
            d.setSenha(res.getString("doador.senha"));
        }
        return d;
    };
    public void list(){};
    public void update(Doador d){};
    public void remove(){};
}
