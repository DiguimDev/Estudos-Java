package academy.devdojo.maratonajava.javacore.Tcoleçoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Thauan");
        nomes.add("Thauan Rodrigues");
        nomes.add("Javeiro");

        for (Object nome: nomes){
            System.out.println(nome);
        }
        System.out.println("-------------------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
