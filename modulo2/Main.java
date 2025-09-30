import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Jessica Felix");
        Livro livro = new Livro();
        livro.setTitulo("Java for Beginners");
        livro.setGenero("Tecnologia");
        livro.setAutor(autor);
        Usuario usuario = new Usuario();
        usuario.setNome("Matheus Henrique");
        usuario.setIdade(18);
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setUsuario(usuario);
        emprestimo.setLivro(new Livro[]{livro});
        Date agora = new Date();
        emprestimo.setDataRetirada(agora);
        emprestimo.setDataDevolucao(agora);
        System.out.println("O livro não está disponível");
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
    }
}
