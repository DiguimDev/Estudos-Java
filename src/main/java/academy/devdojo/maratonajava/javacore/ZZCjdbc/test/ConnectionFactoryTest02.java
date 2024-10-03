package academy.devdojo.maratonajava.javacore.ZZCjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZCjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZCjdbc.repository.ProducerRepositoryRowSet;
import academy.devdojo.maratonajava.javacore.ZZCjdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;
@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().id(1).name("Toei").build();
        ProducerRepositoryRowSet.updateJdbcRowSet(producer);
        log.info("-------------------------------------------");

        List<Producer> nhk = ProducerServiceRowSet.findByNameJdbcRowSet("");
        log.info(nhk);
    }
}
