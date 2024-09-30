package academy.devdojo.maratonajava.javacore.Zoptional.repositorio;

import academy.devdojo.maratonajava.javacore.Zoptional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, 89, "Haikyuu"), new Manga(2, 50, "Berserker"));

    public static Optional<Manga> findyByTitle(String title) {
      return findyBy(m -> m.getTitle().equals(title));
    }
    public static Optional<Manga> findyById(Integer id) {
        return findyBy((m -> m.getId().equals(id)));
    }
    private static Optional<Manga> findyBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) found = manga;
        }
        return Optional.ofNullable(found);
    }
}
