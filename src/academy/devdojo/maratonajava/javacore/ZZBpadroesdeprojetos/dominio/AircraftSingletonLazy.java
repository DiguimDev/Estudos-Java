package academy.devdojo.maratonajava.javacore.ZZBpadroesdeprojetos.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonLazy {
    private static AircraftSingletonLazy INSTANCE;
    private final Set<String> availableSeats =  new HashSet<>();
    private final String name;

    public AircraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }
    public static AircraftSingletonLazy getInstance(){
        if(INSTANCE == null){
            synchronized (AircraftSingletonLazy.class){
                if(INSTANCE == null){
                    INSTANCE = new AircraftSingletonLazy("787-900");

                }
            }
        }
    return INSTANCE;
    }
    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }

}
