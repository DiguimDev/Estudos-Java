package academy.devdojo.maratonajava.javacore.ZZCjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZCjdbc.conn.ConectionFactory;
import academy.devdojo.maratonajava.javacore.ZZCjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZCjdbc.listener.CustomRowSetListener;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProducerRepositoryRowSet {
    public static List<Producer> findByNameJdbcRowSet(String name){
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        List<Producer> producers = new ArrayList<>();
        try(JdbcRowSet jrs = ConectionFactory.getJdbcRowSet()){
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setString(1, String.format("%%%s%%", name));
            jrs.execute();
            while(jrs.next()){
                Producer producer = Producer.builder()
                        .id(jrs.getInt("id"))
                        .name(jrs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
        e.printStackTrace();
        }
        return producers;
    }

//    public static void updateJdbcRowSet(Producer producer){
//        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";
//        try(JdbcRowSet jrs = ConectionFactory.getJdbcRowSet()){
//            jrs.setCommand(sql);
//            jrs.setString(1, producer.getName());
//            jrs.setInt(2, producer.getId());
//            jrs.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    public static void updateJdbcRowSet(Producer producer){
        String sql = "SELECT * FROM anime_store.producer WHERE (`id` = ?);";
        try(JdbcRowSet jrs = ConectionFactory.getJdbcRowSet()){
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setInt(1, producer.getId());
            jrs.execute();
            if(!jrs.next()) return;
            jrs.updateString("name", producer.getName());
            jrs.updateRow();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void updateCachedRowSet(Producer producer){
        String sql = "SELECT * FROM producer WHERE (`id` = ?);";
        try(CachedRowSet cs = ConectionFactory.getCachedRowSet();
        Connection connection = ConectionFactory.getConnection()){
            connection.setAutoCommit(false);
            cs.setCommand(sql);
            cs.setInt(1, producer.getId());
            cs.execute(connection);
            if(!cs.next()) return;
            cs.updateString("name", producer.getName());
            cs.updateRow();
            cs.acceptChanges();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
