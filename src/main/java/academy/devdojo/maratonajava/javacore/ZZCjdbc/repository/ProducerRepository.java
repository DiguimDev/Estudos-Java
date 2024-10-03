package academy.devdojo.maratonajava.javacore.ZZCjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZCjdbc.conn.ConectionFactory;
import academy.devdojo.maratonajava.javacore.ZZCjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
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

    public static void saveTransaction(List<Producer> producers) {
        try (Connection conn = ConectionFactory.getConnection()){
            conn.setAutoCommit(false);
            preparedStatementSaveTransaction(conn, producers);
            conn.commit();
        } catch (SQLException e) {
            log.error("Error while trying to insert producers '{}'", producers, e);
        }
    }

    private static void preparedStatementSaveTransaction(Connection connection, List<Producer> producers) throws SQLException {
        String sql = "INSERT INTO `anime_store`. `producer` (`name`) VALUES ( ? );";
        for (Producer p : producers) {
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql);) {
                log.info("Saving producer {}", p.getName());
                preparedStatement.setString(1, p.getName());
                preparedStatement.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
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

    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d');".formatted(producer.getName(), producer.getId());
        try (Connection conn = ConectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Update producer '{}' in the database, rows affected '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getId(), e);
        }
    }

    public static void updatePrearedStatement(Producer producer) {
        try (Connection conn = ConectionFactory.getConnection();
             PreparedStatement ps = preparedStatementUpdate(conn, producer)) {
            int rowsAffected = ps.executeUpdate();
            log.info("Update producer '{}' in the database, rows affected '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement preparedStatementUpdate(Connection connection, Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, producer.getName());
        preparedStatement.setInt(2, producer.getId());
        return preparedStatement;
    }

    public static List<Producer> findAll() {
        log.info("Finding all producers");
        return findByName("");
    }

    public static List<Producer> findByName(String name) {
        log.info("Finding producer");
        List<Producer> producers = new ArrayList<>();
        String sql = "SELECT * FROM anime_store.producer where name like '%s';"
                .formatted("%" + name + "%");
        try (Connection conn = ConectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Producer producer = getProducer(rs);
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all services producer", e);
        }
        return producers;
    }

    public static List<Producer> findByNamePreparedStatement(String name) {
        log.info("Finding producer by name");
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConectionFactory.getConnection();
             PreparedStatement ps = preperadeStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery();
        ) {
            while (rs.next()) {
                Producer producer = getProducer(rs);
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all services producer", e);
        }
        return producers;
    }

    public static List<Producer> findByNameCallableStatement(String name) {
        log.info("Finding producer by name");
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConectionFactory.getConnection();
             PreparedStatement ps = callableStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery();
        ) {
            while (rs.next()) {
                Producer producer = getProducer(rs);
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all services producer", e);
        }
        return producers;
    }

    private static CallableStatement callableStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = "CALL `anime_store`.`sp_get_producer_by_name`(?);";
        CallableStatement callableStatement = connection.prepareCall(sql);
        callableStatement.setString(1, String.format("%%%s%%", name));
        return callableStatement;
    }

    private static PreparedStatement preperadeStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, String.format("%%%s%%", name));
        return preparedStatement;
    }

    public static void showProducerMetaData() {
        log.info("Showing Producer Metadata");
        String sql = "SELECT * FROM anime_store.producer;";
        try (Connection conn = ConectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData metaData = rs.getMetaData();
            rs.next();
            int columnCount = metaData.getColumnCount();
            log.info("Columns Count {}", columnCount);
            for (int i = 1; i <= columnCount; i++) {
                log.info("Table name '{}'", metaData.getTableName(i));
                log.info("Column name '{}'", metaData.getColumnName(i));
                log.info("Column size '{}'", metaData.getColumnDisplaySize(i));
                log.info("Column type '{}'", metaData.getColumnTypeName(i));
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all services producer", e);
        }
    }

    public static void showDriverMetaData() {
        log.info("Showing Driver Metadata");
        try (Connection conn = ConectionFactory.getConnection()) {
            DatabaseMetaData dbMetaData = conn.getMetaData();
            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Supports TYPE FORWARD ONLY");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And Supports CONCLUR_UPDATABLE");
                }
            }
            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And Supports CONCLUR_UPDATABLE");
                }
            }
            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And Supports CONCLUR_UPDATABLE");
                }
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all services producer", e);
        }
    }

    public static void showTypeScrollWorking() {
        String sql = "SELECT * FROM anime_store.producer;";
        try (Connection conn = ConectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            log.info("Is on Last Line {} ", rs.last());
            log.info("Is on Last Line? {} ", rs.isLast());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Is on First Line {} ", rs.first());
            log.info("Is on First Line {} ? ", rs.isFirst());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            rs.afterLast();
            log.info("Is on Last Line {} ?", rs.isAfterLast());
            while (rs.previous()) {
                log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all services producer", e);
        }
    }

    public static List<Producer> findByNameAndUpdateToUppercase(String name) {
        log.info("Finding and update producer");
        List<Producer> producers = new ArrayList<>();
        String sql = "SELECT * FROM anime_store.producer where name like '%s';"
                .formatted("%" + name + "%");
        try (Connection conn = ConectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                rs.updateString("name", rs.getString("name").toUpperCase());
                rs.updateRow();
                Producer producer = getProducer(rs);
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all services producer", e);
        }
        return producers;
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        log.info("Finding and update producer");
        List<Producer> producers = new ArrayList<>();
        String sql = "SELECT * FROM anime_store.producer where name like '%s';"
                .formatted("%" + name + "%");
        try (Connection conn = ConectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            if (!rs.next()) {
                insertNewProducer(name, rs);
                getProducer(rs);
                producers.add(getProducer(rs));
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all services producer", e);
        }
        return producers;
    }

    private static void insertNewProducer(String name, ResultSet rs) throws SQLException {
        rs.moveToInsertRow();
        rs.updateString("name", name);
        rs.insertRow();
        rs.beforeFirst();
        rs.next();
    }

    private static Producer getProducer(ResultSet rs) throws SQLException {
        return Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
    }


}
