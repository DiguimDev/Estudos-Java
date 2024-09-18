package academy.devdojo.maratonajava.javacore.Ugenerics.test;

abstract class Animal{
    public abstract void consulta();
}
class Cachorro extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consultando o Dog");
    }
}
class Gato extends Animal{

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
    private static void printConsulta(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();
        }

    }
}
