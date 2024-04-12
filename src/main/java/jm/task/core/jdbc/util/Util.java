package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {

    private static final String URL="jdbc:mysql://127.0.0.1:3306/user";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "123456";

    // реализуйте настройку соеденения с БД

    public static Connection getconnection() {
        Connection connection ;

        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
