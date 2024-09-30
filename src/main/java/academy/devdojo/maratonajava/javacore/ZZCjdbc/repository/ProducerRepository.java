package academy.devdojo.maratonajava.javacore.ZZCjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZCjdbc.conn.ConectionFactory;
import academy.devdojo.maratonajava.javacore.ZZCjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer){
        String sql = "INSERT INTO `anime_store`. `producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try(Connection conn = ConectionFactory.getConnection();
            Statement stmt = conn.createStatement()){
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Database rows affected {}",rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
