package Equals;

public class Equals {
    public static void main (String[] args){

        Usuario u1 = new  Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "Pedro@gmail.com.br";

        Usuario u2 = new Usuario();
        u2.nome = "Bia triz";
        u2.email = "Bia.triz@gmail.com";

        Usuario u3 = new  Usuario();
        u3.nome = "Pedro Silva";
        u3.email = "Pedro@gmail.com.br";

        Usuario u4 = u1;

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u1.equals(u3));
        System.out.println(u1.equals(u4));

    }
}
