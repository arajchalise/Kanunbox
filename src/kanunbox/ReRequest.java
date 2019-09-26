/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kanunbox;

import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ARAZ
 */
public class ReRequest extends javax.swing.JFrame {
    private int id;
    public ReRequest(int i) {
        initComponents();
        this.id = i;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        listAdv = new javax.swing.JComboBox<>();
        btnReRequest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(300, 300));
        setMinimumSize(new java.awt.Dimension(300, 300));

        jLabel1.setText("अधिवक्ता ");

        listAdv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnReRequest.setText("Re Request");
        btnReRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listAdv, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(btnReRequest)))
                .addContainerGap(433, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listAdv, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnReRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReRequestActionPerformed
       DBHelper db = new DBHelper();
       if(db.isConnected()){
            String advName = listAdv.getSelectedItem().toString();
           try {
               String advId = db.getAdvocateId(advName);
               if(db.updateAppointment(advId, id)){
                   JOptionPane.showMessageDialog(this, "तपाँइको कार्य सम्पन्न भयो");
                   dispose();
                   
               }
               
           } catch (SQLException ex) {
               Logger.getLogger(ReRequest.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
    }//GEN-LAST:event_btnReRequestActionPerformed
    
public void run(){
    this.setVisible(true);
    //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    DBHelper db = new DBHelper();
      listAdv.removeAllItems();
      listAdv.addItem("अधिवक्ता छान्नुहोस");
       try {
           if(db.isConnected()){
               ResultSet rs = db.fetchAdvocate();
               
           while(rs.next()){
               listAdv.addItem(rs.getString(2));
           }
           }
           
       }catch(Exception e){
           e.printStackTrace();
       }
}
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> listAdv;
    // End of variables declaration//GEN-END:variables
}
