package org.home.chapter12.examples.prepared;

import org.home.chapter12.examples.simpleRunner.Abonent;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class PreparedJDBCRunner {
    
    public static void main(String[] args) {
        ArrayList<Abonent> abonents = new ArrayList<Abonent>() {
            {
                add(new Abonent(10, "abonent10", 101010));
                add(new Abonent(11, "abonent11", 111111));
                add(new Abonent(12, "abonent12", 121212));
            }
        };
        
        DataBaseHelper helper = null;
        PreparedStatement statement = null;
        
        try {
            helper = new DataBaseHelper();
            statement = helper.getPreparedStatement();
            for (Abonent a : abonents) {
                helper.insertAbonent(statement, a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            assert helper != null;
            helper.closeStatement(statement);
        }
    }
}
