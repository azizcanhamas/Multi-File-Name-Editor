package com.mycompany.multifilenameeditor_gui;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;

public class mainJFrame extends javax.swing.JFrame {

    JFileChooser jfc=new JFileChooser();
    ImageIcon image=new ImageIcon("C:/Users/PC/Documents/NetBeansProjects/MultiFileNameEditor_GUI/ico.png");
    File[] files;
    int start;
    String get_name,new_name="",temp="",remove;
    
    public mainJFrame() {
        initComponents();
        
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        this.setIconImage(image.getImage());
        
        this.setTitle("Multi File Name Editor");
        
        reset();
        
        jscrollpane_files.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        jscrollpane_files.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
        
        jfc.setMultiSelectionEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectFiles_JButton = new javax.swing.JButton();
        jscrollpane_files = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        numbering_JButton = new javax.swing.JButton();
        baslangic_Spinner = new javax.swing.JSpinner();
        removeNumber_JButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        seduce_JButton = new javax.swing.JButton();
        seduce_JTextField = new javax.swing.JTextField();
        prepend_JButton = new javax.swing.JButton();
        prepend_JTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Agency FB", 0, 8)); // NOI18N

        selectFiles_JButton.setText("Select Files");
        selectFiles_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFiles_JButtonActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jscrollpane_files.setViewportView(jTextArea1);

        numbering_JButton.setText("Numbering");
        numbering_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numbering_JButtonActionPerformed(evt);
            }
        });

        removeNumber_JButton.setText("Remove Number");
        removeNumber_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNumber_JButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 10)); // NOI18N
        jLabel1.setText("Aziz Can HAMAŞOĞLU");

        seduce_JButton.setText("Seduce");
        seduce_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seduce_JButtonActionPerformed(evt);
            }
        });

        prepend_JButton.setText("Prepend");
        prepend_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prepend_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(jscrollpane_files, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(removeNumber_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(seduce_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seduce_JTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numbering_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(baslangic_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prepend_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prepend_JTextField))
                    .addComponent(selectFiles_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectFiles_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeNumber_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numbering_JButton)
                    .addComponent(baslangic_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seduce_JButton)
                    .addComponent(seduce_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prepend_JButton)
                    .addComponent(prepend_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jscrollpane_files, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectFiles_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFiles_JButtonActionPerformed
        jfc.showOpenDialog(mainJFrame.this);
        jTextArea1.setText("");
        files=jfc.getSelectedFiles();
        for(int i=0;i<files.length;i++){
            jTextArea1.append("   "+files[i].getName()+"\n");
        }
        
        jLabel2.setText("File selection is complete.");
        activate();  
    }//GEN-LAST:event_selectFiles_JButtonActionPerformed

    private void numbering_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numbering_JButtonActionPerformed
        start=(Integer)baslangic_Spinner.getValue();
        
        int count=start;
        for(int i=0;i<files.length;i++){
            get_name=files[i].getName();
            files[i].renameTo(new File(files[i].getParent()+"/"+count+" - "+get_name));
            count++;
        }

        jLabel2.setText("Numbering is complete.");
        reset();
    }//GEN-LAST:event_numbering_JButtonActionPerformed

    private void removeNumber_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNumber_JButtonActionPerformed
        for(int i=0;i<files.length;i++){           
            get_name=files[i].getName();
            new_name="";           
            
            boolean durum=false;
            
            for(int z=0;z<files[i].getName().length();z++){
                
                for(int ascii=65;ascii<=90;ascii++)
                {
                    if(ascii==(char)get_name.charAt(z)){
                        durum=true;
                        break;
                    }
                }
                                                           
                if(durum!=true){
                    for(int ascii=97;ascii<=122;ascii++)
                        if(ascii==(char)get_name.charAt(z))
                        {
                            durum=true;
                            break;
                        }                                         
                }
                
                if(durum==true){
                    for(int x=z;x<get_name.length();x++){
                        new_name+=get_name.charAt(x);
                    }
                    
                    files[i].renameTo(new File(files[i].getParent()+"/"+new_name));
                    break;
                }                                      
            }
        }
        jLabel2.setText("Number removal complete.");
        reset();
    }//GEN-LAST:event_removeNumber_JButtonActionPerformed

    private void seduce_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seduce_JButtonActionPerformed
        new_name="";
        remove=seduce_JTextField.getText();
        for(int i=0;i<files.length;i++){
            get_name=files[i].getName();
            if(remove.length()<get_name.length())
                for(int x=0;x<remove.length();x++)
                    temp+=get_name.charAt(x);
                       
            if(temp.equals(remove)){
                for(int z=remove.length();z<get_name.length();z++){
                    new_name+=get_name.charAt(z);
                }
                files[i].renameTo(new File(files[i].getParent()+"/"+new_name));
            }
            new_name="";
            temp="";
        }
        
        jLabel2.setText("Seduce completed.");        
        reset();
    }//GEN-LAST:event_seduce_JButtonActionPerformed

    private void prepend_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prepend_JButtonActionPerformed
        String prepend=prepend_JTextField.getText();
        for(int i=0;i<files.length;i++){
            get_name=files[i].getName();
            new_name=prepend+get_name;
            files[i].renameTo(new File(files[i].getParent()+"/"+new_name));
            new_name="";
        }
        jLabel2.setText("Prepend completed.");
        reset();
    }//GEN-LAST:event_prepend_JButtonActionPerformed
    
    private void reset(){
        jTextArea1.enable(false);       
        numbering_JButton.setEnabled(false);
        baslangic_Spinner.setEnabled(false);
        removeNumber_JButton.setEnabled(false);
        seduce_JButton.setEnabled(false);       
        seduce_JTextField.setEnabled(false);
        prepend_JButton.setEnabled(false);
        prepend_JTextField.setEnabled(false);
        baslangic_Spinner.setValue(0);
        jTextArea1.setText("");
        prepend_JTextField.setText("");
        seduce_JTextField.setText("");
    }
    
    private void activate(){
        numbering_JButton.setEnabled(true);
        baslangic_Spinner.setEnabled(true);
        removeNumber_JButton.setEnabled(true);        
        seduce_JButton.setEnabled(true);
        seduce_JTextField.setEnabled(true);
        seduce_JTextField.setText("");
        prepend_JButton.setEnabled(true);
        prepend_JTextField.setEnabled(true);
        prepend_JTextField.setText("");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainJFrame().setVisible(true);             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner baslangic_Spinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane jscrollpane_files;
    private javax.swing.JButton numbering_JButton;
    private javax.swing.JButton prepend_JButton;
    private javax.swing.JTextField prepend_JTextField;
    private javax.swing.JButton removeNumber_JButton;
    private javax.swing.JButton seduce_JButton;
    private javax.swing.JTextField seduce_JTextField;
    private javax.swing.JButton selectFiles_JButton;
    // End of variables declaration//GEN-END:variables
}
