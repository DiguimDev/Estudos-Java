package academy.devdojo.maratonajava.javacore.ZZCjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZCjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZCjdbc.repository.ProducerRepositoryRowSet;
import academy.devdojo.maratonajava.javacore.ZZCjdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;
@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        List<Producer> nhk = ProducerServiceRowSet.findByNameJdbcRowSet("NHK");
        log.info(nhk);
    }
}
