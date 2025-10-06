public class AutorTest {
    public static void main(String[] args) {
        Autor autor = new Autor("Jess", "Brasileira");
        System.out.println("Nome: " + autor.getNome());
        System.out.println("Nacionalidade: " + autor.getNacionalidade());

        autor.setNome("Jessica");
        autor.setNacionalidade("Brasil");

        System.out.println("Atualizado: " + autor);
    }
}