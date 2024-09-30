package academy.devdojo.maratonajava.javacore.Xlambdas.test;

import academy.devdojo.maratonajava.javacore.Xlambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.Xlambdas.services.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
// Reference to a instant method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(( List.of(new Anime("Berserk", 5), new Anime("One Piece", 90), new Anime("Naruto", 50))));
        animeList.sort(animeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
