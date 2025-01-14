/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Prabhashi
 */
public class PatientInfoPanel extends javax.swing.JPanel {

    final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    private final NumberFormat format = NumberFormat.getInstance(Locale.US);
    private HashMap<Integer, Patient> patientRecords = new HashMap<>();
    Hashtable<String, String> dataHashtable = new Hashtable<>();
    
 
   


    /**
     * Creates new form PatientInfoPanel
     */
    public PatientInfoPanel() {
    initComponents();
     
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jFormattedTextFieldAgeEdit = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaAddressEdit = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldDiseaseEdit = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxGenderEdit = new javax.swing.JComboBox();
        jFormattedTextFieldRegDateEdit = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jFormattedTextFieldPhoneNoEdit = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaCommentsEdit = new javax.swing.JTextArea();
        jTextFieldNameEdit = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jButtonCancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextFieldPrice = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxRoomType = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxRoomNumber = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jFormattedTextFieldID = new javax.swing.JTextField();
        jButtonSearchPatient = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextFieldEditName = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        Save = new javax.swing.JButton();

        jLabel14.setText("Age :");

        jFormattedTextFieldAgeEdit.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldAgeEdit.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jFormattedTextFieldAgeEdit.setEnabled(false);

        jLabel15.setText("Gender :");

        jTextAreaAddressEdit.setColumns(20);
        jTextAreaAddressEdit.setLineWrap(true);
        jTextAreaAddressEdit.setRows(5);
        jTextAreaAddressEdit.setWrapStyleWord(true);
        jTextAreaAddressEdit.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextAreaAddressEdit.setEnabled(false);
        jScrollPane3.setViewportView(jTextAreaAddressEdit);

        jLabel21.setText("Comments :");

        jTextFieldDiseaseEdit.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldDiseaseEdit.setEnabled(false);

        jLabel25.setText("Registered Date :");

        jLabel16.setText("Phone No :");

        jComboBoxGenderEdit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Male", "Female", "Other" }));
        jComboBoxGenderEdit.setEnabled(false);

        jFormattedTextFieldRegDateEdit.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jFormattedTextFieldRegDateEdit.setEnabled(false);
        jFormattedTextFieldRegDateEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldRegDateEditActionPerformed(evt);
            }
        });

        jLabel13.setText("Name :");

        jFormattedTextFieldPhoneNoEdit.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldPhoneNoEdit.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jFormattedTextFieldPhoneNoEdit.setEnabled(false);

        jLabel17.setText("Address :");

        jTextAreaCommentsEdit.setColumns(20);
        jTextAreaCommentsEdit.setLineWrap(true);
        jTextAreaCommentsEdit.setRows(5);
        jTextAreaCommentsEdit.setWrapStyleWord(true);
        jTextAreaCommentsEdit.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextAreaCommentsEdit.setEnabled(false);
        jScrollPane4.setViewportView(jTextAreaCommentsEdit);

        jTextFieldNameEdit.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNameEdit.setEnabled(false);

        jLabel20.setText("Disease :");

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Room Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel7.setText("Price (per day) Rs :");

        jFormattedTextFieldPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        jFormattedTextFieldPrice.setEnabled(false);
        jFormattedTextFieldPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldPriceActionPerformed(evt);
            }
        });

        jLabel1.setText("Room Type :");

        jComboBoxRoomType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Medium", "VIP" }));
        jComboBoxRoomType.setEnabled(false);
        jComboBoxRoomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRoomTypeActionPerformed(evt);
            }
        });

        jLabel2.setText("Room Number");

        jComboBoxRoomNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Room", "1", "2", "3", "4" }));
        jComboBoxRoomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRoomNumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextFieldPrice))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(49, 49, 49)
                                .addComponent(jComboBoxRoomType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(36, 36, 36)
                                .addComponent(jComboBoxRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("Patient Name :");

        jFormattedTextFieldID.setEnabled(false);
        jFormattedTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldIDActionPerformed(evt);
            }
        });
        jFormattedTextFieldID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldIDKeyReleased(evt);
            }
        });

        jButtonSearchPatient.setText("Search");
        jButtonSearchPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchPatientActionPerformed(evt);
            }
        });

        jLabel6.setText("Patient ID :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldEditName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSearchPatient)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jButtonSearchPatient)
                    .addComponent(jFormattedTextFieldEditName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jFormattedTextFieldPhoneNoEdit)
                            .addComponent(jComboBoxGenderEdit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFormattedTextFieldAgeEdit)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(editButton)
                                .addGap(38, 38, 38)
                                .addComponent(Save)
                                .addGap(25, 25, 25))
                            .addComponent(jScrollPane4)
                            .addComponent(jFormattedTextFieldRegDateEdit)
                            .addComponent(jTextFieldNameEdit)
                            .addComponent(jTextFieldDiseaseEdit))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButtonCancel))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jFormattedTextFieldRegDateEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextFieldNameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jFormattedTextFieldAgeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jComboBoxGenderEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jFormattedTextFieldPhoneNoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDiseaseEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Save)
                        .addComponent(jButtonCancel)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    
