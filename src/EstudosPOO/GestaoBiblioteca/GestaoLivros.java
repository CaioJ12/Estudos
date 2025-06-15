package EstudosPOO.GestaoBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class GestaoLivros {
    List<CadastroLivro> livros = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, String editora, String isbn, int quantidade) {
        CadastroLivro livro = new CadastroLivro(titulo, autor, editora, isbn, quantidade);
        livros.add(livro);

        System.out.println("Livro adicionado: " + livro);
    }

    // Outras funções como removerLivro

    public void removerLivro(String titulo, String autor, String editora){
        CadastroLivro livroParaRemover = null;

        for (CadastroLivro livro : livros) {
            if (livro.titulo.equalsIgnoreCase(titulo) &&
                    livro.autor.equalsIgnoreCase(autor) &&
                    livro.editora.equalsIgnoreCase(editora)) {
                livroParaRemover = livro;
                break;
            }
        }

        if (livroParaRemover != null) {
            livros.remove(livroParaRemover);
            System.out.println("Livro " + livroParaRemover.titulo + " removido com sucesso.");
        } else {
            System.out.println("Livro não encontrado.");
        }


    }
    public void removerLivro(String isbn){
        CadastroLivro livroParaRemover = null;

        for (CadastroLivro livro : livros) {
            if (livro.isbn.equalsIgnoreCase(isbn)) {
                livroParaRemover = livro;
                break;
            }
        }

        if (livroParaRemover != null) {
            livros.remove(livroParaRemover);
            System.out.println("Livro " + livroParaRemover.titulo + " - " + livroParaRemover.isbn + " removido com sucesso.");
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    // função para aumentar estoque

    public void aumentarEstoque(String titulo, String editora, String autor, int quantidade) {
        for (CadastroLivro livro : livros) {
            boolean tituloConfere = livro.titulo.equalsIgnoreCase(titulo);
            boolean editoraConfere = livro.editora.equalsIgnoreCase(editora);
            boolean autorConfere = livro.autor.equalsIgnoreCase(autor);

            if (tituloConfere && editoraConfere && autorConfere) {
                int i = livro.qntdEstoque + quantidade;
                livro.qntdEstoque = i;
                System.out.println("Estoque aumentado do livro: " + livro.titulo + " → " + livro.qntdEstoque);
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
    public void alterarEstoque(String isbn, int quantidade) {
        for (CadastroLivro livro : livros) {
            boolean isbnConfere = livro.isbn.equalsIgnoreCase(isbn);

            if (isbnConfere) {
                int i = livro.qntdEstoque + quantidade;
                livro.qntdEstoque = i;
                System.out.println("Estoque aumentado do livro: " + livro.titulo + " → " + livro.qntdEstoque);
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    // função de buscar livr
    // criar função TENTATIVA COMMIT TESTE 01

    //função de printar a lista de livros existentes
    public void verLivros(){
        for (CadastroLivro livro : livros){
            System.out.println(livro);
        }

    }
}
