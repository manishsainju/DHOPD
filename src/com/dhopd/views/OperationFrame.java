package com.dhopd.views;


import com.dhopd.controllers.PatientDBO;
import com.dhopd.controllers.OTDBO;
import com.dhopd.models.OperationTeam;
import com.dhopd.models.Patient;
import java.awt.Dimension;
import java.awt.Toolkit;

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
public class OperationFrame extends javax.swing.JFrame {

    /**
     * Creates new form OperationFrame
     */
    
    int patientId;
    OperationTeam ot = new OperationTeam();
    OTDBO oto = new OTDBO();
    
    
    
    public OperationFrame() {
        initComponents();
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setVisible(true);
    }
    
    
    
    OperationFrame(int id,boolean flag){
        initComponents();
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setVisible(true);
        patientId = id;
        Jbtnupdate.setVisible(false);
        Patient patient = new Patient();
        
       
        
        
        
        
        PatientDBO pdbo = new PatientDBO();
        
        patient = pdbo.getPatient(patientId);
        

            // SETTING Value In Forms
            
            Jpatient_id.setText(Integer.toString(patient.getPatient_id()));
            Jname.setText(patient.getName());
            Jage.setText(Integer.toString(patient.getAge()));
            Jsex.setText(patient.getSex());
            Jdob.setText(patient.getDob());
            Jaddress.setText(patient.getAddress());
            Jtelephone.setText(patient.getTelephone());
            Jsoft_tissue.setSelectedItem((Object) patient.getSoft_tissue());
            Jside.setSelectedItem((Object) patient.getSide());
            Janatomic_location.setSelectedItem((Object) patient.getAnatomic_location());
            Jsub_location.setSelectedItem((Object) patient.getSub_location());
            Jpathology.setSelectedItem((Object) patient.getPathalogical_lesion());
            Jclassification.setText((String) patient.getClassification());
            Jother.setText((String) patient.getOther());
            
            Jprocedure.setSelectedItem((Object) patient.getMgmt_procedure());
            Jimplant.setSelectedItem((Object) patient.getImplant());
            
            Jdate.setText(patient.getDate());
            Jmgmt_other.setText(patient.getMgmt_Other());
            
            
            
//        ot.setSurgeon1(Jsurgeon_1.getText());
//        ot.setSurgeon2(Jsurgeon_2.getText());
//        ot.setAssistant1(Jassistant_1.getText());
//        ot.setAssistant2(Jassistant_2.getText());
//        ot.setNurse1(Jnurse_1.getText());
//        ot.setNurse2(Jnurse_2.getText());
//        ot.setAnesthesiologist(Janesthesiologist.getText());
//        ot.setAnesassistant1(Janes_assistant1.getText());
//        ot.setAnesassistant2(Janes_assistant2.getText());
//        ot.setAnesnurse(Janes_nurse.getText());
//        ot.setProcedure(Joper_procedure.getText());
//        System.out.println("Sending procedure value from ot operation "+ot.getProcedure());
//        ot.setFinding(Jfinding.getText());
//        System.out.println(ot.getFinding());
//        
//        ot.setOt_date(Jdate.getText());
//        ot.setType_of_anesthia(Jtype_of_anesthia.getText());
//        ot.setRemark(Jremarks.getText());
//        ot.setPatient_id(patientId);
            
    }

