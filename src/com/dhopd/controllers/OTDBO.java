package com.dhopd.controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.dhopd.models.OperationTeam;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import com.dhopd.models.*;
import com.dhopd.controllers.*;
import com.dhopd.views.*;
/**
 *
 * @author manish
 * M-Tech Nepal
 */
public class OTDBO {
    

     
           
    public OTDBO(){
         
         
         
         
  }

     
     public void addOT(OperationTeam otteam) throws SQLException{
         try{
             Connection conn = DBConnection.getConnection();
         String qry = "insert into operation_table(patient_id,surgeon1,surgeon2,assistant1,assistant2,nurse1,nurse2,anesthesiologist,anesassistant1,anesassistant2,anesnurse,type_of_anesthia,ot_date,finding,oper_procedure,remark) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
         PreparedStatement pst = conn.prepareStatement(qry);
         
         pst.setInt(1,otteam.getPatient_id());
         pst.setString(2,otteam.getSurgeon1());
         pst.setString(3,otteam.getSurgeon2());
         
         pst.setString(4,otteam.getAssistant1());
         pst.setString(5,otteam.getAssistant2());
         
         
         
         pst.setString(6,otteam.getNurse1());
         pst.setString(7,otteam.getNurse2());
         
         pst.setString(8,otteam.getAnesthesiologist());
         pst.setString(9,otteam.getAnesassistant1());
         pst.setString(10,otteam.getAnesassistant2());
         pst.setString(11,otteam.getAnesnurse());
         
         pst.setString(12,otteam.getType_of_anesthia());
         pst.setString(13,otteam.getOt_date());
         
         pst.setString(14,otteam.getFinding());
         JOptionPane.showMessageDialog(null, otteam.getFinding());
         
         pst.setString(15,otteam.getProcedure());
         JOptionPane.showMessageDialog(null, otteam.getProcedure());
         
         pst.setString(16,otteam.getRemark());
         
         pst.execute();
         
         conn.close();
         JOptionPane.showMessageDialog(null, "Updated");
         }
         
        catch(Exception e){
            e.printStackTrace();
        }
         
         
         
           
     
     }

     public void update(OperationTeam otteam) throws SQLException{
        String qry = "update operation_table set surgeon1=?,surgeon2=?,assistant1=?,assistant2=?,nurse1=?,nurse2=?,anesthesiologist=?,anesassistant1=?,anesassistant2=?,anesnurse=?,type_of_anesthia=?,ot_date=?,finding=?,oper_procedure=?,remark=? where patient_id=?";
        try{
            Connection con = DBConnection.getConnection();
        
        PreparedStatement pst = con.prepareStatement(qry);
        
         pst.setInt(16,otteam.getPatient_id());
         pst.setString(1,otteam.getSurgeon1());
         pst.setString(2,otteam.getSurgeon2());
         
         pst.setString(3,otteam.getAssistant1());
         pst.setString(4,otteam.getAssistant2());
         
         
         
         pst.setString(5,otteam.getNurse1());
         pst.setString(6,otteam.getNurse2());
         
         pst.setString(7,otteam.getAnesthesiologist());
         pst.setString(8,otteam.getAnesassistant1());
         pst.setString(9,otteam.getAnesassistant2());
         pst.setString(10,otteam.getAnesnurse());
         
         pst.setString(11,otteam.getType_of_anesthia());
         pst.setString(12,otteam.getOt_date());
         pst.setString(13,otteam.getFinding());
         pst.setString(14,otteam.getProcedure());
         pst.setString(15,otteam.getRemark());
         
         pst.execute();
         
         con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
         
     }
     
     
     
     public OperationTeam getOtteam(int patientId){
        Connection con;
         OperationTeam otteam = new OperationTeam();
         try{
             String qry ="Select * from operation_table where patient_id="+patientId;
             con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rst = stmt.executeQuery(qry);
             while(rst.next()){
                 otteam.setPatient_id(Integer.parseInt(rst.getObject(1).toString()));
                 
                 otteam.setSurgeon1(rst.getObject(2).toString());
                 otteam.setSurgeon2(rst.getObject(3).toString());
                 otteam.setAssistant1(rst.getObject(4).toString());
                 otteam.setAssistant2(rst.getObject(5).toString());
                 otteam.setNurse1(rst.getObject(6).toString());
                 otteam.setNurse2(rst.getObject(7).toString());
                 
                 otteam.setAnesthesiologist(rst.getObject(8).toString());
                 otteam.setAnesassistant1(rst.getObject(9).toString());
                 otteam.setAnesassistant2(rst.getObject(10).toString());
                 otteam.setAnesnurse(rst.getObject(11).toString());
                 otteam.setType_of_anesthia(rst.getObject(12).toString());
                 otteam.setOt_date(rst.getObject(13).toString());
                 otteam.setFinding(rst.getObject(14).toString());
                 otteam.setProcedure(rst.getObject(15).toString());
                 otteam.setRemark(rst.getObject(16).toString());
                 
                 
                 
             }
         }
     catch(Exception e){
        e.printStackTrace();
    }
         return otteam;
     }

}
