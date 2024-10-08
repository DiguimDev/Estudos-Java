package academy.devdojo.maratonajava.javacore.Xlambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Natsu", "Goku", "Naruto", "Ichigo");
        List<Integer> map = map(strings, String::length);
        List<String> upper = map(strings, String::toUpperCase);
        List<String> lower = map(strings, String::toLowerCase);
        System.out.println(map);
        System.out.println(upper);
        System.out.println(lower);
    }
    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for(T e: list){
            R apply = function.apply(e);
            result.add(apply);
        }
        return result;
    }
}
