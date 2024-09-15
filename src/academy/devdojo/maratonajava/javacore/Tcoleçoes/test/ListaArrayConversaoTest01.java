package academy.devdojo.maratonajava.javacore.Tcoleçoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println("------------");
        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 3;
        numerosArray[2] = 2;

        List<Integer> list = Arrays.asList(numerosArray);
        list.set(0,12);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(list);

        System.out.println("---------------------");
        List<Integer> newList = new ArrayList<>(Arrays.asList(numerosArray));
        newList.add(19);
        System.out.println(newList);
    }
}
