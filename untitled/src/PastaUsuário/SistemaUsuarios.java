package PastaUsuário;

import java.util.ArrayList;

public class SistemaUsuarios {
    private ArrayList<Usuario> dados = new ArrayList<>(); // Lista de usuários


    public void adicionarUsuario(Usuario usuario) {
        dados.add(usuario);
    }

    public ArrayList<Usuario> getDados() {
        return dados;
    }
}