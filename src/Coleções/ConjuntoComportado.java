package Coleções;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {
       // Set<String> lista = new HashSet<String>();
        SortedSet<String> lista = new TreeSet<String>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        lista.add("F");
        lista.add("G");

        for(String letra: lista){
            System.out.println(letra);
        }
    }
}
