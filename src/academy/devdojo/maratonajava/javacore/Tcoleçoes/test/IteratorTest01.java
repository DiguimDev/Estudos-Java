package academy.devdojo.maratonajava.javacore.Tcoleçoes.test;

import academy.devdojo.maratonajava.javacore.Tcoleçoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Haikyuu",18.99, 0));
        mangas.add(new Manga( 3L,"One Piece",19.99, 6));
        mangas.add(new Manga(1L,"Dragon Ball",6.82, 2));
        mangas.add(new Manga(2L,"Berserk",13.65, 0));
        mangas.add(new Manga(4L,"Pokemon",12.12, 0));

       // Iterator<Manga> iterator = mangas.iterator();
       // while(iterator.hasNext()){
       //     Manga manga = iterator.next();
       //     if(manga.getQuantidade() == 0){
       //         iterator.remove();
       //     }
       // }
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
