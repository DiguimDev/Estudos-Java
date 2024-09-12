package academy.devdojo.maratonajava.javacore.Tcoleçoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Thauan");
        nomes.add("Thauan Rodrigues");
        nomes.add("Javeiro");

        nomes2.addAll(nomes);

        nomes.remove("Thauan");

        for (Object nome: nomes2){
            System.out.println(nome);
        }
        System.out.println("-------------------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> listaNumerada = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            listaNumerada.add(i);
        }
        for (Integer listaNumerica: listaNumerada){
            System.out.print(listaNumerica + " ");
        }
    }
}
