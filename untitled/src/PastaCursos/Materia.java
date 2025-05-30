package PastaCursos;

import java.util.ArrayList;

public class Materia {
    private String nome;
    private ArrayList<String> conteudo = new ArrayList<>();

    public Materia(String nome, ArrayList<String> conteudo) {
        this.nome = nome;
        this.conteudo = conteudo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getConteudo() {
        return conteudo;
    }
    public void setConteudo(ArrayList<String> conteudo) {
        this.conteudo = conteudo;
    }
}
