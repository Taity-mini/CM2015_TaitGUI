/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaitGUI;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrew Tait (1504693) 
 * Date : 22/1/2016
 * Description: Add van to fleet with driver's Details (No Mail items at this stage)
 */
public class AddVan extends javax.swing.JDialog
{

    private Fleet ft;

    ArrayList<MailItem> mailItems1 = new ArrayList<MailItem>();

    /**
     * Creates new form AddVan
     */
    public AddVan(java.awt.Frame parent, boolean modal, Fleet ft)
      {
        super(parent, modal);
        initComponents();
        this.ft = ft;
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextDriverFirstName = new javax.swing.JTextField();
        jTextFieldDriverSecondName = new javax.swing.JTextField();
        jButtonSubmit = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Van to Fleet");

        jLabel1.setText("Driver First Name");

        jLabel2.setText("Driver Surname");

        jTextFieldDriverSecondName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldDriverSecondNameActionPerformed(evt);
            }
        });

        jButtonSubmit.setText("OK");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextDriverFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDriverSecondName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jButtonSubmit)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextDriverFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldDriverSecondName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSubmit)
                    .addComponent(jButtonCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSubmitActionPerformed
    {//GEN-HEADEREND:event_jButtonSubmitActionPerformed
        // Add new van

        //First add person
        String firstName = this.jTextDriverFirstName.getText();
        String lastName = this.jTextFieldDriverSecondName.getText();

        //Field valdiation - check if all fields are filled in.
        if ("".equals(firstName) || "".equals(lastName))
          {
            JOptionPane.showMessageDialog(null, "Please input all fields!");
          } else
          {
            //Fields filled in? Then create person object
            Person p1 = new Person(firstName, lastName);

            Van v1 = new Van(mailItems1, p1);
            ft.addVan(v1);
            JOptionPane.showMessageDialog(null, "Van succesfully added to fleet");
            this.setVisible(false);
          }
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonCancelActionPerformed
    {//GEN-HEADEREND:event_jButtonCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTextFieldDriverSecondNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldDriverSecondNameActionPerformed
    {//GEN-HEADEREND:event_jTextFieldDriverSecondNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDriverSecondNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextDriverFirstName;
    private javax.swing.JTextField jTextFieldDriverSecondName;
    // End of variables declaration//GEN-END:variables
}
