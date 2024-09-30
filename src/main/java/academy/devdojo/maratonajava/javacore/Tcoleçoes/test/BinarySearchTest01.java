package academy.devdojo.maratonajava.javacore.Tcoleçoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros,4));
    }
}
