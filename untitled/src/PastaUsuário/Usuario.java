package PastaUsuário;

import java.util.UUID;

public class Usuario {
    String nome;
    String email;
    String id;
    String senha;

    public Usuario(String nome, String gmail, String senha) {
        this.nome = nome;
        this.email = gmail;
        this.id = UUID.randomUUID().toString();
        this.senha = senha;
    }

    // Get e Set do Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Get e Set do Email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Get e Set da Senha
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Get e Set do ID
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
