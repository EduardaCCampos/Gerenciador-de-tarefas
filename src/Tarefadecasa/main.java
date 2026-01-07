package tarefadecasa;

import tarefadecasa.model.*;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Eduarda", "edu@email.com", "123");
        Tarefa tarefa = new Tarefa("Estudar Java", "POO e Packages", "10/10");

        usuario.adicionart(tarefa);
        usuario.visualizar();

        Gerenciador gerente = new Gerenciador("Admin", "admin@email.com", "admin");
        gerente.adicionar(usuario);

        Categoria estudos = new Categoria("Estudos");
        estudos.adicionar(tarefa);

        tarefa.visualizar();
    }
}
