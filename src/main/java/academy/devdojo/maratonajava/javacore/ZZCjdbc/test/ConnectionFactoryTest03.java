package academy.devdojo.maratonajava.javacore.ZZCjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZCjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZCjdbc.service.ProducerService;

import java.util.List;

public class ConnectionFactoryTest03 {
    public static void main(String[] args) {
        Producer producer1 = Producer.builder().id(1).name("Toei Animation").build();
        Producer producer2 = Producer.builder().id(1).name("White Fox").build();
        Producer producer3 = Producer.builder().id(1).name("Studio Ghibli").build();

        ProducerService.saveTransaction(List.of(producer1, producer2, producer3));
    }
}
