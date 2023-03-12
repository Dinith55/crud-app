/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dinith
 */
public class DBConnection {
    
    public Connection getConnection(){
        Connection con = null;
        
        try {
            
            String url = "jdbc:mysql://localhost:3306/test_crud";
            String user = "root";
            String password = "123";
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
        
        return con;
    }
    
}
