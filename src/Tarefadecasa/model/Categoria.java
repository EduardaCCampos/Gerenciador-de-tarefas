package tarefadecasa.model;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nome;
    private List<Tarefa> tarefas;

    public Categoria(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public void adicionar(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void remover(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }

    public String getNome() {
        return nome;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }
}
