package academy.devdojo.maratonajava.javacore.ZZAstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsTest05 {
    public static void main(String[] args) {
        // quando ver algo aninhado em streams usar flatmap
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
       List<String> letter2 =  words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(letter2);
    }
}
