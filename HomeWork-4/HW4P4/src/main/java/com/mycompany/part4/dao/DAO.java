/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part4.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author aksha
 */
public class DAO {

    private String driverURL;
    private String dbURL;
    private String username;
    private String password;

    public DAO() {
        driverURL = "com.mysql.jdbc.Driver";
        dbURL = "jdbc:mysql://localhost:3306/moviesdb";
        username = "root";
        password = "root";

        DbUtils.loadDriver(driverURL);
    }

    public Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbURL, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public void close(Connection connection) {
        if (connection != null) {
            try {
                DbUtils.close(connection);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
