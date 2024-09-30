package academy.devdojo.maratonajava.javacore.ZZCjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZCjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZCjdbc.service.ProducerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConnectionFactoryTest01 {
    private static final Logger log = LogManager.getLogger(ConnectionFactoryTest01.class);

    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
       // ProducerService.update("Toei", 1);
        ProducerService.save(producer);
    }
}
