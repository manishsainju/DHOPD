package com.dhopd.controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manish
 * M-Tech Nepal
 */

//CLASS FOR ADDING DELETEING AND UPDATING 
//ADD THE PATIENT INTO DB BY SENDING AND PATIENT OBJECT
//DELETE THE PATIENT FROM DB USING PATIENT_ID
//UPDATE THE PATIENT IN DB USING PATIENT_ID (PATIENT_ID CANNOT BE MODIFIED)

// patinetdbo pat= new patinet(mypatient);
// pat.add(); 
// pat.delete();
    
import com.dhopd.models.Patient;
import java.sql.*;
import javax.swing.JOptionPane;


public class PatientDBO {
 Connection con;
 
public PatientDBO(){
    
}


public void addPatient(Patient patient ){
    con = DBConnection.getConnection();
    String qry = "insert into history_table(patient_id,name,age,sex,dob,address,telephone,chief_complain,history_of_illness,past_history,general,systemine,local,lab,xray,ct,mri,soft_tissue,side,anatomic_location,sub_location,pathology,classification,other,mgmt_procedure,implant,mgmt_other,date) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
    try{
           PreparedStatement pst = con.prepareStatement(qry);
           //pst.executeQuery(qqq);
           pst.setInt(1, patient.getPatient_id());
           pst.setString(2, patient.getName());
           pst.setInt(3,patient.getAge());
           pst.setString(4, patient.getSex());
           pst.setString(5, patient.getDob());
           pst.setString(6, patient.getAddress());
           pst.setString(7, patient.getTelephone());
           pst.setString(8, patient.getChief_complain());
           pst.setString(9, patient.getHistory_of_illness());
           pst.setString(10, patient.getPast_history());
           pst.setString(11, patient.getGeneral());
           pst.setString(12, patient.getSystemine());
           pst.setString(13, patient.getLocal());
           pst.setString(14, patient.getLab());
           pst.setString(15, patient.getXray());
           pst.setString(16, patient.getCt());
           pst.setString(17, patient.getMri());
           pst.setString(18, patient.getSoft_tissue());
           pst.setString(19, patient.getSide());
           pst.setString(20, patient.getAnatomic_location());
           pst.setString(21, patient.getSub_location());
           pst.setString(22, patient.getPathalogical_lesion());
           pst.setString(23, patient.getClassification());
           pst.setString(24, patient.getOther());
           pst.setString(25, patient.getMgmt_procedure());
           pst.setString(26, patient.getImplant());
           pst.setString(27, patient.getMgmt_other());
           pst.setString(28, patient.getDate());
           
         
         pst.execute();
            con.close();
        JOptionPane.showMessageDialog(null, "Saved Successfully");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error Occured!!!");
    }
}

public Patient getPatient(int patient_id){
    Patient patient  = new Patient();
    try{

            con = DBConnection.getConnection();
            String query = "Select * from history_table where patient_id="+patient_id ;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
            JOptionPane.showMessageDialog(null, rs.getObject(1).toString());
             
            patient.setPatient_id(patient_id);  
            patient.setName(rs.getObject(2).toString()); 
            patient.setAge(Integer.parseInt(rs.getObject(3).toString()));
            patient.setSex(rs.getObject(4).toString());
            patient.setDob(rs.getObject(5).toString());
            patient.setAddress(rs.getObject(6).toString());
            patient.setTelephone(rs.getObject(7).toString());
            patient.setChief_complain(rs.getObject(8).toString());
            patient.setHistory_of_illness(rs.getObject(9).toString());
            patient.setPast_history(rs.getObject(10).toString());
            patient.setGeneral(rs.getObject(11).toString());
            patient.setSystemine(rs.getObject(12).toString());
            patient.setLocal(rs.getObject(13).toString());
            patient.setLab(rs.getObject(14).toString());
            patient.setXray(rs.getObject(15).toString());
            patient.setCt(rs.getObject(16).toString());
            patient.setMri(rs.getObject(17).toString());
            patient.setSoft_tissue(rs.getObject(18).toString());   
            patient.setSide(rs.getObject(19).toString());  
            patient.setAnatomic_location(rs.getObject(20).toString()); 
            patient.setSub_location(rs.getObject(21).toString());
            patient.setPathalogical_lesion(rs.getObject(22).toString()); 
            patient.setClassification(rs.getObject(23).toString());
            patient.setOther(rs.getObject(24).toString());
            patient.setMgmt_procedure(rs.getObject(25).toString());
            patient.setImplant(rs.getObject(26).toString());
            patient.setMgmt_other(rs.getObject(27).toString());
            patient.setDate(rs.getObject(28).toString());
     
            }
    }
    catch(Exception e){
         System.out.println(e);
    }
        
    
    
    
    return patient;
}




}