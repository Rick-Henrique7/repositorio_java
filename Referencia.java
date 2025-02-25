public class Referencia{
    private Aluno a1, a2;
    public Referencia() { // se pa isso aqui é um metodo
        a1 = new Aluno("Carlos"); 
        a2 = new Aluno("Dumba");
        System.out.println("meu nome é "+ a1.recuperarNome());
        System.out.println("meu nome é "+ a2.recuperarNome());
        a1 = a2; // aqui podemos aplicar referencia direta de memoria 
        a2.inserirNome("Flavia");
        System.out.println("O nome do aluno é " + a1.recuperarNome());
        manipularAluno (a1);
        System.out.println("O nome do aluno é " + a1.recuperarNome());
    }
    public void manipularAluno(Aluno aluno){
        aluno.inserirNome("Marcia");
    }
    public static void main(String args[]){ //classe principal
        Referencia r = new Referencia();
        System.out.println("Fim da execução");
    }
}