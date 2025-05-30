package PastaCursos;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private ArrayList<Materia> materias = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public ArrayList<Materia> getMaterias() {
        return materias;
    }
    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public Curso (String nome, ArrayList<Materia> materias){
        this.nome = nome;
        this.materias = materias;
    }


}
