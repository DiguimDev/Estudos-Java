package academy.devdojo.maratonajava.javacore.Wcomportamento.test;

import academy.devdojo.maratonajava.javacore.Wcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("Green", 2024), new Car("White", 2012), new Car("Red", 1995));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));;
        System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColor(cars, "White"));
        System.out.println(filterCarByColor(cars, "Red"));
        System.out.println(filterByAge(cars, 2020));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Green")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }
    private static List<Car> filterRedCar(List<Car> cars) {
        List<Car> redCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Red")) {
                redCars.add(car);
            }
        }
        return redCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }
    private static List<Car> filterByAge(List<Car> cars, int year) {
        List<Car> oldCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                oldCars.add(car);
            }
        }
        return oldCars;
    }

}
