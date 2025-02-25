public class Aluno {
    private String nome; 

    // Construtor que recebe um nome como parâmetro
    public Aluno(String nn) {
        nome = nn;
    }

    // Construtor padrão (caso ainda queira criar alunos sem nome inicial)
    public Aluno() {
        nome = "Sem nome"; // Ou pode deixar em branco
    }

    public void inserirNome(String nn) {
        nome = nn;
    }

    public String recuperarNome() {
        return nome;
    }
}
