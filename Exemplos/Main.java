/*
    📌 Explicação do código:

    - Define a classe Pessoa, que representa uma pessoa com atributos básicos como nome, idade e CPF.
    - Implementa encapsulamento ao tornar alguns atributos privados e fornecer métodos de acesso (getters e setters).
    - Aplica herança, criando a classe Atleta que estende Pessoa e adiciona um novo atributo.
    - Demonstra polimorfismo ao sobrescrever o método apresentar() em Atleta.
*/

// Definição da classe Pessoa
class Pessoa {
    // Atributos privados para encapsulamento
    private String nome;
    private String cor;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String cpf;
    private String timeDeFutebol;

    // Construtor da classe Pessoa
    public Pessoa(String nome, String cor, String nacionalidade, int idade, double altura, double peso, String cpf, String timeDeFutebol) {
        this.nome = nome;
        this.cor = cor;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.cpf = cpf;
        this.timeDeFutebol = timeDeFutebol;
    }

    // Método para apresentar a pessoa
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", sou " + nacionalidade + " e torço para o " + timeDeFutebol + ".");
    }

    // Getter para obter o CPF (exemplo de encapsulamento)
    public String getCpf() {
        return cpf;
    }
}

// Classe Atleta que herda de Pessoa
class Atleta extends Pessoa {
    // Novo atributo exclusivo de Atleta
    private String esporte;

    // Construtor da classe Atleta
    public Atleta(String nome, String cor, String nacionalidade, int idade, double altura, double peso, String cpf, String timeDeFutebol, String esporte) {
        // Chama o construtor da superclasse (Pessoa)
        super(nome, cor, nacionalidade, idade, altura, peso, cpf, timeDeFutebol);
        this.esporte = esporte;
    }

    // Sobrescrita do método apresentar (Polimorfismo)
    @Override
    public void apresentar() {
        System.out.println("Sou um atleta chamado " + super.getCpf() + ", jogo " + esporte + ".");
    }
}

// Classe principal para executar o código
public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa("João", "Branco", "Brasileiro", 30, 1.75, 70.5, "123.456.789-00", "Flamengo");
        pessoa.apresentar();

        // Criando um objeto da classe Atleta
        Atleta atleta = new Atleta("Carlos", "Negro", "Argentino", 25, 1.80, 75.0, "987.654.321-00", "Boca Juniors", "Futebol");
        atleta.apresentar();
    }
}
