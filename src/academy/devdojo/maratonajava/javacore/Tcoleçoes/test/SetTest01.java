package academy.devdojo.maratonajava.javacore.Tcoleçoes.test;

import academy.devdojo.maratonajava.javacore.Tcoleçoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>(); //hash nao permita valores duplicados
        mangas.add(new Manga(5L,"Haikyuu",18.99, 0));
        mangas.add(new Manga( 3L,"One Piece",19.99, 6));
        mangas.add(new Manga(1L,"Dragon Ball",6.82, 2));
        mangas.add(new Manga(2L,"Berserk",13.65, 0));
        mangas.add(new Manga(4L,"Pokemon",12.12, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
