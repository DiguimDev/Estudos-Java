package academy.devdojo.maratonajava.javacore.Vclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Naruto";

    void print(){
        final String lastName = "Uzumaki";
        final class LocalClass{
            public void printLocal(){
                System.out.println(name + " " + lastName);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }
    public static void main(String[] args) {
        OuterClassesTest02 outerClassesTest02 = new OuterClassesTest02();
        outerClassesTest02.print();
    }
}
