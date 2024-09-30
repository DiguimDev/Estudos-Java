package academy.devdojo.maratonajava.javacore.ZZAstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamsTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigner = List.of("Thalles", "Maria", "Thaynara");
        List<String> developers = List.of("Thauan Rodrigues", "Pedro", "Pedrinho");
        List<String> students = List.of("Lua", "Giovanny", "Andressa", "Davi");
        devdojo.add(graphicDesigner);
        devdojo.add(developers);
        devdojo.add(students);
        for (List<String> strings : devdojo) {
            for (String string : strings) {
                System.out.println(string);
            }

        }
        System.out.println("---------------------");
        devdojo.stream() //flat map utilizado para tirar atributos aninhados;
                .flatMap(Collection::stream).forEach(System.out::println);

    }
}
