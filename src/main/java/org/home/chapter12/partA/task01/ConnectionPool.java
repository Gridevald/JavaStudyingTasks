package org.home.chapter12.partA.task01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class ConnectionPool {
    
    private static final int POOL_SIZE = 8;
    
    private static List<Connection> pool;
    
    private static void makePool() {
        ResourceBundle res = ResourceBundle.getBundle("chapter12.partA.task01.db");
        String url = res.getString("db.url");
        String user = res.getString("db.user");
        
//        String pass = "pass";
        String pass = null;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter password: ");
            pass = scanner.next();
        }
        
        String autoReconnect = res.getString("db.autoReconnect");
        String encoding = res.getString("db.encoding");
        String useUnicode = res.getString("db.useUnicode");
        Properties properties = new Properties();
        properties.put("user", user);
        properties.put("password", pass);
        properties.put("autoReconnect", autoReconnect);
        properties.put("characterEncoding", encoding);
        properties.put("useUnicode", useUnicode);
        pool = new ArrayList<>();
        for (int i = 0; i < POOL_SIZE; i++) {
            try {
                pool.add(DriverManager.getConnection(url, properties));
            } catch (SQLException e) {
                System.err.println("Looks like password is wrong. Or something else happened...");
                break;
            }
        }
    }
    
    public static Connection getConnection() throws SQLException{
        if (pool == null) {
            makePool();
        }
        if (pool.size() > 0) {
            Connection temp = pool.get(pool.size() - 1);
            pool.remove(pool.size() - 1);
            return temp;
        } else {
            throw new SQLException("Pool is empty");
        }
    }
    
    public static void returnConnection(Connection connection) {
        if (pool.size() < POOL_SIZE) {
            pool.add(connection);
        } else {
            System.err.println("Pool is already fool.");
        }
    }
}
