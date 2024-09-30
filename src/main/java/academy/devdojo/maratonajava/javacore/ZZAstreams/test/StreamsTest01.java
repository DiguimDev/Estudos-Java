package academy.devdojo.maratonajava.javacore.ZZAstreams.test;

import academy.devdojo.maratonajava.javacore.ZZAstreams.dominio.LighNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamsTest01 {
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
        lightList.sort(Comparator.comparing(LighNovel::getNome));
        List<String> names = new ArrayList<>();
        for (LighNovel lightNovel : lightList) {
            if(lightNovel.getPrice() <= 40){
                names.add(lightNovel.getNome());
            }
            if(names.size() >=3){
                break;
            }
        }
        System.out.println(lightList);
        System.out.println(names);
    }
}
