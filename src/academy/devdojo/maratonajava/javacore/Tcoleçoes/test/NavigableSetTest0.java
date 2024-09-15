package academy.devdojo.maratonajava.javacore.Tcoleçoes.test;

import academy.devdojo.maratonajava.javacore.Tcoleçoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Tcoleçoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;
class SmartphoneMarcaComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
class MangaPriceComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
public class NavigableSetTest0 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("Tijolo", "40028922");
        set.add(smartphone);
        System.out.println(set);
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPriceComparator()); // Tree Set origaniza automaticamente através do CompareTo
        mangas.add(new Manga(5L,"Haikyuu",18.99, 0));
        mangas.add(new Manga( 3L,"One Piece",19.99, 6));
        mangas.add(new Manga(1L,"Dragon Ball",6.82, 2));
        mangas.add(new Manga(2L,"Berserk",13.65, 0));
        mangas.add(new Manga(4L,"Pokemon",12.12, 0));
        mangas.reversed();
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga naruto = new Manga(31L, "Naruto", 6.83, 6);
        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println(mangas.lower(naruto));
        System.out.println(mangas.floor(naruto));
        System.out.println(mangas.higher(naruto));
        System.out.println(mangas.ceiling(naruto));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());
    }
}
