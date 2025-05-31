package EstudosPOO.Composição;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    Cliente cliente;
    //Array de itens
    final List<Item> itens = new ArrayList<>();

    //adicionar itens
    void adicionarItem(Produto P, int quantidade){
        this.itens.add(new Item(P,quantidade));
    }

    void adicionarItem(String nome, double preco, int quantidade){
        Produto produto = new Produto(nome, quantidade);
        this.itens.add(new Item( produto,quantidade));
    }

    //método para calcular valor total

    double obterValorTotal(){
        double total = 0;
        for(Item item: itens ){
            total += item.quantidade * item.produto.preco;

        }

        return total;
    }


}
