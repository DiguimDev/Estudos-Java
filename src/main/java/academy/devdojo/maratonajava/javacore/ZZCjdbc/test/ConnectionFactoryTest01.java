package academy.devdojo.maratonajava.javacore.ZZCjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZCjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZCjdbc.repository.ProducerRepository;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.ProducerBuilder
                .builder()
                .name("NHK").build();
        ProducerRepository.save(producer);
    }
}
