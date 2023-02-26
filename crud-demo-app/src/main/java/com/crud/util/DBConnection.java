/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author devzo
 */
public class DBConnection {

    public Connection getConnection() {
        Connection con = null;

        try {

            String url = "jdbc:mysql://localhost:3306/dinith_crud";
            String user = "root";
            String password = "123";

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Db connected success....");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("something went wrong....");
        }

        return con;
    }

}
