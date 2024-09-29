package academy.devdojo.maratonajava.javacore.ZZAstreams.test;

import academy.devdojo.maratonajava.javacore.ZZAstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZAstreams.dominio.LighNovel;
import academy.devdojo.maratonajava.javacore.ZZAstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsTest15 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightList.stream()
                .collect(Collectors.groupingBy(LighNovel::getCategory, Collectors.summarizingDouble(LighNovel::getPrice)));
        System.out.println(collect);
        Map<Category, List<Promotion>> collect1 = lightList.stream()
                .collect(Collectors.groupingBy(LighNovel::getCategory, Collectors.mapping(StreamsTest15::getPromotion, Collectors.toList())));
        System.out.println(collect1);
        Map<Category, LinkedHashSet<Promotion>> collect2 = lightList.stream()
                .collect(Collectors.groupingBy(LighNovel::getCategory, Collectors.mapping(StreamsTest15::getPromotion,
                        Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect2);
    }
    private static Promotion getPromotion(LighNovel ln){
        return ln.getPrice() < 30 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
