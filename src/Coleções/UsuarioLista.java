package Coleções;

import java.util.Objects;

public class UsuarioLista {
    String nome;     
    UsuarioLista(String nome){
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioLista that = (UsuarioLista) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
