package academy.devdojo.maratonajava.javacore.Xlambdas.services;

import academy.devdojo.maratonajava.javacore.Xlambdas.dominio.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }
    public Integer compareByEpisodes(Anime a1, Anime a2){
        return a1.getQuantity().compareTo(a2.getQuantity());
    }
}
