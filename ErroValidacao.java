public class ErroValidacao extends Exception {
    public ErroValidacao(String mensagem) {
        super(mensagem);
    }

    public void atribuirCausa(Throwable causa) {
        initCause(causa);
    }
}
