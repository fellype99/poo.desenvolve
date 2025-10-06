public class LivroTest {
    public static void main(String[] args) {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Básico", autor, "Tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "Tecnologia", false);

        System.out.println(livro1);
        System.out.println("Disponível? " + livro1.isDisponivel());
        livro1.emprestar();
        System.out.println("Depois do empréstimo: " + livro1.isDisponivel());
        livro1.devolver();
        System.out.println("Depois da devolução: " + livro1.isDisponivel());
    }
}