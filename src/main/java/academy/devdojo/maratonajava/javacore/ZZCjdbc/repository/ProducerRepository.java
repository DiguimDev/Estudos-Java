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
            log.info("Insert producer '{}' in the database, rows affected {}",producer.getName(),rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'",producer.getName(),e);
            e.printStackTrace();
        }
    }
    public static void delete(int id){
        String sql = "DELETE FROM `anime_store`. `producer` WHERE(`id` = '%s')".formatted(id);
        try(Connection conn = ConectionFactory.getConnection();
            Statement stmt = conn.createStatement()){
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Delete producer '{}' in the database, rows affected {}",id,rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", id, e);
            e.printStackTrace();
        }
    }
}
