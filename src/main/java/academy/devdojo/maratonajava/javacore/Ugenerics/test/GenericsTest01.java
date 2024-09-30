package academy.devdojo.maratonajava.javacore.Ugenerics.test;

import academy.devdojo.maratonajava.javacore.Tcoleçoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        //type erasure  //Generics Validação em tempo de compilação
        List<String> lista = new ArrayList<>();
        lista.add("Asta");
        lista.add("Asta");

        for (String o : lista){
            System.out.println(o);
        }
        add(lista,new Consumidor("Asta"));
    }
    private static void add(List lista, Consumidor consumidor){
        lista.add(consumidor);
    }
}
