/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FernandoMagro
 */
public class ConnectionFactory {
    
    String url = "jdbc:sqlite:database.db";
    //String user = "root";
    //String pass = "root";
    
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(url);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
}
