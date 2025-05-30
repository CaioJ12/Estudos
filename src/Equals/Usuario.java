package Equals;

public class Usuario {

    String nome;
    String email;


    @Override
    public boolean equals(Object objeto){
        if (this == objeto) return true;  // Se for o mesmo objeto, retorna true
        if (objeto == null || !(objeto instanceof Usuario)) return false;
       /* if(objeto instanceof  Usuario) {
            Usuario outro = (Usuario) objeto;

            return super.equals(objeto);
        }else {
        return false;
        }*/
        Usuario outro = (Usuario) objeto;
        boolean nomeIgual = outro.nome.equals(this.nome);
        boolean emailIgual = outro.email.equals(this.email);
        return  nomeIgual && emailIgual;

    }
}
