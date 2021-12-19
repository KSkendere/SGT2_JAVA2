package lesson23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

  final  String JDBC_CONNECTION = "jdbc";
  final String JDBC_USERNAMME ="";
  final String JDBC_PASSWORD = "";
  Connection connection = null;

// Empty connection
    public DBConnection() throws SQLException {
        connection = DriverManager.getConnection(JDBC_CONNECTION,JDBC_USERNAMME,JDBC_PASSWORD);
    }
}
