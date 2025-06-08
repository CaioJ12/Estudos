package GestãoBiblioteca;

public class CadastroLivro {

    String titulo;
    String autor;
    String editora;
    String isbn;
    int qntdEstoque;

    public CadastroLivro(String titulo, String autor, String editora, String isbn, int quantidade){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.qntdEstoque = quantidade;

    }


    @Override
    public String toString() {
        return titulo + " - " + autor + " - " + editora + " - " + isbn + " - Estoque: " + qntdEstoque;
    }

}
