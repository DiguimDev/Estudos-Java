package academy.devdojo.maratonajava.javacore.ZZAstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamsTest10 {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 2)
                .limit(24)
                .forEach(System.out::println);

        Stream.iterate(new int[]{0,1}, n -> new int []{n[1], n[0] + n[1]})
                .limit(20)
                .map(n -> n[0])
                .forEach(a -> System.out.print(a + " "));

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1, 20000))
                .limit(5)
                .forEach(System.out::println);
    }
}
