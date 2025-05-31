package EstudosPOO.Composição;

public class Comprar {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.adicionarItem("caneta",9.67,2);
        compra1.adicionarItem(new Produto("Borrachas",0.50),2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno",49.99,6);
        compra2.adicionarItem(new Produto("Bolsa",200),1);


        Cliente cliente = new Cliente("João Silveira");
        cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        System.out.println("o valor total da compra foi: R$" + cliente.obterValorTotal());

    }
}
