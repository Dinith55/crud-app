/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.crud.demo.app;

import com.crud.util.DBConnection;

/**
 *
 * @author Dinith
 */
public class CrudDemoApp {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        DBConnection dbConnection = new DBConnection();
        dbConnection.getConnection();
    }
}
