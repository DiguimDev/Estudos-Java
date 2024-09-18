package academy.devdojo.maratonajava.javacore.Ugenerics.test;

import academy.devdojo.maratonajava.javacore.Ugenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("Canoa"));
    }
    private static <T> void criarArrayComUmObjeto(T t){
        List<T> list = List.of(t);
        System.out.println(list);
    }
}
