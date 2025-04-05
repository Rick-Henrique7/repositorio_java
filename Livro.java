public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private boolean lido;

    // Construtor
    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.lido = false; // começa como não lido
    }

    // Getters
    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public boolean getLido() {
        return this.lido;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    // Método para marcar como lido
    public void marcarComoLido() {
        this.lido = true;
    }

    // Método para exibir detalhes
    public void exibirDetalhes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Páginas: " + getPaginas());
        System.out.println("Lido: " + (getLido() ? "Sim" : "Não"));
    }

    // Teste
    public static void main(String[] args) {
        Livro novoLivro = new Livro("Os Três Patetas", "Gene Roth", 150);
        novoLivro.exibirDetalhes();

        System.out.println("\nMarcando como lido...\n");
        novoLivro.marcarComoLido();
        novoLivro.exibirDetalhes();
    }
}
