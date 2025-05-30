package Coleções;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoNO {
        public static void main (String[] args){

            HashSet conjunto = new HashSet();

            conjunto.add(1.2); // double -> Double
            conjunto.add(true); // boolean -> Booleab
            conjunto.add("Teste");
            conjunto.add("a"); // char -> Character
            conjunto.add(1); //int --> Integer

            System.out.println("Tamanho é " + conjunto.size());

            conjunto.add("teste");

            System.out.println("O novo Tamanho é " + conjunto.size());


            Set nums = new HashSet();
            nums.add(1);
            nums.add(3);
            nums.add(4);

            conjunto.addAll(nums);

        }
}
