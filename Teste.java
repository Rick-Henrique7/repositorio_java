public class Teste { 
    // Atributos (privados para encapsulamento)
    private String nome;
    private int idade;
    private int peso;

    // Construtor
    public Teste(String nome, int idade, int peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    // Getters e Setters
    public String getNome() { 
        return nome;
    }

    public void setNome(String nome) { 
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String toString() { 
        return "Meu nome é " + nome + ", tenho " + idade + " anos e peso " + peso + " kg."; //perceba que nao esta entre parenteses
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Teste pessoa = new Teste("Henrique", 22, 103);
        System.out.println(pessoa);
    }
}