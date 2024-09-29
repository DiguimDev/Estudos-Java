package academy.devdojo.maratonajava.javacore.ZZBpadroesdeprojetos.test;

import academy.devdojo.maratonajava.javacore.ZZBpadroesdeprojetos.dominio.AircraftSingletonLazy;

public class AircraftSingletonTest02 {
    public static void main(String[] args) {
    bookSeat("1A");
    bookSeat("1A");
    }
    //Sempre pega o mesmo Espaço em Memoria
    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonLazy.getInstance());
        AircraftSingletonLazy aircraft = AircraftSingletonLazy.getInstance();
        System.out.println(aircraft.bookSeat(seat));
    }
}
