package GestãoBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class GestãoLivros {
    List<CadastroLivro> livros = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, String editora, String isbn, int quantidade) {
        CadastroLivro livro = new CadastroLivro(titulo, autor, editora, isbn, quantidade);
        livros.add(livro);

        System.out.println("Livro adicionado: " + livro);
    }

    // Outras funções como removerLivro, buscarLivro, etc.

    //public void removerLivro(String titulo, String autor, String editora){}
    //public void removerLivro(String isbn){}
}
