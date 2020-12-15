package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Endereco;

public class EnderecoDAO {
    public int getIdByCepERua(String cep, String rua) throws SQLException{
        Connection con = Conexao.getConnection();
        PreparedStatement stm = con.prepareStatement("select id from endereco where cep = ? and rua = ?");
        stm.setString(1, cep);
        stm.setString(2, rua);
        ResultSet res = stm.executeQuery();
        
        while (res.next())
            return res.getInt("endereco.id");
        return 0;
    }
    
    public Endereco getById(int id) throws SQLException {
        Endereco endereco = new Endereco();
        Connection con = Conexao.getConnection();
        PreparedStatement stm = con.prepareStatement("selct * from endereco where id = ?");
        stm.setInt(1, id);
        ResultSet res = stm.executeQuery();
        
        while (res.next()){
            endereco.setBairro(res.getString("endereco.bairro"));
            endereco.setCep(res.getString("endereco.cep"));
            endereco.setId(res.getInt("endereco.id"));
            endereco.setLatitude(res.getDouble("endereco.latitude"));
            endereco.setLongitude(res.getDouble("endereco.longitude"));
            endereco.setMunicipio(res.getString("endereco.municipio"));
            endereco.setRua(res.getString("endereco.rua"));
            endereco.setUf(res.getString("endereco.uf"));
        }
        return endereco;
    }
    
    public int insert(Endereco e) throws SQLException {
        Connection con = Conexao.getConnection();
        String sql = "insert into endereco(rua, cep, cidade, bairro, uf, latitude, longitude) values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        stm.setString(1, e.getRua());
        stm.setString(2, e.getCep());
        stm.setString(3, e.getMunicipio());
        stm.setString(4, e.getBairro());
        stm.setString(5, e.getUf());
        stm.setDouble(6, e.getLatitude());
        stm.setDouble(7, e.getLongitude());

        return stm.executeUpdate() == 1 
                ? stm.getGeneratedKeys().getInt(1) 
                : 0;
    }
}
