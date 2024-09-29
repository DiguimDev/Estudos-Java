package academy.devdojo.maratonajava.javacore.ZZBpadroesdeprojetos.test;

import academy.devdojo.maratonajava.javacore.ZZBpadroesdeprojetos.dominio.AircraftSingletonEnum;
import academy.devdojo.maratonajava.javacore.ZZBpadroesdeprojetos.dominio.AircraftSingletonLazy;

public class CraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }
    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }
}
