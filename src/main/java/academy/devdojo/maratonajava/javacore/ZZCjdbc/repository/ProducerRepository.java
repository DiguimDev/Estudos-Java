package academy.devdojo.maratonajava.javacore.ZZCjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZCjdbc.conn.ConectionFactory;
import academy.devdojo.maratonajava.javacore.ZZCjdbc.dominio.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {
    public static void save(Producer producer){
        String sql = "INSERT INTO `anime_store`. `producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try(Connection conn = ConectionFactory.getConnection();
            Statement stmt = conn.createStatement()){
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
