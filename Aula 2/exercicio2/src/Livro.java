public class Livro {
    String titulo;
    String ator;
    Categoria categoria;
    Status status;

    public Livro(String titulo, String ator, Categoria categoria, Status status) {
        this.titulo = titulo;
        this.ator = ator;
        this.categoria = categoria;
        this.status = status;
    }
}