    OperationFrame(int id){
        initComponents();
        setVisible(true);
        Jbtnsave.setVisible(false);
        patientId = id;
        Patient patient = new Patient();
        
        PatientDBO pdbo = new PatientDBO();
        
        patient = pdbo.getPatient(patientId);
        // SETTING Value In Forms
            
            Jpatient_id.setText(Integer.toString(patient.getPatient_id()));
            Jname.setText(patient.getName());
            Jage.setText(Integer.toString(patient.getAge()));
            Jsex.setText(patient.getSex());
            Jdob.setText(patient.getDob());
            Jaddress.setText(patient.getAddress());
            Jtelephone.setText(patient.getTelephone());
            Jsoft_tissue.setSelectedItem((Object) patient.getSoft_tissue());
            Jside.setSelectedItem((Object) patient.getSide());
            Janatomic_location.setSelectedItem((Object) patient.getAnatomic_location());
            Jsub_location.setSelectedItem((Object) patient.getSub_location());
            Jpathology.setSelectedItem((Object) patient.getPathalogical_lesion());
            Jclassification.setText((String) patient.getClassification());
            Jother.setText((String) patient.getOther());
           
            Jprocedure.setSelectedItem((Object) patient.getMgmt_procedure());
            Jimplant.setSelectedItem((Object) patient.getImplant());
            
            Jdate.setText(patient.getDate());
            Jmgmt_other.setText(patient.getMgmt_Other());
            
            
        //set new value to ot team from form    
        
        
        OTDBO otdbo = new OTDBO();
        OperationTeam otteam = new OperationTeam();
        otteam = otdbo.getOtteam(patientId);
        Jsurgeon_1.setText(otteam.getSurgeon1());
        Jsurgeon_2.setText(otteam.getSurgeon2());
        Jassistant_1.setText(otteam.getAssistant1());
        Jassistant_2.setText(otteam.getAssistant2());
        Jnurse_1.setText(otteam.getNurse1());
        Jnurse_2.setText(otteam.getNurse2());
        Janesthesiologist.setText(otteam.getAnesthesiologist());
        Janes_assistant1.setText(otteam.getAnesassistant1());
        Janes_assistant2.setText(otteam.getAnesassistant2());
        Janes_nurse.setText(otteam.getAnesnurse());
        Joper_procedure.setText(otteam.getProcedure());
        Jfinding.setText(otteam.getFinding());
        Jtype_of_anesthia.setText(otteam.getType_of_anesthia());
        Jremarks.setText(otteam.getRemark());
        Jot_date.setText(otteam.getOt_date());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Jpatient_id = new javax.swing.JTextField();
        Jname = new javax.swing.JTextField();
        Jage = new javax.swing.JTextField();
        Jsex = new javax.swing.JTextField();
        Jdob = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jaddress = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        Jtelephone = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Jsurgeon_1 = new javax.swing.JTextField();
        Jsurgeon_2 = new javax.swing.JTextField();
        Jassistant_1 = new javax.swing.JTextField();
        Jassistant_2 = new javax.swing.JTextField();
        Jnurse_1 = new javax.swing.JTextField();
        Jnurse_2 = new javax.swing.JTextField();
        Janes_assistant1 = new javax.swing.JTextField();
        Janes_assistant2 = new javax.swing.JTextField();
        Janes_nurse = new javax.swing.JTextField();
        Jtype_of_anesthia = new javax.swing.JTextField();
        Jot_date = new javax.swing.JTextField();
        Janesthesiologist = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        Jsoft_tissue = new javax.swing.JComboBox();
        Jside = new javax.swing.JComboBox();
        Janatomic_location = new javax.swing.JComboBox();
        Jsub_location = new javax.swing.JComboBox();
        Jpathology = new javax.swing.JComboBox();
        Jclassification = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        Jother = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        Jdate = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        Jmgmt_other = new javax.swing.JTextField();
        Jprocedure = new javax.swing.JComboBox();
        Jimplant = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Jfinding = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Joper_procedure = new javax.swing.JTextArea();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Jremarks = new javax.swing.JTextArea();
        Jbtnsave = new javax.swing.JButton();
        Jbtnupdate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Operation Module");

        jPanel2.setBackground(new java.awt.Color(236, 236, 231));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Introduction", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel9.setText("Hospital No:");

        jLabel10.setText("Name:");

        jLabel11.setText("Age:");

        jLabel12.setText("Sex:");

        jLabel13.setText("Dob");

        Jname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JnameActionPerformed(evt);
            }
        });

        Jage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JageActionPerformed(evt);
            }
        });

        jLabel7.setText("Address");

        Jaddress.setColumns(20);
        Jaddress.setRows(5);
        jScrollPane1.setViewportView(Jaddress);

        jLabel8.setText("Telephone");

        Jtelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtelephoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jpatient_id, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jname))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jage, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(Jsex, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jdob)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jtelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Jtelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Jpatient_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Jname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Jage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(Jsex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(Jdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel14.setText("OPERATION MODULE");

        jPanel3.setBackground(new java.awt.Color(236, 236, 231));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OT Team", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jLabel1.setText("Surgeon 1");

        jLabel15.setText("Surgeon 2");

        jLabel16.setText("Assistant 1");

        jLabel17.setText("Assistant 2");

        jLabel18.setText("Nurse 1");

        jLabel19.setText("Nurse 2");

        Jsurgeon_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jsurgeon_1ActionPerformed(evt);
            }
        });

        jLabel20.setText("Anesthesiologist");

        jLabel21.setText("Anes. Assistant1");

        jLabel22.setText("Anes. Assistant2");

        jLabel23.setText("Anes. Nurse");

        jLabel24.setText("Type of Anesthia");

        jLabel25.setText("OT Date");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jsurgeon_1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel16)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jsurgeon_2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jassistant_1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jassistant_2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jnurse_1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jnurse_2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Janesthesiologist, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Janes_assistant1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Janes_assistant2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Janes_nurse, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jtype_of_anesthia, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jot_date, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel15, jLabel16, jLabel17, jLabel18, jLabel19});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Jsurgeon_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Janesthesiologist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jsurgeon_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(Janes_assistant1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jassistant_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(Janes_assistant2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jassistant_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(Janes_nurse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jnurse_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(Jtype_of_anesthia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jnurse_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(Jot_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)))
        );

        jPanel5.setBackground(new java.awt.Color(236, 236, 231));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Diagnosis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jPanel6.setBackground(new java.awt.Color(236, 236, 231));

        jLabel26.setText("Soft Tissue");

        jLabel27.setText("Side");

        jLabel28.setText("Anatomic Location");

        jLabel29.setText("Sub location");

        jLabel30.setText("Pathology");

        jLabel31.setText("Classification");

        jLabel32.setText("Other");

        Jsoft_tissue.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CLOSED", "G I", "G II", "G III A", "G III B", "G III C", "SPECIAL" }));

        Jside.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Right", "Left", "Bilateral", "Spine", "Pelvis" }));

        Janatomic_location.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ANKLE", "ARM", "BB FOREARM", "CALF", "CLAVICLE", "DORSAL SPINE", "ELBOW", "FEMUR", "FIBULA", "FLANK", "FOOT", "HAND", "HIP", "HUMERUS", "KNEE", "LEG", "LUMBAR SPINE", "ILIUM", "ISCHIUM", "PUBIS", "ACETABULUM", "RADIUS", "SHOULDER", "TIBIA", "ULNA", "WRIST" }));

        Jsub_location.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC JOINT", "ACETABULUM", "LEVEL ", "DISTAL", "INTERTROCHANTERIC", "INTERCONDYLAR", "ILIAC BLADE", "JOINT", "LATERAL CONDYLE", "LATERAL END", "LATERAL MALLEOLUS", "METACARPLE", "MEDIAL CONDYLE", "MEDIAL EPICONDYLE", "MENISCUS LATERAL ", "MENISCUS MEDIAL", "OLECARNON", "PARAVERTEBRAL", "PATELLA", "PHALYNX NO:", "PILON", "PLATEAU", "POPLITEAL", "PRE PATELLAR", "RAMI", "SHAFT", "SOFT TISSUE", "STYLOID PROCESS", "SUBTALAR JOINT", "SUBTROCHANTERIC", "SUPRACONDYLAR", "NECK ", "TUBERCULOSIS", "TIBIO TALAR", "TOE NO:", "METATARSAL NO:", "LUMBAR NO:", "DORSAL NO:" }));

        Jpathology.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FRACTURE", "DISLOCATION", "OSTEOMYELITIS", "SEPTIC ARTHRITIS", "SUBLUXATION", "REACTIVE ARTHRITIS", "ARTHRITIS", "TUBERCULOSIS", "INJURY", "WOUND", "CONTUSION", "ABRASSION", "TUMOR" }));

        Jclassification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JclassificationActionPerformed(evt);
            }
        });

        Jother.setColumns(20);
        Jother.setRows(3);
        jScrollPane5.setViewportView(Jother);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel27))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(Jsoft_tissue, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Jside, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel30)
                                .addComponent(jLabel31)
                                .addComponent(Jpathology, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Jclassification, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(Janatomic_location, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(Jsub_location, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel32)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jsoft_tissue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jside, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Janatomic_location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jsub_location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Jpathology, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jclassification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(236, 236, 231));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Management", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel33.setText("Procedure");

        jLabel34.setText("Other");

        jLabel35.setText("Implant");

        jLabel36.setText("Date");

        Jprocedure.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AMPUTATION", "ARTHRODESIS", "ARTHROSCOPY", "ARTHROTOMY", "ARTHROCENTESIS", "ASPIRATION", "BONE GRAFTING", "CONSERVATIVE", "CLOSED REDUCTION", "CRPP", "DEBRIDEMENT", "DISCECTOMY", "EXPLORATION & EVACUATION", "EPIDURAL INJECTION", "EXCISION BIOPSY", "EX-FIX", "HEMIARTHROPLASTY", "IMPLANT REMOVAL", "INSTRUMENTATION", "MIPO", "ORIF", "OSTEOCLASIS CLOSED", "OSTEOCLASIS OPEN", "READJUSTMENT", "REIMPLANTATION", "RELOCATION", "POSTERIOR STABILIZATION", "TOTAL HIP ARTHROPLASTY", "TOTAL KNEE ARTHROPLASTY", "MICRODISCECTOMY", "FACET BLOCK", "FLAP PROCEDURE", "REPAIR", "SUTURE", "STSG ", "FULL THICKNESS SKIN GRAFT" }));

        Jimplant.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AO TUBULAR", "AUSTIN MOORE HIP PROSTHESIS", "BUTTRESS PLATE", "CCS", "DHS", "DCP", "DCS", "ETHIBOND SUTURE", "HIP SPICA", "ILIZAROV", "HYBRID ILIZAROV", "IMIL", "K NAIL", "K WIRE", "BRACE", "LONG ARM CAST", "LONG LEG CAST", "LOCKING PLATE", "PEDICLE SCREWS", "RECON PLATE", "RUSH PIN", "SHORT ARM CAST", "SHORT LEG CAST", "SCREWS", "SCREWS + TBW", "SHORT LEG BACK SLAB ", "STSG", "SUTURING", "TBW", "THOMPSON HIP PROSTHESIS", "LC-DCP" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(Jprocedure, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel36)
                        .addGap(1, 1, 1)
                        .addComponent(Jdate, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Jimplant, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jmgmt_other, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(Jdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(Jprocedure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(Jimplant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(Jmgmt_other, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(236, 236, 231));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Finding"));

        Jfinding.setColumns(20);
        Jfinding.setRows(5);
        jScrollPane2.setViewportView(Jfinding);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(236, 236, 231));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Procedure"));

        Joper_procedure.setColumns(20);
        Joper_procedure.setRows(5);
        jScrollPane3.setViewportView(Joper_procedure);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jLabel37.setFont(new java.awt.Font("Bauhaus Thin", 1, 14)); // NOI18N
        jLabel37.setText("Remarks");

        Jremarks.setColumns(20);
        Jremarks.setRows(5);
        jScrollPane4.setViewportView(Jremarks);

        Jbtnsave.setText("save");
        Jbtnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnsaveActionPerformed(evt);
            }
        });

        Jbtnupdate.setText("Update");
        Jbtnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnupdateActionPerformed(evt);
            }
        });

        jButton1.setText("Show Discharge Module of patient");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(546, 546, 546)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel37)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Jbtnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jbtnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtnsave)
                    .addComponent(Jbtnupdate)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void JageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JageActionPerformed

    private void JtelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtelephoneActionPerformed

    private void JnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JnameActionPerformed

    private void Jsurgeon_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jsurgeon_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jsurgeon_1ActionPerformed

    private void JclassificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JclassificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JclassificationActionPerformed

    private void JbtnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnsaveActionPerformed
        
          
