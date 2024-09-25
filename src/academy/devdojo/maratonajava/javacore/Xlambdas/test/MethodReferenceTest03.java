package academy.devdojo.maratonajava.javacore.Xlambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> namelist = new ArrayList<>(List.of("Rich", "Beautiful", "Lucky"));
        namelist.sort(String::compareTo);
        System.out.println(namelist);
        Function<String, Integer> numString = Integer::parseInt;
        System.out.println(numString.apply("10"));

        BiPredicate<List<String>, String> checkname = List::contains;
        System.out.println(checkname.test(namelist, "Rich"));
    }
}
