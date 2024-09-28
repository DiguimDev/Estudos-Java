package academy.devdojo.maratonajava.javacore.ZZAstreams.test;

import academy.devdojo.maratonajava.javacore.ZZAstreams.dominio.LighNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest11 {
    private static List<LighNovel> lightList = new ArrayList<>(List.of(
            new LighNovel("Bleach", 46),
            new LighNovel("One Punch Man", 99.29),
            new LighNovel("Overlord", 37.99),
            new LighNovel("Dragon Ball", 32.69),
            new LighNovel("Haikyuu", 57.49),
            new LighNovel("Jujutsu Kaisen", 12.49),
            new LighNovel("Kimets no Yaiba", 12.49),
            new LighNovel("Jojo", 12.49)
    ));

    public static void main(String[] args) {
        System.out.println(lightList.stream().count());
        System.out.println(lightList.stream().collect(Collectors.counting()));

        lightList.stream().max(Comparator.comparing(LighNovel::getPrice)).ifPresent(System.out::println);
        lightList.stream().collect(Collectors.maxBy(Comparator.comparing(LighNovel::getPrice))).ifPresent(System.out::println);

        System.out.println(lightList.stream().mapToDouble(LighNovel::getPrice).sum());
        System.out.println(lightList.stream().collect(Collectors.summingDouble(LighNovel::getPrice)));

        lightList.stream().mapToDouble(LighNovel::getPrice).average().ifPresent(System.out::println);


        DoubleSummaryStatistics collect = lightList.stream().collect(Collectors.summarizingDouble(LighNovel::getPrice));
        System.out.println(collect);

        String collect1 = lightList.stream().map(LighNovel::getNome).collect(Collectors.joining(", "));
        System.out.println(collect1);
    }
}
