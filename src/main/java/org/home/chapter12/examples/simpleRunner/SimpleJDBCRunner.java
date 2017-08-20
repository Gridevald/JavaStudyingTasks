package org.home.chapter12.examples.simpleRunner;

import java.sql.*;
import java.util.ArrayList;
//import java.util.Properties;

public class SimpleJDBCRunner {
    
    public static void main(String[] args) throws SQLException {
    
//        String url = "jdbc:mysql://localhost:3306/test_phones";
//        Properties properties = new Properties();
//        properties.put("user", "root");
//        properties.put("password", "pass");
//        properties.put("autoReconnect", "true");
//        properties.put("characterEncoding", "UTF-8");
//        properties.put("useUnicode", "true");
    
        Connection connection = null;
//        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        
        try {
//            connection = DriverManager.getConnection(url, properties);
            connection = ConnectorDB.getConnection();
            Statement statement = null;
            try {
                statement = connection.createStatement();
                ResultSet resultSet = null;
                try {
                    resultSet = statement.executeQuery("SELECT * FROM phonebook");
                    ArrayList<Abonent> abonents = new ArrayList<>();
                    while (resultSet.next()) {
                        int id = resultSet.getInt(1);
                        String lastName = resultSet.getString(2);
                        int phone = resultSet.getInt(3);
                        abonents.add(new Abonent(id, lastName, phone));
                    }
                    if (abonents.size() > 0) {
                        System.out.println(abonents);
                    } else {
                        System.out.println("Not found");
                    }
                } finally {
                    if (resultSet != null) {
                        resultSet.close();
                    } else {
                        System.err.println("FAIL reading BD.");
                    }
                }
            } finally {
                if (statement != null) {
                    statement.close();
                } else {
                    System.err.println("FAIL creating Statement.");
                }
            }
        } catch (SQLException e) {
            System.err.println("DB connection error: " + e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("FAIL closing connection: " + e);
                }
            }
        }
    }
}
