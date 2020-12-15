package model;

public class Endereco {
    private int id;
    private String bairro; 
    private String cep; 
    private String municipio;
    private String rua; 
    private String uf;
    private double latitude;
    private double longitude;

    public Endereco(String bairro, String cep, String municipio, String rua, String uf) {
        this.bairro = bairro;
        this.cep = cep;
        this.municipio = municipio;
        this.rua = rua;
        this.uf = uf;
    }
    
    public Endereco(String bairro, String cep, String municipio, String rua, String uf, double latitude, double longitude) {
        this.bairro = bairro;
        this.cep = cep;
        this.municipio = municipio;
        this.rua = rua;
        this.uf = uf;
        this.latitude = latitude;               
        this.longitude = longitude;
    }    
    
    public Endereco() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }    

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public boolean equalsExceptId(Endereco e){
        return this.bairro.equals(e.getBairro()) 
                && this.cep.equals(e.getCep())
                && this.latitude == e.getLatitude()
                && this.longitude == e.getLongitude()
                && this.municipio.equals(e.getMunicipio())
                && this.rua.equals(e.getRua())
                && this.uf.equals(e.getUf());
                
    }

}
