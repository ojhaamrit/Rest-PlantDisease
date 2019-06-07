package org.amrit.api.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
    Connection connection = null;
    PreparedStatement preparedStatement = null;

    public void open() throws ClassNotFoundException, SQLException {
        Class.forName(DBConstant.DB_DRIVER_NAME);
        connection = DriverManager.getConnection(DBConstant.DB_URL, DBConstant.DB_USER_NAME, DBConstant.DB_PASSWORD);
    }

    public void close() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    public PreparedStatement preparedStatement(String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }
}
