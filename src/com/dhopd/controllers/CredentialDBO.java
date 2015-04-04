/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dhopd.controllers;

import com.dhopd.models.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author manish
 * M-Tech Nepal
 */
public class CredentialDBO {

    Connection con;
    
    public CredentialDBO(){
        Connection con = DBConnection.getConnection();
        
    }
    
    
    public Credential getCredential(String name) throws SQLException{
     Connection con = DBConnection.getConnection();
        String qry = "select * from credential_table where username='"+name+"'";
        Credential credential = new Credential();
        Statement stmt = con.createStatement();
             ResultSet rst = stmt.executeQuery(qry);
             while(rst.next()){
                 credential.setLoginid(Integer.parseInt(rst.getObject(1).toString()));
                 
                 credential.setUsername(rst.getObject(2).toString());
                 credential.setPassword(rst.getObject(3).toString());
        
              }
    
     return credential;
    
    }


    





}