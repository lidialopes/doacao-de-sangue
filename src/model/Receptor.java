package model;

public class Receptor {
    private int id;
    private String nome;
    private String hospital;
    private String leito;
    private String obs;
    private TipoSanguineo tipoSanguineo;    

    public Receptor(int id, String nome, String hospital, String leito, String obs, TipoSanguineo tipoSanguineo) {
        this.id = id;
        this.nome = nome;
        this.hospital = hospital;
        this.leito = leito;
        this.obs = obs;
        this.tipoSanguineo = tipoSanguineo;
    }
    
    public Receptor(String nome, String hospital, String leito, String obs, TipoSanguineo tipoSanguineo) {
        this.nome = nome;
        this.hospital = hospital;
        this.leito = leito;
        this.obs = obs;
        this.tipoSanguineo = tipoSanguineo;
    }
    
    public Receptor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getLeito() {
        return leito;
    }

    public void setLeito(String leito) {
        this.leito = leito;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
}
