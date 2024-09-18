package academy.devdojo.maratonajava.javacore.Ugenerics.test;

abstract class animal{
    public abstract void consulta();
}
class Cachorro extends animal{
    @Override
    public void consulta() {
        System.out.println("Consultando o Dog");
    }
}
class Gato extends animal{

    @Override
    public void consulta() {
        System.out.println("Consultando o gatinho");
    }
}
public class WildCardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos    = {new Gato(),new Gato()};
        printConsulta(cachorros);
        printConsulta(gatos);
    }
    private static void printConsulta(animal[] animals){
        for (animal animal : animals) {
            animal.consulta();
        }

    }
}
