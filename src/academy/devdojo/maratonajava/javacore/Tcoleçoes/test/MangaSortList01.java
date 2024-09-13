package academy.devdojo.maratonajava.javacore.Tcoleçoes.test;

import academy.devdojo.maratonajava.javacore.Tcoleçoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortList01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Haikyuu",18.99));
        mangas.add(new Manga( 3L,"One Piece",19.99));
        mangas.add(new Manga(1L,"Dragon Ball",6.82));
        mangas.add(new Manga(2L,"Berserk",13.65));
        mangas.add(new Manga(4L,"Pokemon",12.12));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);

        System.out.println("----------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
