package academy.devdojo.maratonajava.javacore.Wcomportamento.test;

import academy.devdojo.maratonajava.javacore.Wcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.Wcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("Green", 2024), new Car("White", 2012), new Car("Red", 1995));

    public static void main(String[] args) { //Utilizando Classes anônimas
        List<Car> green = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("Green");
            }
        });
        System.out.println(green);

        System.out.println("------------------------------");

        List<Car> whiteCar = filter(cars, car -> car.getColor().equals("White"));
        List<Car> redCar = filter(cars, car -> car.getColor().equals("Red"));
        List<Car> ageCar = filter(cars, car -> car.getYear() < 2017);
        System.out.println(whiteCar);
        System.out.println(redCar);
        System.out.println(ageCar);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

}


