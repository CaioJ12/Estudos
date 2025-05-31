package EstudosPOO.Composição;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

   final String nome;
    // construtor cliente
    Cliente(String nome){
        this.nome = nome;
    }

    //lista de compras
   final List<Compra> compras = new ArrayList<>();

    // valor de todas as compras feitas


    double obterValorTotal(){
        double total = 0;
        for(Compra compra: compras ){
           total += compra.obterValorTotal();
        }

        return total;
    }

}
