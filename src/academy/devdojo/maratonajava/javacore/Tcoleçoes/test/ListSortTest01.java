package academy.devdojo.maratonajava.javacore.Tcoleçoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack On Titan");
        mangas.add("One Piece");
        mangas.add("Dragon Ball");
        mangas.add("Berserk");
        mangas.add("Pokemon");
        mangas.add("Naruto");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.27);
        dinheiros.add(839.17);
        dinheiros.add(24.78);
        dinheiros.add(15.149);

        Collections.sort(dinheiros);

        for (String manga: mangas){
            System.out.println(manga);
        }
        System.out.println("------------------------");

        for (Double dinheiro: dinheiros) {
            System.out.println(dinheiro);
        }
    }
}
