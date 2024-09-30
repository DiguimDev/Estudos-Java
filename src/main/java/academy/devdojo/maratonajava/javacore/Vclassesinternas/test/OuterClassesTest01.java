package academy.devdojo.maratonajava.javacore.Vclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Mnkey D. Luffy";
    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this); // o this faz referencia ao que esta dentro da propia classe.
            System.out.println(OuterClassesTest01.this); // agora ele faz referencia ao que esta dentro da classe outer.
        }
    }
    public static void main(String[] args) {
        OuterClassesTest01 outerClassesTest01 = new OuterClassesTest01();
        Inner inner = outerClassesTest01.new Inner();
        Inner inner1 = new OuterClassesTest01().new Inner();

        inner.printOuterClassAttribute();
        inner1.printOuterClassAttribute();
    }
}
