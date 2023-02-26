/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.businesslogic;

import com.crud.model.CustomerBean;
import com.crud.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author devzo
 */
public class CustomerLogic {
    
    
    
    public void addCustomer(CustomerBean bean) throws SQLException{ 
             System.out.println("inside of addCustomer");
            Connection con = null;
            try{
             con = new DBConnection().getConnection();
             String sql = "INSERT INTO tbl_customer (fname,lname,nic) VALUES (?,?,?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, bean.getFname());
                ps.setString(2, bean.getLname());
                ps.setString(3, bean.getNic());
                
                ps.execute();
                System.out.println("New customer inserted");
                
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                if(con != null){
                    con.close();
                }
            
            }
        
    }
    
    public void updateCustomer(){
    }
    
    public void searchCustomer(){
    }
    

    public void deleteCustomer(){
    }
    
    
}
