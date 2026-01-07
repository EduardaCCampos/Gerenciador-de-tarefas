package tarefadecasa.model;

import java.util.ArrayList;
import java.util.List;

public class Gerenciador extends Usuario {
    private List<Usuario> usuarios;

    public Gerenciador(String nome, String email, String senha) {
        super(nome, email, senha);
        this.usuarios = new ArrayList<>();
    }

    public void adicionar(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void remover(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public void buscar(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
