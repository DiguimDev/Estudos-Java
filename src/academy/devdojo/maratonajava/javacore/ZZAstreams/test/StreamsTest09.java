package academy.devdojo.maratonajava.javacore.ZZAstreams.test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 49).filter(n -> n%2 != 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        IntStream.range(1, 49).filter(n -> n%2 != 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        Stream.of("Eleve", " O", " Cosmo", " No", " Seu", " Coração")
                .map(String::toUpperCase)
                .forEach(System.out::print);

        int[] num = {1,2,3,4,5,6};

        Arrays.stream(num)
                .forEach(System.out::println);
    }
}
