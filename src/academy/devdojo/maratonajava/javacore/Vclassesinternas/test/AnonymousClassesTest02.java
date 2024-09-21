package academy.devdojo.maratonajava.javacore.Vclassesinternas.test;


import academy.devdojo.maratonajava.javacore.Ugenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Barco> barcoList =new ArrayList<>( List.of(new Barco("Canoa"), new Barco("Lancha")));
        barcoList.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        System.out.println(barcoList);
    }
}
