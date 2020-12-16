package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Endereco;

public class EnderecoDAO {
    
    public Endereco searchExceptId(String bairro, String cep, String cidade, String rua, String uf, double lat, double lon) throws SQLException{
        Endereco e = new Endereco();
        Connection con = Conexao.getConnection();
        PreparedStatement stm = con.prepareStatement("select * from endereco "
                + "where rua = ? and bairro = ? and cidade = ? and uf = ? "
                + "and cep = ? and latitude = ? and longitude = ?");
        stm.setString(1, rua);
        stm.setString(2, bairro);
        stm.setString(3, cidade);
        stm.setString(4, uf);
        stm.setString(5, cep);
        stm.setDouble(6, lat);
        stm.setDouble(7, lon);
        ResultSet res = stm.executeQuery();
        
        while (res.next()){
            e.setBairro(res.getString("endereco.bairro"));
            e.setCep(res.getString("endereco.cep"));
            e.setId(res.getInt("endereco.id"));
            e.setLatitude(res.getDouble("endereco.latitude"));
            e.setLongitude(res.getDouble("endereco.longitude"));
            e.setMunicipio(res.getString("endereco.cidade"));
            e.setRua(res.getString("endereco.rua"));
            e.setUf(res.getString("endereco.uf"));
        }
        return e;
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
    
    public void insert(Endereco e) throws SQLException {
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
        stm.executeUpdate();
    }
}