//        ot.setSurgeon1(Jsurgeon_1.getText());
//        ot.setSurgeon2(Jsurgeon_2.getText());
//        ot.setAssistant1(Jassistant_1.getText());
//        ot.setAssistant2(Jassistant_2.getText());
//        ot.setNurse1(Jnurse_1.getText());
//        ot.setNurse2(Jnurse_2.getText());
//        ot.setAnesthesiologist(Janesthesiologist.getText());
//        ot.setAnesassistant1(Janes_assistant1.getText());
//        ot.setAnesassistant2(Janes_assistant2.getText());
//        ot.setAnesnurse(Janes_nurse.getText());
//        ot.setProcedure(Jprocedure.getSelectedItem().toString());
//        ot.setOt_date(Jdate.getText());
//        ot.setType_of_anesthia(Jtype_of_anesthia.getText());
//        ot.setRemark(Jremarks.getText());
//        ot.setPatient_id(patientId);
//        
//        
        
        ot.setSurgeon1(Jsurgeon_1.getText());
        ot.setSurgeon2(Jsurgeon_2.getText());
        ot.setAssistant1(Jassistant_1.getText());
        ot.setAssistant2(Jassistant_2.getText());
        ot.setNurse1(Jnurse_1.getText());
        ot.setNurse2(Jnurse_2.getText());
        ot.setAnesthesiologist(Janesthesiologist.getText());
        ot.setAnesassistant1(Janes_assistant1.getText());
        ot.setAnesassistant2(Janes_assistant2.getText());
        ot.setAnesnurse(Janes_nurse.getText());
        ot.setProcedure(Joper_procedure.getText());
        ot.setFinding(Jfinding.getText());
        
        
        ot.setOt_date(Jot_date.getText());
        
        ot.setType_of_anesthia(Jtype_of_anesthia.getText());
        ot.setRemark(Jremarks.getText());
        ot.setPatient_id(patientId);
        
        
        
        
        
        try {
            oto.addOT(ot);
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
            
            
            
            
            
// TODO add your handling code here:
    }//GEN-LAST:event_JbtnsaveActionPerformed

    private void JbtnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnupdateActionPerformed

        ot.setSurgeon1(Jsurgeon_1.getText());
        ot.setSurgeon2(Jsurgeon_2.getText());
        ot.setAssistant1(Jassistant_1.getText());
        ot.setAssistant2(Jassistant_2.getText());
        ot.setNurse1(Jnurse_1.getText());
        ot.setNurse2(Jnurse_2.getText());
        ot.setAnesthesiologist(Janesthesiologist.getText());
        ot.setAnesassistant1(Janes_assistant1.getText());
        ot.setAnesassistant2(Janes_assistant2.getText());
        ot.setAnesnurse(Janes_nurse.getText());
        ot.setProcedure(Joper_procedure.getText());
        ot.setFinding(Jfinding.getText());
        ot.setOt_date(Jot_date.getText());
        ot.setType_of_anesthia(Jtype_of_anesthia.getText());
        ot.setRemark(Jremarks.getText());
        ot.setPatient_id(patientId);
        
        
        
        
        
        try {
            oto.update(ot);
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        
        




// TODO add your handling code here:
    }//GEN-LAST:event_JbtnupdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OperationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Jaddress;
    private javax.swing.JTextField Jage;
    private javax.swing.JComboBox Janatomic_location;
    private javax.swing.JTextField Janes_assistant1;
    private javax.swing.JTextField Janes_assistant2;
    private javax.swing.JTextField Janes_nurse;
    private javax.swing.JTextField Janesthesiologist;
    private javax.swing.JTextField Jassistant_1;
    private javax.swing.JTextField Jassistant_2;
    private javax.swing.JButton Jbtnsave;
    private javax.swing.JButton Jbtnupdate;
    private javax.swing.JTextField Jclassification;
    private javax.swing.JTextField Jdate;
    private javax.swing.JTextField Jdob;
    private javax.swing.JTextArea Jfinding;
    private javax.swing.JComboBox Jimplant;
    private javax.swing.JTextField Jmgmt_other;
    private javax.swing.JTextField Jname;
    private javax.swing.JTextField Jnurse_1;
    private javax.swing.JTextField Jnurse_2;
    private javax.swing.JTextArea Joper_procedure;
    private javax.swing.JTextField Jot_date;
    private javax.swing.JTextArea Jother;
    private javax.swing.JComboBox Jpathology;
    private javax.swing.JTextField Jpatient_id;
    private javax.swing.JComboBox Jprocedure;
    private javax.swing.JTextArea Jremarks;
    private javax.swing.JTextField Jsex;
    private javax.swing.JComboBox Jside;
    private javax.swing.JComboBox Jsoft_tissue;
    private javax.swing.JComboBox Jsub_location;
    private javax.swing.JTextField Jsurgeon_1;
    private javax.swing.JTextField Jsurgeon_2;
    private javax.swing.JTextField Jtelephone;
    private javax.swing.JTextField Jtype_of_anesthia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
