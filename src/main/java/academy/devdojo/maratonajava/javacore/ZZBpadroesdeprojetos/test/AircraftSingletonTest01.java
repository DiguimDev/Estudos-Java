package academy.devdojo.maratonajava.javacore.ZZBpadroesdeprojetos.test;

import academy.devdojo.maratonajava.javacore.ZZBpadroesdeprojetos.dominio.Aircraft;
import academy.devdojo.maratonajava.javacore.ZZBpadroesdeprojetos.dominio.AircraftSingletonEager;

public class AircraftSingletonTest01 {
    public static void main(String[] args) {
    bookSeat("1A");
    bookSeat("1A");
    }
    //Sempre pega o mesmo Espaço em Memoria
    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getInstance());
        AircraftSingletonEager aircraft = AircraftSingletonEager.getInstance();
        System.out.println(aircraft.bookSeat(seat));
    }
}
