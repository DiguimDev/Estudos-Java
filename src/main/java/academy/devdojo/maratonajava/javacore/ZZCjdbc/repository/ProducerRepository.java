package academy.devdojo.maratonajava.javacore.ZZCjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZCjdbc.conn.ConectionFactory;
import academy.devdojo.maratonajava.javacore.ZZCjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`. `producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Insert producer '{}' in the database, rows affected {}", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
            e.printStackTrace();
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`. `producer` WHERE(`id` = '%s')".formatted(id);
        try (Connection conn = ConectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Delete producer '{}' in the database, rows affected {}", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", id, e);
        }
    }
    public static void update(Producer producer){
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d');".formatted(producer.getName(),producer.getId());
        try (Connection conn = ConectionFactory.getConnection();
        Statement stmt = conn.createStatement()){
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Update producer '{}' in the database, rows affected '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
        log.error("Error while trying to insert producer '{}'", producer.getId(), e);
        }
    }
    public static List<Producer> findAll(){
        log.info("Finding all producers");
        return findByName("");
    }
    public static List<Producer> findByName(String name){
        log.info("Finding producer");
        List<Producer> producers = new ArrayList<>();
        String sql = "SELECT * FROM anime_store.producer where name like '%s';"
                .formatted("%" + name + "%");
        try (Connection conn = ConectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){
            while(rs.next()){
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all services producer", e);
        }
        return producers;
    }

}
