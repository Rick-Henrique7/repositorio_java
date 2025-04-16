import java.util.ArrayList;
import java.util.List;

public class ExemploEncadeamentoExcecoes {
    public static void main(String[] args) {
        try {
            List<String> lstNomes = new ArrayList<>();
            addNome(lstNomes, null);

        } catch (NomeInvalidoExcecao e) {
            System.out.println("Um erro ocorreu: " + e.getMessage());
            System.out.println("Causa raiz: " + e.getCause().getMessage());
        }
    }

    public static void addNome(List<String> nomes, String nome) throws NomeInvalidoExcecao {
        try {
            if (nome == null || nome.isBlank()) {
                throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
            }
            nomes.add(nome);
        } catch (IllegalArgumentException e) {
            throw new NomeInvalidoExcecao("Foi detectado um nome inválido", e);
        }
    }

    // Exceção personalizada
    public static class NomeInvalidoExcecao extends Exception {
        public NomeInvalidoExcecao(String mensagem, Throwable causa) {
            super(mensagem, causa);
        }
    }
}
