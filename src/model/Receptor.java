package model;

public class Receptor {
    private int id;
    private String nome;
    private String email;   
    private TipoSanguineo tipoSanguineo;
    private Endereco endereco;
    
    public Receptor(String nome, String email,TipoSanguineo tipoSanguineo, 
            Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.tipoSanguineo = tipoSanguineo;
        this.endereco = endereco;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    } 
}
