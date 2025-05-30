package Coleções;

import Equals.Usuario;

import java.util.ArrayList;

public class lista {
    public static void main(String[] args) {
        ArrayList<UsuarioLista> lista = new ArrayList<>();
        UsuarioLista u1 = new UsuarioLista("Ana");

        lista.add(u1);
        lista.add(new UsuarioLista("Caio"));
        lista.add(new UsuarioLista("Carlos"));
        lista.add(new UsuarioLista("Bia"));
        lista.add(new UsuarioLista("Amelia"));

        for(UsuarioLista u: lista){
            System.out.println((u.nome));
        }

    }
}
