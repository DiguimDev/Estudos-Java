package academy.devdojo.maratonajava.javacore.Vclassesinternas.test;

public class OuterClassesTest03 {
    private String nome = "Thauan";

    static class Nested {
        private String lastName = "Rodrigues";
        void print() {
            System.out.println(new OuterClassesTest03().nome + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
