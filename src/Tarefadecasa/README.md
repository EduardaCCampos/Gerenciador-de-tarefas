📌 Gerenciador de Tarefas em Java
✨ Visão Geral

Este projeto é um sistema simples de gerenciamento de tarefas, desenvolvido em Java, com foco em Programação Orientada a Objetos (POO). Ele permite a criação de usuários, organização de tarefas, categorização e uma camada de gerenciamento geral.

O objetivo principal do projeto é demonstrar conceitos fundamentais como:

Encapsulamento

Herança

Interfaces

Listas dinâmicas (ArrayList)

Organização em pacotes

💡 Projeto acadêmico ideal para demonstrar base sólida em lógica, estruturação de classes e modelagem de domínio.

🧱 Estrutura do Projeto
Tarefadecasa/
│
├── Usuario.java
├── Gerenciador.java
├── Tarefa.java
├── Categoria.java
├── Usuarioi.java
👤 Usuario

Representa um usuário comum do sistema.

Responsabilidades

Armazenar dados básicos do usuário (nome, email e senha)

Manter uma lista de tarefas

Adicionar, remover e atualizar tarefas

Atributos

nome

email

senha

listaDeTarefas

🧑‍💼 Gerenciador

Herda da classe Usuario e representa um usuário com privilégios administrativos.

Responsabilidades

Gerenciar outros usuários do sistema

Adicionar, remover e buscar usuários

Conceitos aplicados

Herança

Reutilização de código

✅ Tarefa

Representa uma tarefa que pode ser atribuída a um usuário.

Atributos

titulo

descricao

prazo

concluida

Funcionalidades

Marcar tarefa como concluída

Exibir informações da tarefa

🗂️ Categoria

Permite agrupar tarefas por categoria.

Responsabilidades

Organizar tarefas por contexto

Facilitar visualização e organização

Exemplos de categorias

Estudos

Trabalho

Casa

🔌 Interface Usuarioi

Define um contrato comum para classes que precisam implementar o método:

visualizar()

Isso reforça o uso de polimorfismo no projeto.

▶️ Como Rodar o Projeto
Pré-requisitos

Java JDK 8 ou superior

IDE Java (IntelliJ, Eclipse, NetBeans) ou terminal

Passo a passo

Clone o repositório:

git clone https://github.com/seu-usuario/seu-repositorio.git

Abra o projeto na sua IDE

Crie uma classe Main.java para testar o sistema:

public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario("Eduarda", "edu@email.com", "123");
        Tarefa t = new Tarefa("Estudar Java", "Revisar POO", "10/10");
        u.getListaDeTarefas().add(t);
        System.out.println(u);
    }
}

Execute o programa

🚀 Possíveis Melhorias Futuras

Correção de métodos que recebem List ao invés de objetos individuais

Implementação real do método visualizar()

Persistência de dados (arquivo ou banco de dados)

Interface gráfica (Swing ou JavaFX)

Testes unitários

🧠 Aprendizados Demonstrados

Modelagem de sistemas simples

Aplicação prática de POO

Organização de código em pacotes

Uso de listas dinâmicas

👩‍💻 Autora

Eduarda Lima
Estudante de Computação | Desenvolvimento de Sistemas | Análise de Dados

"Código simples, bem estruturado e com propósito." ✨