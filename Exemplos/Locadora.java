// Classe base Veiculo
abstract class Veiculo {
    private String modelo;
    private int ano;
    private int potencia;
    private String cor;

    public Veiculo(String modelo, int ano, int potencia, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.cor = cor;
    }

    // Método comum para exibir informações do veículo
    public void exibirInfo() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano + ", Potência: " + potencia + "CV, Cor: " + cor);
    }

    // Método abstrato para acelerar (será sobrescrito nas subclasses)
    public abstract void acelerar();

    // Getter para modelo (necessário para a exibição personalizada em subclasses)
    public String getModelo() {
        return modelo;
    }
}

// Classe Carro herda de Veiculo
class Carro extends Veiculo {
    public Carro(String modelo, int ano, int potencia, String cor) {
        super(modelo, ano, potencia, cor);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando...");
    }
}

// Subclasse Ford de Carro
class Ford extends Carro {
    public Ford(String modelo, int ano, int potencia, String cor) {
        super(modelo, ano, potencia, cor);
    }

    @Override
    public void acelerar() {
        System.out.println("O Ford " + getModelo() + " acelera suavemente.");
    }
}

// Subclasse Ferrari de Carro
class Ferrari extends Carro {
    public Ferrari(String modelo, int ano, int potencia, String cor) {
        super(modelo, ano, potencia, cor);
    }

    @Override
    public void acelerar() {
        System.out.println("A Ferrari " + getModelo() + " acelera com potência máxima!");
    }
}

// Classe Moto herda de Veiculo
class Moto extends Veiculo {
    public Moto(String modelo, int ano, int potencia, String cor) {
        super(modelo, ano, potencia, cor);
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando...");
    }
}

// Subclasse Harley de Moto
class Harley extends Moto {
    public Harley(String modelo, int ano, int potencia, String cor) {
        super(modelo, ano, potencia, cor);
    }

    @Override
    public void acelerar() {
        System.out.println("A Harley " + getModelo() + " faz um ronco grave ao acelerar.");
    }
}

// Subclasse Honda de Moto
class Honda extends Moto {
    public Honda(String modelo, int ano, int potencia, String cor) {
        super(modelo, ano, potencia, cor);
    }

    @Override
    public void acelerar() {
        System.out.println("A Honda " + getModelo() + " acelera de forma equilibrada.");
    }
}

// Classe principal para teste
public class Locadora {
    public static void main(String[] args) {
        Ford carro1 = new Ford("Mustang", 2022, 450, "Vermelho");
        Ferrari carro2 = new Ferrari("F8 Tributo", 2023, 720, "Amarelo");
        Harley moto1 = new Harley("Sportster", 2021, 120, "Preta");
        Honda moto2 = new Honda("CB500", 2022, 50, "Azul");

        // Exibindo informações e testando aceleração dos veículos
        carro1.exibirInfo();
        carro1.acelerar();

        carro2.exibirInfo();
        carro2.acelerar();

        moto1.exibirInfo();
        moto1.acelerar();

        moto2.exibirInfo();
        moto2.acelerar();
    }
}
