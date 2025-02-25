public class helloword {
    private String nome; //definindo atributos
    public void inserirNome(String nn) {
        nome = nn;
    }
    public String recuperarNome() {
        return nome;
    }
    public static void main(String[] args) {
        helloword a = new helloword();
        a.inserirNome("HelloWord");
        System.out.println("saida:" + a.recuperarNome());
    }
}