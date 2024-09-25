package academy.devdojo.maratonajava.javacore.Zoptional.Test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        //Tenta evitar um NullPointerException
        Optional<String> o1 = Optional.of("Sei la sem criatividade");
        System.out.println(o1);
        Optional<String> stringOptional = Optional.ofNullable(findName("Thauan"));
        stringOptional.orElse("EMPTY");
        System.out.println(stringOptional);
        stringOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }
    private static String findName(String name){
        List<String> list = List.of("Thauan", "Rodrigues");
        int i = list.indexOf(name);
        if(i != -1) return list.get(i);
        return null;
    }
}
