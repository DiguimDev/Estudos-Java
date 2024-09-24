package academy.devdojo.maratonajava.javacore.Xlambdas.test;

import academy.devdojo.maratonajava.javacore.Xlambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.Xlambdas.services.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(( List.of(new Anime("Berserk", 5), new Anime("One Piece", 90), new Anime("Naruto", 50))));
        //Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        Collections.sort(animeList, AnimeComparators::compareByTitle);
        System.out.println(animeList);
    }
}
