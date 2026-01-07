package tarefadecasa.model;

import tarefadecasa.interfaces.Usuarioi;
import java.util.ArrayList;
import java.util.List;

public class Usuario implements Usuarioi {
    private String nome;
    private String email;
    private String senha;
    private List<Tarefa> listaDeTarefas;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.listaDeTarefas = new ArrayList<>();
    }

    public void adicionart(Tarefa tarefa) {
        listaDeTarefas.add(tarefa);
    }

    public void removert(Tarefa tarefa) {
        listaDeTarefas.remove(tarefa);
    }

    public void atualizar(List<Tarefa> tarefas) {
        this.listaDeTarefas = tarefas;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public List<Tarefa> getListaDeTarefas() {
        return listaDeTarefas;
    }

    @Override
    public void visualizar() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", listaDeTarefas=" + listaDeTarefas +
                '}';
    }
}
