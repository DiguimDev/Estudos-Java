package academy.devdojo.maratonajava.javacore.ZZBpadroesdeprojetos.test;

import academy.devdojo.maratonajava.javacore.ZZBpadroesdeprojetos.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("Thauan")
                .lastName("Rodrigues")
                .userName("TH")
                .email("Seila@gmail.com")
                .build();

        System.out.println(build);
    }
}
