import java.util.Random; // Importa a classe Random do pacote java.util para gerar números aleatórios

// Classe Pessoa
public class pessoa {
    // Atributos
    private String nome; // Armazena o nome da pessoa
    private double codigo_identificador; // Armazena o código identificador da pessoa
    private Random aleatorio; // Instância da classe Random para gerar o código identificador aleatório

    // Construtor
    public pessoa(String nome) {
        aleatorio = new Random(); // Inicializa o gerador de números aleatórios
        this.setNome(nome); // Define o nome da pessoa usando o método setNome
        this.codigo_identificador = aleatorio.nextDouble(); // Gera um número aleatório e atribui ao código identificador
    }

    // Método privado para definir o nome
    private void setNome(String nome) {
        this.nome = nome; // Atribui o nome ao atributo nome
    }

    // Método público para obter o nome
    public String getNome() {
        return this.nome; // Retorna o nome da pessoa
    }

    // Método público para obter o código identificador
    public double getCodigoIdentificador() {
        return this.codigo_identificador; // Retorna o código identificador da pessoa
    }

    // Método principal
    public static void main(String args[]) {
        pessoa p1 = new pessoa("Teste A"); // Cria uma nova instância da classe Pessoa com o nome "Teste A"
        pessoa p2 = new pessoa("Teste B");
        System.out.println("Pessoa 1:" + p1.getNome() + ", Código idendificador " + p1.getCodigoIdentificador());
        System.out.println("Pessoa 2: " + p2.getNome() + ", Código idendificador " + p2.getCodigoIdentificador()); // Imprime o nome da pessoa no console
    }
}
