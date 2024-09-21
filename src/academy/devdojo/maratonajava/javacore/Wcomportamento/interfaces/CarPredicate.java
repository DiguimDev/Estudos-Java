package academy.devdojo.maratonajava.javacore.Wcomportamento.interfaces;

import academy.devdojo.maratonajava.javacore.Wcomportamento.dominio.Car;

public interface CarPredicate {
    // anonimas, funções, concisa;
    boolean test(Car car); // esse é o contrato da lambda;
    // (parametro) -> <expressão>
    // (Car car) -> car.getColor().equals("Green");
    // para utilizar lambdas precisa de uma interface Funcional, na qual so tem uma interface sem corpo;
}