private void fillFormFields(Patient patient) {
    
    jTextFieldNameEdit.setText(patient.getName());
    jFormattedTextFieldID.setText(String.valueOf(patient.getPatientID())); // Assuming jFormattedTextFieldEditID is a JTextField
    jFormattedTextFieldAgeEdit.setText(String.valueOf(patient.getAge()));
    jFormattedTextFieldPhoneNoEdit.setText(patient.getPhoneNumber());
    jTextAreaAddressEdit.setText(patient.getAddress());
    jTextFieldDiseaseEdit.setText(patient.getDisease());
    jTextAreaCommentsEdit.setText(patient.getComments());
    jComboBoxRoomType.setSelectedItem(patient.getRoomType());
    jComboBoxGenderEdit.setSelectedItem(patient.getGender());
    jFormattedTextFieldRegDateEdit.setText(patient.getRegDate());
    jComboBoxRoomNumber.setSelectedItem(patient.getRoomNumber());

}


private void loadDataFromFile() {
    try {
        // Get the patient name from the JTextField
        String patientName = jFormattedTextFieldEditName.getText().trim();

        // Create a File object for the patient's file in the "Patients Records" folder
        File folder = new File("Patients Records");
        File file = new File(folder, patientName+".txt");

        // Check if the file exists
        if (!file.exists()) {
            JOptionPane.showMessageDialog(null, "No Records Found");
            return;
        }

        // Initialize a Map to store key-value pairs of patient data
        Map<String, String> patientData = new HashMap<>();

        // Read data from the patient's file
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Check if the line contains key-value pairs
                if (line.contains(":")) {
                    String[] parts = line.split(":");
                    String key = parts[0].trim(); // Remove leading and trailing spaces from the key
                    String value = parts[1].trim(); // Remove leading and trailing spaces from the value
                    patientData.put(key, value);
                }
            }
        }

        // Extract patient data from the Map and create a Patient object
        String patientID = patientData.get("PatientID");
        String name = patientData.get("Name");
        String gender = patientData.get("Gender");
        int age = Integer.parseInt(patientData.get("Age"));
        String phoneNumber = patientData.get("PhoneNo");
        String address = patientData.get("Address");
        String disease = patientData.get("Disease");
        String comments = patientData.getOrDefault("Comments", "");
        String roomType = patientData.get("RoomType");
        String roomNumber = patientData.get("RoomNumber");
        String regDate = patientData.get("RegDate");
        
        // Create a Patient object
        Patient patient = new Patient(patientID, name, gender, age, phoneNumber, address, disease, comments, roomType, roomNumber, regDate);
        
        // Fill form fields with patient data
        fillFormFields(patient);
    } catch (IOException e) {
        e.printStackTrace();
    }
}






public void SaveToTextFile() {
    // Add data to class-level Hashtable
    dataHashtable.put("RoomNumber", (String) jComboBoxRoomNumber.getSelectedItem());
    dataHashtable.put("RoomType", (String) jComboBoxRoomType.getSelectedItem());
    dataHashtable.put("Age", jFormattedTextFieldAgeEdit.getText());
    dataHashtable.put("PhoneNo", jFormattedTextFieldPhoneNoEdit.getText());
    dataHashtable.put("Price", jFormattedTextFieldPrice.getText());
    dataHashtable.put("RegDate", jFormattedTextFieldRegDateEdit.getText());
    dataHashtable.put("Gender", (String) jComboBoxGenderEdit.getSelectedItem());
    dataHashtable.put("Disease", jTextFieldDiseaseEdit.getText());
    dataHashtable.put("Name", jTextFieldNameEdit.getText());
    dataHashtable.put("Address", jTextAreaAddressEdit.getText());
    dataHashtable.put("Comments", jTextAreaCommentsEdit.getText());
    dataHashtable.put("PatientID", jFormattedTextFieldID.getText());

    // Save data to text file
    saveToFile(dataHashtable);
}

