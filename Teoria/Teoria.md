Ótimo! Vou explicar cada conceito de **Programação Orientada a Objetos (POO)** de forma clara, com exemplos em **Java, JavaScript e TypeScript**.  

---

## 🔹 **O que é uma Classe?**  
Uma **classe** é um modelo ou estrutura que define características e comportamentos de um objeto.  
Pense nela como a **fôrma de um bolo**: ela define como o bolo deve ser feito, mas o bolo em si só existe quando a massa é assada.  

### **Exemplo de Classe**  
📌 **A classe `Carro` define que um carro tem `marca` e `modelo`.**  

### **Java**  
```java
class Carro {
    String marca;
    String modelo;

    Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
}
```

### **JavaScript**  
```javascript
class Carro {
    constructor(marca, modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
}
```

### **TypeScript**  
```typescript
class Carro {
    marca: string;
    modelo: string;

    constructor(marca: string, modelo: string) {
        this.marca = marca;
        this.modelo = modelo;
    }
}
```

---

## 🔹 **O que é um Objeto?**  
Um **objeto** é uma **instância** de uma classe, ou seja, **é um elemento criado a partir de uma classe**.  
Se a **classe** é a fôrma do bolo, o **objeto** é o bolo pronto!  

📌 **Criamos um carro específico a partir da classe `Carro`.**  

### **Java**  
```java
public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla");
        System.out.println(meuCarro.marca);  // Toyota
    }
}
```

### **JavaScript**  
```javascript
const meuCarro = new Carro("Toyota", "Corolla");
console.log(meuCarro.marca);  // Toyota
```

### **TypeScript**  
```typescript
const meuCarro = new Carro("Toyota", "Corolla");
console.log(meuCarro.marca);  // Toyota
```

---

## 🔹 **O que é um Método?**  
Um **método** é uma **função dentro de uma classe**.  
Ele define um comportamento do objeto.  

📌 **O método `buzinar()` faz o carro emitir um som.**  

### **Java**  
```java
class Carro {
    String marca;
    String modelo;

    Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    void buzinar() {
        System.out.println("Biiiii!");
    }
}

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla");
        meuCarro.buzinar();  // Biiiii!
    }
}
```

### **JavaScript**  
```javascript
class Carro {
    constructor(marca, modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    buzinar() {
        console.log("Biiiii!");
    }
}

const meuCarro = new Carro("Toyota", "Corolla");
meuCarro.buzinar();  // Biiiii!
```

### **TypeScript**  
```typescript
class Carro {
    marca: string;
    modelo: string;

    constructor(marca: string, modelo: string) {
        this.marca = marca;
        this.modelo = modelo;
    }

    buzinar(): void {
        console.log("Biiiii!");
    }
}

const meuCarro = new Carro("Toyota", "Corolla");
meuCarro.buzinar();  // Biiiii!
```

---

## 🔹 **O que é Encapsulamento?**  
O **encapsulamento** protege os dados da classe, restringindo o acesso direto aos atributos.  

📌 **Atributos `privados` impedem acesso direto, e métodos `públicos` controlam esse acesso.**  

### **Java**  
```java
class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double verSaldo() {
        return saldo;
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000);
        conta.depositar(500);
        System.out.println(conta.verSaldo());  // 1500
    }
}
```

### **JavaScript**  
```javascript
class ContaBancaria {
    #saldo;

    constructor(saldoInicial) {
        this.#saldo = saldoInicial;
    }

    depositar(valor) {
        this.#saldo += valor;
    }

    verSaldo() {
        return this.#saldo;
    }
}

const conta = new ContaBancaria(1000);
conta.depositar(500);
console.log(conta.verSaldo());  // 1500
```

### **TypeScript**  
```typescript
class ContaBancaria {
    private saldo: number;

    constructor(saldoInicial: number) {
        this.saldo = saldoInicial;
    }

    depositar(valor: number): void {
        this.saldo += valor;
    }

    verSaldo(): number {
        return this.saldo;
    }
}

const conta = new ContaBancaria(1000);
conta.depositar(500);
console.log(conta.verSaldo());  // 1500
```

---

## 🔹 **O que é Herança?**  
A **herança** permite que uma classe herde atributos e métodos de outra classe.  
📌 **A classe `CarroEletrico` herda de `Carro`.**  

### **Java**  
```java
class Carro {
    String marca;

    Carro(String marca) {
        this.marca = marca;
    }
}

class CarroEletrico extends Carro {
    int bateria;

    CarroEletrico(String marca, int bateria) {
        super(marca);
        this.bateria = bateria;
    }
}
```

### **JavaScript**  
```javascript
class Carro {
    constructor(marca) {
        this.marca = marca;
    }
}

class CarroEletrico extends Carro {
    constructor(marca, bateria) {
        super(marca);
        this.bateria = bateria;
    }
}
```

### **TypeScript**  
```typescript
class Carro {
    constructor(public marca: string) {}
}

class CarroEletrico extends Carro {
    constructor(marca: string, public bateria: number) {
        super(marca);
    }
}
```

---

## 🔹 **O que é Polimorfismo?**  
O **polimorfismo** permite que um método tenha diferentes comportamentos dependendo da classe que o implementa.  

📌 **O método `acelerar()` tem comportamentos diferentes para `Carro` e `CarroEletrico`.**  

### **Java**  
```java
class Carro {
    void acelerar() {
        System.out.println("O carro está acelerando.");
    }
}

class CarroEletrico extends Carro {
    @Override
    void acelerar() {
        System.out.println("O carro elétrico acelera silenciosamente.");
    }
}
```

### **JavaScript**  
```javascript
class Carro {
    acelerar() {
        console.log("O carro está acelerando.");
    }
}

class CarroEletrico extends Carro {
    acelerar() {
        console.log("O carro elétrico acelera silenciosamente.");
    }
}
```

### **TypeScript**  
```typescript
class Carro {
    acelerar(): void {
        console.log("O carro está acelerando.");
    }
}

class CarroEletrico extends Carro {
    acelerar(): void {
        console.log("O carro elétrico acelera silenciosamente.");
    }
}
```