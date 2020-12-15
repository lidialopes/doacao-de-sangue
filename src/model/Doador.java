package model;

public class Doador {
    private String login;
    private int id;
    private String nome;
    private String email;
    private String senha;
    private TipoSanguineo tipoSanguineo;
    private Endereco endereco;

    public Doador(String login, String nome, String email, 
            String senha, TipoSanguineo tipoSanguineo, Endereco endereco) {
        this.login = login;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipoSanguineo = tipoSanguineo;
        this.endereco = endereco;
    }

    public Doador() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