private void saveToFile(Hashtable<String, String> dataHashtable) {
    try {
        // Get the patient name from the JTextField
        String patientName = jFormattedTextFieldEditName.getText().trim();

        // Create the directory if it doesn't exist
        File folder = new File("Patients Records");
        if (!folder.exists()) {
            folder.mkdir();
        }

        // Specify the file name using the patient name
        File file = new File(folder, patientName + ".txt");

        FileWriter fw = new FileWriter(file, true); // Open file in append mode
        BufferedWriter bw = new BufferedWriter(fw);

        // Write key-value pairs to the file
        for (String key : dataHashtable.keySet()) {
            String value = dataHashtable.get(key);
            bw.write(key + ": " + value);
            bw.newLine();
        }

        // Close the writer
        bw.close();
        fw.close();

        JOptionPane.showMessageDialog(null, "Data saved to file successfully!");
    } catch (IOException e) {
        e.printStackTrace();
    }
}


  


    private void jFormattedTextFieldIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldIDKeyReleased
     
    }//GEN-LAST:event_jFormattedTextFieldIDKeyReleased

    private void jFormattedTextFieldRegDateEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldRegDateEditActionPerformed

    }//GEN-LAST:event_jFormattedTextFieldRegDateEditActionPerformed

    private void jButtonSearchPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchPatientActionPerformed
       loadDataFromFile();
    }//GEN-LAST:event_jButtonSearchPatientActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        resetFormEdit();
        MainInterface.setDefaultLayout();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jComboBoxRoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRoomTypeActionPerformed
        
    }//GEN-LAST:event_jComboBoxRoomTypeActionPerformed

    private void jFormattedTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldIDActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
      setFieldsEditable(true);
    }//GEN-LAST:event_editButtonActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        SaveToTextFile(); 
    }//GEN-LAST:event_SaveActionPerformed

    private void jFormattedTextFieldPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldPriceActionPerformed

    private void jComboBoxRoomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRoomNumberActionPerformed
       String selectedText = (String) jComboBoxRoomType.getSelectedItem();
        
        if (selectedText.equals("VIP")) {
            jFormattedTextFieldPrice.setText("Rs.25,000");
        } else if (selectedText.equals("Medium")) {
            jFormattedTextFieldPrice.setText("Rs.21,000");
        } else {
            jFormattedTextFieldPrice.setText("Rs.19,500");
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRoomNumberActionPerformed

   

    
    

    


    public void resetFormEdit() {
        jFormattedTextFieldRegDateEdit.setText("");
        jTextFieldNameEdit.setText("");
        jFormattedTextFieldAgeEdit.setText("");
        jComboBoxGenderEdit.setSelectedIndex(0);
        jFormattedTextFieldPhoneNoEdit.setText("");
        jTextAreaAddressEdit.setText("");
        jTextFieldDiseaseEdit.setText("");
        jTextAreaCommentsEdit.setText("");

        jComboBoxRoomType.setSelectedIndex(0);

       

        jFormattedTextFieldPrice.setText("");

//        jComboBoxNameEdit.setSelectedItem(name);
    }

   

private void setFieldsEditable(boolean editable) {
    jTextFieldNameEdit.setEnabled(editable);
    jFormattedTextFieldID.setEnabled(editable);
    jFormattedTextFieldAgeEdit.setEnabled(editable);
    jFormattedTextFieldPhoneNoEdit.setEnabled(editable);
    jTextAreaAddressEdit.setEnabled(editable);
    jTextFieldDiseaseEdit.setEnabled(editable);
    jTextAreaCommentsEdit.setEnabled(editable);
    jComboBoxRoomType.setEnabled(editable);
    jComboBoxGenderEdit.setEnabled(editable);
    jFormattedTextFieldRegDateEdit.setEnabled(editable);
    jComboBoxRoomNumber.setEnabled(editable);
}




    public void setJComboBoxNameEdit(String[] names) {
       
    }

    public void setJFormattedTextFieldEditID(String text) {
        jFormattedTextFieldID.setText(text);
    }

    public void setJComboBoxNameEditIndex(int index) {
        
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JButton editButton;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSearchPatient;
    private javax.swing.JComboBox jComboBoxGenderEdit;
    private javax.swing.JComboBox<String> jComboBoxRoomNumber;
    private javax.swing.JComboBox jComboBoxRoomType;
    private javax.swing.JFormattedTextField jFormattedTextFieldAgeEdit;
    private javax.swing.JTextField jFormattedTextFieldEditName;
    private javax.swing.JTextField jFormattedTextFieldID;
    private javax.swing.JFormattedTextField jFormattedTextFieldPhoneNoEdit;
    private javax.swing.JFormattedTextField jFormattedTextFieldPrice;
    private javax.swing.JFormattedTextField jFormattedTextFieldRegDateEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextAreaAddressEdit;
    private javax.swing.JTextArea jTextAreaCommentsEdit;
    private javax.swing.JTextField jTextFieldDiseaseEdit;
    private javax.swing.JTextField jTextFieldNameEdit;
    // End of variables declaration//GEN-END:variables
}
