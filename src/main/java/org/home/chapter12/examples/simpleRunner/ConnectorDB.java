package org.home.chapter12.examples.simpleRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

public class ConnectorDB {
    
    public static Connection getConnection() throws SQLException {
        ResourceBundle resource = ResourceBundle.getBundle("chapter12.examples.database");
        String url = resource.getString("db.url");
        String user = resource.getString("db.user");
        String pass = resource.getString("db.password");
        String autoReconnect = resource.getString("db.autoReconnect");
        String encoding = resource.getString("db.encoding");
        String useUnicode = resource.getString("db.useUnicode");
        Properties properties = new Properties();
        properties.put("user", user);
        properties.put("password", pass);
        properties.put("autoReconnect", autoReconnect);
        properties.put("characterEncoding", encoding);
        properties.put("useUnicode", useUnicode);
        return DriverManager.getConnection(url, properties);
    }
}
