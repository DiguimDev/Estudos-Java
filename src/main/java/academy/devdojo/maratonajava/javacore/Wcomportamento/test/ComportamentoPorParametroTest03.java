package academy.devdojo.maratonajava.javacore.Wcomportamento.test;

import academy.devdojo.maratonajava.javacore.Wcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.Wcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(new Car("Green", 2024), new Car("White", 2012), new Car("Red", 1995));

    public static void main(String[] args) {

        List<Car> whiteCar = filter(cars, car -> car.getColor().equals("White"));
        List<Car> redCar = filter(cars, car -> car.getColor().equals("Red"));
        List<Car> ageCar = filter(cars, car -> car.getYear() < 2017);
        System.out.println(whiteCar);
        System.out.println(redCar);
        System.out.println(ageCar);

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,87,8);
        System.out.println(filter(numbers, num -> num % 2 == 0));
        List<String> names = List.of("Thauan","Rodrigues", "Maria", "Josué");
        System.out.println("-------------------");
        System.out.println(names);
    }


    private static <T> List<T> filter(List<T> t, Predicate<T> tPredicate){
        List<T> filter = new ArrayList<>();
        for (T especificFilter: t){
            if(tPredicate.test(especificFilter)){
                filter.add(especificFilter);
            }
        }
        return filter;
    }
}


