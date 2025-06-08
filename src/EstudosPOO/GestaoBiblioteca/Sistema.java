package EstudosPOO.GestaoBiblioteca;

public class Sistema {
    public static void main(String[] args) {

        GestaoLivros livros = new GestaoLivros();

        livros.adicionarLivro("Água Viva", "Clarice Lispector", "Leia", "0001", 1);
        livros.adicionarLivro(" Hora Da estrela", "Clarice Lispector", "Leia", "0002", 1);
        livros.adicionarLivro("Livro dos prazeres", "Clarice Lispector", "Leia", "0003", 1);

        livros.removerLivro("0002");

        livros.alterarEstoque("0003",05);

        livros.verLivros();

    }
}
