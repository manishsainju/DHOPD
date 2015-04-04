package com.dhopd.controllers;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Satish
 */
public class DBConnection {
    
    public static Connection getConnection(){
        try{
             Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhopd", "manish", "likeastone");
        return con;
        
        }catch(Exception e){
             e.printStackTrace();
        }
        
    return null;
}
    
}