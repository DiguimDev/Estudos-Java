package academy.devdojo.maratonajava.javacore.ZZAstreams.test;

import academy.devdojo.maratonajava.javacore.ZZAstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZAstreams.dominio.LighNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsTest12 {
    private static List<LighNovel> lightList = new ArrayList<>(List.of(
            new LighNovel("Bleach", 46, Category.DRAMA),
            new LighNovel("One Punch Man", 99.29, Category.COMEDY),
            new LighNovel("Overlord", 37.99, Category.FANTASY),
            new LighNovel("Dragon Ball", 32.69,Category.FANTASY),
            new LighNovel("Haikyuu", 57.49, Category.COMEDY),
            new LighNovel("Jujutsu Kaisen", 12.49,Category.COMEDY),
            new LighNovel("Kimetsu no Yaiba", 12.49, Category.DRAMA),
            new LighNovel("Jojo", 12.49, Category.FANTASY)
    ));

    public static void main(String[] args) {
       // Map<Category, List<LighNovel>> categoryLightNovelMap = new HashMap<>();
       // List<LighNovel> fantasy = new ArrayList<>();
       // List<LighNovel> drama = new ArrayList<>();
       // List<LighNovel> comedy = new ArrayList<>();
       // for (LighNovel lighNovel : lightList) {
       //     switch (lighNovel.getCategory()){
       //         case DRAMA: drama.add(lighNovel); break;
       //         case COMEDY: comedy.add(lighNovel); break;
       //         case FANTASY: fantasy.add(lighNovel); break;
       //     }
       // }
       // categoryLightNovelMap.put(Category.DRAMA, drama);
       // categoryLightNovelMap.put(Category.FANTASY, fantasy);
       // categoryLightNovelMap.put(Category.COMEDY, comedy);
       // System.out.println(categoryLightNovelMap);

        Map<Category, List<LighNovel>> collect = lightList.stream().collect(Collectors.groupingBy(LighNovel::getCategory));
        System.out.println(collect);
    }
}
