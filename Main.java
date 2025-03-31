// Classe Pessoa1
class Pessoa1 {
    // Atributos da classe
    String nome;
    int idade;
    String sexo;
    int peso;

    // Construtor da classe
    Pessoa1(String nome, int idade, String sexo, int peso) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.peso = peso;
    }

    // Métodos da classe
    void ola() {
        System.out.println("Olá, meu nome é " + nome);
    }

    void mostrarPeso() {
        System.out.println("Meu peso é " + peso + "kg");
    }
}

// Classe principal com método main
public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa1
        Pessoa1 pessoa = new Pessoa1("Henrique", 22, "Masculino", 110);

        // Chamando os métodos do objeto
        pessoa.ola();
        pessoa.mostrarPeso();
    }
}
