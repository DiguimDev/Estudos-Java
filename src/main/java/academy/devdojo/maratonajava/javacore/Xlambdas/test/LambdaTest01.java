package academy.devdojo.maratonajava.javacore.Xlambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Thauan", "Rodrigues", "goku");
        List<Integer> nums = List.of(1,2,3,4,5,6,76,8,9,12);
        forEach(strings, (String s) -> System.out.println(s));
        forEach(nums, (Integer i) -> System.out.println(i));
    }
    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T t : list) {
            consumer.accept(t);
        }

    }
}
