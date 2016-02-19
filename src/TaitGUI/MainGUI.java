/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaitGUI;

import java.io.File;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrew Tait (1504693)
 * Date: 22/1/2016
 * Description: Main JFrame for GUI Assessment. 
 * Provides navigation between each function and display output in scrollable textarea
 */
public class MainGUI extends javax.swing.JFrame
{

    //private Fleet ft1;
    private Fleet ft = new Fleet(new Person("", ""));

    /**
     * Creates new form MainGUI
     */
    public MainGUI()
      {
        initComponents();
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

        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMain = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemLoad = new javax.swing.JMenuItem();
        jMenuItemSave = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemEditMail = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemDisplayVans = new javax.swing.JMenuItem();
        jMenuItemSortedVans = new javax.swing.JMenuItem();
        jMenuItemVanSummary = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemAddVan = new javax.swing.JMenuItem();
        jMenuItemMailItem = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItemSearchVanID = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tait GUI");

        jTextAreaMain.setColumns(20);
        jTextAreaMain.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMain);
        jTextAreaMain.getAccessibleContext().setAccessibleName("");
        jTextAreaMain.getAccessibleContext().setAccessibleDescription("");

        jMenu1.setText("File");

        jMenuItemLoad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemLoad.setText("Load");
        jMenuItemLoad.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItemLoadActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemLoad);

        jMenuItemSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSave.setText("Save");
        jMenuItemSave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItemSaveActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSave);

        jMenuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemExit);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Edit");

        jMenuItemEditMail.setText("Edit Mail Item");
        jMenuItemEditMail.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItemEditMailActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemEditMail);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Display");

        jMenuItemDisplayVans.setText("Display Van Details");
        jMenuItemDisplayVans.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItemDisplayVansActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemDisplayVans);

        jMenuItemSortedVans.setText("Display Van Details Sorted");
        jMenuItemSortedVans.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItemSortedVansActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemSortedVans);

        jMenuItemVanSummary.setText("Display Van Summary");
        jMenuItemVanSummary.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItemVanSummaryActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemVanSummary);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Add");

        jMenuItemAddVan.setText("Add New Van");
        jMenuItemAddVan.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItemAddVanActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemAddVan);

        jMenuItemMailItem.setText("Add New Mail Item");
        jMenuItemMailItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItemMailItemActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemMailItem);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Search");

        jMenuItemSearchVanID.setText("Search by Van ID");
        jMenuItemSearchVanID.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItemSearchVanIDActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemSearchVanID);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemLoadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemLoadActionPerformed
    {//GEN-HEADEREND:event_jMenuItemLoadActionPerformed
        // Load fleet data from a file

        if (this.jFileChooser1.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
          {
            File loadedfile = this.jFileChooser1.getSelectedFile();

            ft.readFromFile(loadedfile);

            JOptionPane.showMessageDialog(null, "File loaded Successfully");
            System.out.println("File loaded");
            String loaded = "File loaded: \n";
            
            this.jTextAreaMain.setText(loaded);
          }


    }//GEN-LAST:event_jMenuItemLoadActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemExitActionPerformed
    {//GEN-HEADEREND:event_jMenuItemExitActionPerformed
        //Ask user if they want to exit the program or not
        if (JOptionPane.showConfirmDialog(null, "Do you want to exit?") == JOptionPane.OK_OPTION)
          {
            System.exit(0);
          }

    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemSaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemSaveActionPerformed
    {//GEN-HEADEREND:event_jMenuItemSaveActionPerformed
        // Prompt user to save fleet data into a file
        if (this.jFileChooser1.showOpenDialog(this) == this.jFileChooser1.APPROVE_OPTION)
          {
            this.ft.saveToFile(this.jFileChooser1.getSelectedFile());
            JOptionPane.showMessageDialog(null, "File saved Successfully");
            this.jTextAreaMain.setText("File Saved");
          }
    }//GEN-LAST:event_jMenuItemSaveActionPerformed

    private void jMenuItemDisplayVansActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemDisplayVansActionPerformed
    {//GEN-HEADEREND:event_jMenuItemDisplayVansActionPerformed
        // Display van details

        this.jTextAreaMain.setText(ft.toString());
    }//GEN-LAST:event_jMenuItemDisplayVansActionPerformed

    private void jMenuItemSortedVansActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemSortedVansActionPerformed
    {//GEN-HEADEREND:event_jMenuItemSortedVansActionPerformed
        // Display van details sorted by # of mails items in each van

        //Arrays.sort(vans, 0, numberOfVans, new VanComparator());
        //Copy van elements
        Van[] SortedVans = new Van[20];
        for (int i = 0; i < this.ft.getNumberOfVans(); i++)
          {
            SortedVans[i] = ft.getVan(i);
          }
        //Sort them based on number of mail items
        Arrays.sort(SortedVans, 0, ft.getNumberOfVans(), new VanComparator());

        //Display Sorted Vans
        String str = "Fleet manager: " + ft.getManager().toString() + "\n";
        for (int i = 0; i < this.ft.getNumberOfVans(); i++)
          {
            str += SortedVans[i].toString();
          }

        this.jTextAreaMain.setText(str);
    }//GEN-LAST:event_jMenuItemSortedVansActionPerformed

    private void jMenuItemVanSummaryActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemVanSummaryActionPerformed
    {//GEN-HEADEREND:event_jMenuItemVanSummaryActionPerformed
        String str = "Fleet manager: " + ft.getManager().toString() + "\n";
        for (int i = 0; i < ft.getNumberOfVans(); i++)
          {
            str += "*******\nDriver: " + ft.getVan(i).getDriver() + "\n";
            str += "Number of Mail Items:" + ft.getVan(i).getItems().size() + "\n";

          }

        this.jTextAreaMain.setText(str);
    }//GEN-LAST:event_jMenuItemVanSummaryActionPerformed

    private void jMenuItemSearchVanIDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemSearchVanIDActionPerformed
    {//GEN-HEADEREND:event_jMenuItemSearchVanIDActionPerformed
        //Declare local variables
        boolean validInput = false;
        boolean found = false;
        String str = "";
        while (!validInput)
          {
            try
              {
                if (ft.getNumberOfVans() == 0)
                  {
                    JOptionPane.showMessageDialog(null, "No vans in fleet, please add one!");
                    break;
                  }
                // Display van based on it's id (index number)
                String input = JOptionPane.showInputDialog("Please enter a Van ID:");

                if (input == null)
                  {
                    break;
                  } else if (input.length() == 0)
                  {
                    JOptionPane.showMessageDialog(null, "Please enter an ID!!");
                  } else
                  {
                    int id = Integer.parseInt(input);

                    //First validate user's input.
                    if (id >= 0 && id <= ft.getNumberOfVans())
                      {
                        for (int i = 0; i < ft.getNumberOfVans(); i++)
                          {
                            if (i == id)
                              {
                                //sort by delivery cost
                                ft.getVan(i).sortItems();
                                str += ft.getVan(i).toString();
                                validInput = true;
                              }
                          }
                      } else //not within search range
                      {
                        JOptionPane.showMessageDialog(null, "ID not within range");
                      }

                  }
              } catch (NumberFormatException e)
              {
                JOptionPane.showMessageDialog(null, "Invalid Input please try again", "Error!", JOptionPane.ERROR_MESSAGE);
              }

          }
        if (validInput)
          {
            this.jTextAreaMain.setText(str);
          }
    }//GEN-LAST:event_jMenuItemSearchVanIDActionPerformed

    private void jMenuItemAddVanActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemAddVanActionPerformed
    {//GEN-HEADEREND:event_jMenuItemAddVanActionPerformed
        //Add van pop-up dialog
        AddVan av = new AddVan(this, true, ft);
        av.setVisible(true);

    }//GEN-LAST:event_jMenuItemAddVanActionPerformed

    private void jMenuItemMailItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemMailItemActionPerformed
    {//GEN-HEADEREND:event_jMenuItemMailItemActionPerformed
        // Add new mail item:

        //First ask user to input van id number
        //Declare local variables
        boolean validInput2 = false;
        int vanID = 0;
        while (!validInput2)
          {
            try
              {
                //If there's no vans then display error message

                if (ft.getNumberOfVans() == 0)
                  {
                    JOptionPane.showMessageDialog(null, "No vans in fleet, please add one!");
                    break;
                  }

                // Display van based on it's id (index number)
                String input = JOptionPane.showInputDialog("Please enter a Van ID:");

                if (input == null)
                  {
                    break;
                  } else if (input.length() == 0)
                  {
                    JOptionPane.showMessageDialog(null, "Please enter an ID!!");
                  } else
                  {
                    int id = Integer.parseInt(input);

                    //First validate user's input.
                    if (id >= 0 && id <= ft.getNumberOfVans())
                      {
                        for (int i = 0; i < ft.getNumberOfVans(); i++)
                          {
                            if (i == id)
                              {
                                vanID = id;
                                validInput2 = true;
                              }
                          }
                      } else //not within search range
                      {
                        JOptionPane.showMessageDialog(null, "ID not within range");
                      }

                  }
              } catch (NumberFormatException e)
              {
                JOptionPane.showMessageDialog(null, "Invalid Input please try again", "Error!", JOptionPane.ERROR_MESSAGE);
              }

          }
        if (validInput2)
          {
            AddMailItem ami = new AddMailItem(this, true, this.ft, vanID);
            ami.setVisible(true);
            this.jMenuItemDisplayVansActionPerformed(evt);
          }


    }//GEN-LAST:event_jMenuItemMailItemActionPerformed

    private void jMenuItemEditMailActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemEditMailActionPerformed
    {//GEN-HEADEREND:event_jMenuItemEditMailActionPerformed
        // Edit Mail Item
        //First ask user to input van id number
        //Declare local variables
        boolean validInput2 = false;
        int vanID = 0;
        while (!validInput2)
          {
            try
              {
                //If there's no vans then display error message

                if (ft.getNumberOfVans() == 0)
                  {
                    JOptionPane.showMessageDialog(null, "No vans in fleet, please add one!");
                    break;
                  }

                // Display van based on it's id (index number)
                String input = JOptionPane.showInputDialog("Please enter a Van ID:");

                if (input == null)
                  {
                    break;
                  } else if (input.length() == 0)
                  {
                    JOptionPane.showMessageDialog(null, "Please enter an ID!!");
                  } else
                  {
                    int id = Integer.parseInt(input);

                    //First validate user's input.
                    if (id >= 0 && id <= ft.getNumberOfVans())
                      {
                        for (int i = 0; i < ft.getNumberOfVans(); i++)
                          {
                            if (i == id)
                              {
                                vanID = id;
                                validInput2 = true;
                              }
                          }
                      } else //not within search range
                      {
                        JOptionPane.showMessageDialog(null, "ID not within range");
                      }
                    ChooseMailItem cmi = new ChooseMailItem(this, true, this.ft, vanID);
                    cmi.setVisible(true);
                    break;
                  }
              } catch (NumberFormatException e)
              {
                JOptionPane.showMessageDialog(null, "Invalid Input please try again", "Error!", JOptionPane.ERROR_MESSAGE);
              }
          }

    }//GEN-LAST:event_jMenuItemEditMailActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
      {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
          {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
              {
                if ("Nimbus".equals(info.getName()))
                  {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                  }
              }
          } catch (ClassNotFoundException ex)
          {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex)
          {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex)
          {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex)
          {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
              {
                new MainGUI().setVisible(true);
              }
        });
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAddVan;
    private javax.swing.JMenuItem jMenuItemDisplayVans;
    private javax.swing.JMenuItem jMenuItemEditMail;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemLoad;
    private javax.swing.JMenuItem jMenuItemMailItem;
    private javax.swing.JMenuItem jMenuItemSave;
    private javax.swing.JMenuItem jMenuItemSearchVanID;
    private javax.swing.JMenuItem jMenuItemSortedVans;
    private javax.swing.JMenuItem jMenuItemVanSummary;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaMain;
    // End of variables declaration//GEN-END:variables
}
