import java.util.Date;

public class EmprestimoTest {
    public static void main(String[] args) {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);

        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        System.out.println(emprestimo);
        emprestimo.realizarEmprestimo();
        System.out.println("Livro disponível? " + livro.isDisponivel());
        emprestimo.realizarDevolucao();
        System.out.println("Livro disponível após devolução? " + livro.isDisponivel());
    }
}