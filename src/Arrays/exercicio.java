package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Olá por favor insira o número do array que irá ser criado...: ");
        int TamanhoArray = scan.nextInt();

        double[] dados = new double[TamanhoArray];

        System.out.println("por favor insira os dados de cada posição do array");

        for (int i = 0; i < TamanhoArray; i++){
            System.out.println("Posição " + (i+1));
            dados[i] =scan.nextDouble();

        }

        double soma = 0;
        for(double dado:dados){
            soma = soma + dado;
        }

        double media = (soma / dados.length);

        System.out.println("a soma dos dados inseridos foi de: " + soma);
        System.out.println("o tamanho do array de dados atualmente é de... : " + dados.length);
        System.out.println( " a média final é de: " + String.format("%.2f", media));


    }
}
