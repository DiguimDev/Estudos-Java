package academy.devdojo.maratonajava.javacore.ZZAstreams.test;

import academy.devdojo.maratonajava.javacore.ZZAstreams.dominio.LighNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTest03 {
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
        Stream<LighNovel> stream = lightList.stream();
        lightList.forEach(System.out::println);
        long count = stream.filter(ln -> ln.getPrice() >= 40).count();


        long count2 = lightList.stream()
                .distinct()
                .filter(ln -> ln.getPrice() < 40)
                .count();

        System.out.println(count);
    }
}
