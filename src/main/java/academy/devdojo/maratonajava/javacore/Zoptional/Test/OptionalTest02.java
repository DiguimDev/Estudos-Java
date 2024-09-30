package academy.devdojo.maratonajava.javacore.Zoptional.Test;

import academy.devdojo.maratonajava.javacore.Zoptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Zoptional.repositorio.MangaRepository;

public class OptionalTest02 {
    public static void main(String[] args) {
        MangaRepository.findyByTitle("Haikyuu")
                .ifPresent(m -> m.setTitle(m.getTitle() + " 2"));

        MangaRepository.findyById(4)
                .orElseThrow(IllegalArgumentException::new);
        Manga newManga = MangaRepository.findyByTitle("Jojo")
                .orElse(new Manga(4, 37, "Jojo"));
    }
}
