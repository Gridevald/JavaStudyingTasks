package org.home.chapter12.examples.prepared;

import org.home.chapter12.examples.simpleRunner.Abonent;
import org.home.chapter12.examples.simpleRunner.ConnectorDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseHelper {
    
    private final static String SQL_INSERT = "INSERT INTO phonebook (id_phonebook, lastname, phone) VALUES (?, ?, ?)";
    private Connection connect;
    
    public DataBaseHelper() throws SQLException {
        connect = ConnectorDB.getConnection();
    }
    
    public PreparedStatement getPreparedStatement() {
        PreparedStatement ps = null;
        try {
            ps = connect.prepareStatement(SQL_INSERT);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ps;
    }
    
    public boolean insertAbonent(PreparedStatement ps, Abonent a) {
        boolean flag = false;
        try {
            ps.setInt(1, a.getId());
            ps.setString(2, a.getLastName());
            ps.setInt(3, a.getPhone());
            ps.execute();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }
    
    public void closeStatement(PreparedStatement ps) {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
