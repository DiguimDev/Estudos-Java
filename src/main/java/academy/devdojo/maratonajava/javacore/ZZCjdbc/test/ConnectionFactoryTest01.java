package academy.devdojo.maratonajava.javacore.ZZCjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZCjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZCjdbc.service.ProducerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ConnectionFactoryTest01 {
    private static final Logger log = LogManager.getLogger(ConnectionFactoryTest01.class);

    public static void main(String[] args) {
       // Producer producer = Producer.builder().name("Studios Gible").build();
       // ProducerService.save(producer);
        List<Producer> producerList = ProducerService.findByName("NHK");
        List<Producer> producerLists = ProducerService.findAll();
        log.info(producerLists);

    }
}
