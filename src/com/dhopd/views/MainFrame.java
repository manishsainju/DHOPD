package com.dhopd.views;

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


import com.dhopd.controllers.DBConnection;
import com.dhopd.controllers.OTDBO;
import com.dhopd.models.OperationTeam;
import com.dhopd.models.Patient;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
 import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
 
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    Patient patient = new Patient();
    int selected_row=-1,patientId;
    
    public MainFrame() {
        initComponents();
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setVisible(true);
        populateTable();
    }

    public void populateTable(){
        try{
            Connection con;
            con = DBConnection.getConnection();
            String qry = "select patient_id,name,age,sex,address,date from history_table";
            Statement stmt = con.createStatement();
            ResultSet rst = stmt.executeQuery(qry);
            jtable_patient.setModel(DbUtils.resultSetToTableModel(rst));
            con.close();
            
        }
        catch(Exception e){
            
        }
        
        // ResultSet rs = stmt.executeQuery(SQL);
    }
    
    
    public void populateTable(String name){
        try{
            Connection con;
            con = DBConnection.getConnection();
            String qry = "select patient_id,name,age,sex,address,date from history_table where name like '%"+name+"%'";
            Statement stmt = con.createStatement();
            ResultSet rst = stmt.executeQuery(qry);
            jtable_patient.setModel(DbUtils.resultSetToTableModel(rst));
            con.close();
            
        }
        catch(Exception e){
            
        }
        
        // ResultSet rs = stmt.executeQuery(SQL);
    }
    
    public void populateTable(String date,boolean flag){
        try{
            Connection con;
            con = DBConnection.getConnection();
            String qry = "select patient_id,name,age,sex,address,date from history_table where date like '%"+date+"%'";
            Statement stmt = con.createStatement();
            ResultSet rst = stmt.executeQuery(qry);
            jtable_patient.setModel(DbUtils.resultSetToTableModel(rst));
            con.close();
            
        }
        catch(Exception e){
            
        }
        
        // ResultSet rs = stmt.executeQuery(SQL);
    }
    
    
    
    
    public void populateTable(int patientId){
        try{
            Connection con;
            con = DBConnection.getConnection();
            String qry = "select patient_id,name,age,sex,address,date from history_table where patient_id like '%"+patientId+"%'";
            Statement stmt = con.createStatement();
            ResultSet rst = stmt.executeQuery(qry);
            jtable_patient.setModel(DbUtils.resultSetToTableModel(rst));
            con.close();
            
        }
        catch(Exception e){
            
        }
        
        // ResultSet rs = stmt.executeQuery(SQL);
    }
    
    
    
    public void populateTable(String sex,String val){
        try{
            Connection con;
            con = DBConnection.getConnection();
            String qry = "select patient_id,name,age,sex,address,date from history_table where sex like '"+sex+"%'";
            Statement stmt = con.createStatement();
            ResultSet rst = stmt.executeQuery(qry);
            jtable_patient.setModel(DbUtils.resultSetToTableModel(rst));
            con.close();
            
        }
        catch(Exception e){
            
        }
        
        // ResultSet rs = stmt.executeQuery(SQL);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Jsearch_by = new javax.swing.JComboBox();
        Jsearch_value = new javax.swing.JTextField();
        Jsearch = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Jbtnshow_operation_module = new javax.swing.JButton();
        Jbtnshow_discharge_module = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_patient = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ortho & traume, Dhulikhel Hospital");
        setBackground(new java.awt.Color(230, 224, 221));

        jLabel1.setFont(new java.awt.Font("Bauhaus Thin", 1, 18)); // NOI18N
        jLabel1.setText("Department Of Ortho & Traume ");

        jLabel2.setFont(new java.awt.Font("Bauhaus Thin", 1, 18)); // NOI18N
        jLabel2.setText("          Dhulikhel Hospital");

        jLabel3.setFont(new java.awt.Font("Bauhaus Thin", 1, 18)); // NOI18N
        jLabel3.setText("Kathmandu University Hospital");

        jLabel4.setText("Search By");

        Jsearch_by.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Patient Id", "Date", "Sex" }));

        Jsearch.setMnemonic('s');
        Jsearch.setText("Search");
        Jsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JsearchActionPerformed(evt);
            }
        });

        jButton2.setMnemonic('n');
        jButton2.setText("Add New Patient");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setMnemonic('e');
        jButton3.setText("Edit Selected Patient");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Jbtnshow_operation_module.setMnemonic('o');
        Jbtnshow_operation_module.setText("Show Operation Module of Selected patient");
        Jbtnshow_operation_module.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtnshow_operation_moduleActionPerformed(evt);
            }
        });

        Jbtnshow_discharge_module.setMnemonic('d');
        Jbtnshow_discharge_module.setText("Show Discharge Module of Selected patient");
        Jbtnshow_discharge_module.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtnshow_discharge_moduleActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient List", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jtable_patient.setAutoCreateRowSorter(true);
        jtable_patient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtable_patient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_patientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_patient);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jButton4.setMnemonic('r');
        jButton4.setText("Refresh Data");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(Jsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Jsearch_value, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Jsearch_by, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Jbtnshow_operation_module, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Jbtnshow_discharge_module, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Jsearch_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jsearch_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(8, 8, 8)
                        .addComponent(Jbtnshow_discharge_module))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton2))
                        .addGap(8, 8, 8)
                        .addComponent(Jbtnshow_operation_module)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jsearch)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        new HistoryFrame();


// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Jbtnshow_discharge_moduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtnshow_discharge_moduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jbtnshow_discharge_moduleActionPerformed

    private void jtable_patientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_patientMouseClicked

        
    selected_row = jtable_patient.getSelectedRow();
    
    patientId = Integer.parseInt(jtable_patient.getValueAt(selected_row, 0).toString());
    


// TODO add your handling code here:
    }//GEN-LAST:event_jtable_patientMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if(selected_row==-1){
            JOptionPane.showMessageDialog(null, "Please Select The Patient ");
        }
        else
        new HistoryFrame(patientId);

// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        populateTable();


// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Jbtnshow_operation_moduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtnshow_operation_moduleActionPerformed

        if(selected_row==-1){
            JOptionPane.showMessageDialog(null, "Please Select The Patient ");
        }
        else{
              OTDBO checkdb = new OTDBO();
        OperationTeam ot = checkdb.getOtteam(patientId);
        
        
        
        
        if(patientId==ot.getPatient_id()){
            JOptionPane.showMessageDialog(null, "Existing patient");
                    new OperationFrame(patientId);
        }
        
        else {
            JOptionPane.showMessageDialog(null, "New patient");
            new OperationFrame(patientId,true);
        }
        }
            













// TODO add your handling code here:
    }//GEN-LAST:event_Jbtnshow_operation_moduleActionPerformed

    private void JsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JsearchActionPerformed

                String searchby = Jsearch_by.getSelectedItem().toString();
            if(searchby.equalsIgnoreCase("name")){
                System.out.println("using name");
                populateTable(Jsearch_value.getText());
            }
            else if(searchby.equalsIgnoreCase("date")){
                populateTable(Jsearch_value.getText(),true);
            }
            else if(searchby.equalsIgnoreCase("patient id")){
                populateTable(Integer.parseInt(Jsearch_value.getText()));
            }
            else
                populateTable(Jsearch_value.getText(),Jsearch_value.getText());
            



















// TODO add your handling code here:
    }//GEN-LAST:event_JsearchActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtnshow_discharge_module;
    private javax.swing.JButton Jbtnshow_operation_module;
    private javax.swing.JButton Jsearch;
    private javax.swing.JComboBox Jsearch_by;
    private javax.swing.JTextField Jsearch_value;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable_patient;
    // End of variables declaration//GEN-END:variables
}
