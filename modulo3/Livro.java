public class Livro {
    private String titulo;
    private Autor autor;
    private String categoria;
    private boolean disponivel;

    public Livro(String titulo, Autor autor, String categoria, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
        } else {
            System.out.println("Livro já emprestado!");
        }
    }

    public void devolver() {
        disponivel = true;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor.getNome() + " (" + categoria + ")";
    }
}