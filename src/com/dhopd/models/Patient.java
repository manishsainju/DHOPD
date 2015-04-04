package com.dhopd.models;

import java.util.*;


public class Patient {
    
    //BASIC DATA OF THE PATIENT
    int hospital_no;
    int patient_id;

    
    
    String name;
    int age;
    String sex;
    String address;
    String telephone;
    String dob;
    
    //Presenting complains and History
    String chief_complain;
    String history_of_illness;
    String past_history;
    
    //EXAMINATION OF PATIENT
    String general;
    String systemine;
    String local;
    
    //INVESTIGATION
    String lab;
    String xray;
    String ct;
    String mri;
    
    
    //DIAGNOSIS
    String soft_tissue;
    String side;
    String anatomic_location;
    String sub_location;
    String pathalogical_lesion;
    String classification;
    String other;
    
    //MANAGEMENT
    String mgmt_procedure;
    String implant;
    String detail;
    String mgmt_other;
    String date;
 
    //getters
    public int getHospital_no() {
        return hospital_no;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public String getDob() {
        return dob;
    }

    public String getChief_complain() {
        return chief_complain;
    }

    public String getHistory_of_illness() {
        return history_of_illness;
    }

    public String getPast_history() {
        return past_history;
    }

    public String getGeneral() {
        return general;
    }

    public String getSystemine() {
        return systemine;
    }

    public String getLocal() {
        return local;
    }

    public String getLab() {
        return lab;
    }

    public String getXray() {
        return xray;
    }

    public String getCt() {
        return ct;
    }

    public String getMri() {
        return mri;
    }

    public String getSoft_tissue() {
        return soft_tissue;
    }

    public String getSide() {
        return side;
    }

    public String getAnatomic_location() {
        return anatomic_location;
    }

    public String getSub_location() {
        return sub_location;
    }

    public String getPathalogical_lesion() {
        return pathalogical_lesion;
    }

    public String getClassification() {
        return classification;
    }

    public String getOther() {
        return other;
    }

    public String getMgmt_procedure() {
        return mgmt_procedure;
    }

    public String getMgmt_other() {
        return mgmt_other;
    }

    public String getImplant() {
        return implant;
    }

    public String getDetail() {
        return detail;
    }

    public String getMgmt_Other() {
        return mgmt_other;
    }
    
    //setter
    public void setHospital_no(int hospital_no) {
        this.hospital_no = hospital_no;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setChief_complain(String chief_complain) {
        this.chief_complain = chief_complain;
    }

    public void setHistory_of_illness(String history_of_illness) {
        this.history_of_illness = history_of_illness;
    }

    public void setPast_history(String past_history) {
        this.past_history = past_history;
    }

    public void setGeneral(String general) {
        this.general = general;
    }

    public void setSystemine(String systemine) {
        this.systemine = systemine;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public void setXray(String xray) {
        this.xray = xray;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    public void setMri(String mri) {
        this.mri = mri;
    }

    public void setSoft_tissue(String soft_tissue) {
        this.soft_tissue = soft_tissue;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setAnatomic_location(String anatomic_location) {
        this.anatomic_location = anatomic_location;
    }

    public void setSub_location(String sub_location) {
        this.sub_location = sub_location;
    }

    public void setPathalogical_lesion(String pathalogical_lesion) {
        this.pathalogical_lesion = pathalogical_lesion;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public void setMgmt_procedure(String procedure) {
        this.mgmt_procedure = procedure;
    }

    public void setImplant(String implant) {
        this.implant = implant;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setMgmt_other(String other) {
        this.mgmt_other = other;
    }
    
    
    
    
    
    
}
