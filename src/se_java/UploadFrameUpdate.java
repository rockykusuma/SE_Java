/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se_java;

import java.io.File;
import java.net.URL;
import java.util.Hashtable;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author Rakesh
 */
public class UploadFrameUpdate extends javax.swing.JFrame {

    public static URL MEDIA_Path;
    public static String mediapath;
    public static String ImagePath;
    /**
     * Creates new form UploadFrameUpdate
     */
    public UploadFrameUpdate() {
        initComponents();
        jTextField3.setVisible(false);

        
        
           Homebtn.setOpaque(false);
        Homebtn.setContentAreaFilled(false);
        Homebtn.setBorderPainted(false);
        
        Loginbtn.setOpaque(false);
        Loginbtn.setContentAreaFilled(false);
        Loginbtn.setBorderPainted(false);
        
        WatchVideosbtn.setOpaque(false);
        WatchVideosbtn.setContentAreaFilled(false);
        WatchVideosbtn.setBorderPainted(false);
        
        Contactbtn.setOpaque(false);
        Contactbtn.setContentAreaFilled(false);
        Contactbtn.setBorderPainted(false);
        
        Aboutbtn.setOpaque(false);
        Aboutbtn.setContentAreaFilled(false);
        Aboutbtn.setBorderPainted(false);

        Searchbtn.setOpaque(false);
        Searchbtn.setContentAreaFilled(false);
        Searchbtn.setBorderPainted(false);

        Uploadbtn.setOpaque(false);
        Uploadbtn.setContentAreaFilled(false);
        Uploadbtn.setBorderPainted(false);
        
        jTextField1.setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Homebtn = new javax.swing.JButton();
        Aboutbtn = new javax.swing.JButton();
        WatchVideosbtn = new javax.swing.JButton();
        Uploadbtn = new javax.swing.JButton();
        Contactbtn = new javax.swing.JButton();
        Loginbtn = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        Searchbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel2.setText("             Video Upload");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 250, 70));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel3.setText("Video Title");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 340, 30));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel4.setText("Description");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 340, 90));

        jButton1.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 580, 80, 20));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 340, 60));

        jButton2.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jButton2.setText("Upload");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 640, 110, 40));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel6.setText("File location");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 540, -1, 30));

        Homebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomebtnActionPerformed(evt);
            }
        });
        getContentPane().add(Homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 90, 40));

        Aboutbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aboutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Aboutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 90, 40));

        WatchVideosbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        WatchVideosbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WatchVideosbtnActionPerformed(evt);
            }
        });
        getContentPane().add(WatchVideosbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 100, 40));

        Uploadbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Uploadbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Uploadbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 90, 40));

        Contactbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Contactbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Contactbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 90, 40));

        Loginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 90, 40));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, 210, 50));

        Searchbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 60, 60, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackgroundLogout2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        JFileChooser filechooser = new JFileChooser();
        int result = filechooser.showOpenDialog(this);
        String res=null;
        if(result == JFileChooser.APPROVE_OPTION)
        {

            mediapath = filechooser.getSelectedFile().toString();

        }

        else
        {

            System.out.println("File Not Selected");
        }
        System.out.println("URL PATH-------------"+MEDIA_Path);
        System.out.println("ABSOLUTE PATH----------------------"+filechooser.getSelectedFile().getAbsolutePath());
        System.out.println("String PATH----------------------"+mediapath);

        //String finalpath = MEDIA_Path.toString();
        String finalpath = mediapath.toString();
        String[] validExtensions = {"avi", "mp4"};
        //for (int i=0; i<validExtensions.length;System.out.print (validExtensions[i++]));
        //String VideoPath =  finalpath.replace("file:/", "file:///");
        //System.out.println(VideoPath);

        String extension[]=finalpath.split("\\.");
        //System.out.println("\n\nExtension: "+ extension[extension.length - 1]);
        int isValid = 0;
        for (int flag=0;flag<validExtensions.length;flag++) {

            if(validExtensions[flag].compareToIgnoreCase(extension[extension.length - 1]) == 0) {

                System.out.print("\n\nMatched\n");
                isValid=1;
                break;
            }

        }
        if (isValid == 0)
        {
            JOptionPane.showMessageDialog(null,"FILE NOT SUPPORTED");
        }
        else
        {
            jTextField3.setVisible(true);
            jTextField3.setText(finalpath);
            jTextField3.enable(false);
            //  JOptionPane.showMessageDialog(null, "Storing: \""+VideoPath+"\"");
            //  DBConnection objDB = new DBConnection();
            //  objDB.storeInDB(VideoPath);

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String VideoName = jTextField1.getText();
        String VideoDescription = jTextArea1.getText();
        String VideoPath = jTextField3.getText();
        String Destinationpath = "";
        //String ImagePath1 = jTextField4.getText();
        System.out.println(VideoName+"---"+VideoPath);

        if(VideoName.contentEquals("")|| VideoDescription.contentEquals("")|| VideoPath.contentEquals(""))
        {
            JOptionPane.showMessageDialog(null, "fill all the fields");
        }
        else
        {

            try
            {
                File sourceFile = new File(VideoPath);
                String extensiontemp[]=sourceFile.getName().split("\\.");
                System.out.println("Extesnion is -------------"+ extensiontemp[extensiontemp.length-1]);
                String Temporary = extensiontemp[extensiontemp.length-1];
                // String Temporary = sourceFile.getName().replace(Temporary, Temporary)
                // File destinationFile = new File("D:\\SE_DATABASE\\Videos\\" + sourceFile.getName());
                    File destinationFile = new File("C:\\SE_DATABASE\\Videos\\" + VideoName+"."+Temporary);
                        //Destinationpath = "D:\\Partition1\\SE_DATABASE\\Videos\\" + sourceFile.getName();
                        Destinationpath = "C:\\SE_DATABASE\\Videos\\" + VideoName+"."+Temporary;
                        System.out.println("Source File---"+sourceFile.getName());
                        System.out.println("Destination File----"+destinationFile.getName()+"\n"+destinationFile);

                        UploadFrame copyFileExample = new UploadFrame();
                        JOptionPane.showMessageDialog(null, "Uploading takes few Moments of time");
                        copyFileExample.copyFile(sourceFile, destinationFile);

                        //JOptionPane.showMessageDialog(null, "Uploading takes few Moments of time");
                    }
                    catch (Exception e)
                    {
                    }
                    String Destinationpath12 =  Destinationpath.replace("\\", "/");            
                        System.out.println("Check 1234---"+Destinationpath12);
                        String temp = "file:///";
                        String Destinationpathfinal = temp+Destinationpath12;
                        System.out.println("Check 4321---"+Destinationpathfinal);

                        //String Destinationpath = "D:\\Partition1\\SE_DATABASE\\Videos\\" + sourceFile.getName();
                        DBConnection objDB = new DBConnection();
                        int i = objDB.storeInDB(VideoName,VideoDescription,Destinationpathfinal);

                        if (i==1)
                        {
                            JOptionPane.showMessageDialog(null, "Uploaded Succesfully");
                        }

                        //System.out.println(Destinationpathfinal);
                        //System.out.println(VideoDescription);
                        // System.out.println(VideoName);

                    }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void HomebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomebtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        HomePageUpdate.main(null);
    }//GEN-LAST:event_HomebtnActionPerformed

    private void AboutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutbtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        About.main(null);
    }//GEN-LAST:event_AboutbtnActionPerformed

    private void WatchVideosbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WatchVideosbtnActionPerformed
        // TODO add your handling code here:
        this.dispose();

        DBConnection Count = new DBConnection();
        Hashtable hashThumb =  Count.thumbCount();

        int nob=0;
        System.out.println("size"+hashThumb.size());

        ShowVideosUpdate.main(hashThumb);
    }//GEN-LAST:event_WatchVideosbtnActionPerformed

    private void UploadbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadbtnActionPerformed

        this.dispose();;
        UploadFrameUpdate.main(null);
    }//GEN-LAST:event_UploadbtnActionPerformed

    private void LoginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbtnActionPerformed
        // TODO add your handling code here
        this.dispose();
        LoginPage.main(null);
    }//GEN-LAST:event_LoginbtnActionPerformed

    private void SearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbtnActionPerformed
        // TODO add your handling code here:

        this.dispose();
        String SearchLetter =jTextField1.getText();
        DBConnection search = new DBConnection();
        Hashtable hash1 = search.searchInDB(SearchLetter);
        System.out.println("--------------"+hash1.toString());
        System.out.println(hash1.get(0));
        System.out.println("size"+hash1.size());
        // SearchFrame.main(hash1);
        ShowVideosUpdate.main(hash1);

    }//GEN-LAST:event_SearchbtnActionPerformed

    private void ContactbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactbtnActionPerformed

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
            java.util.logging.Logger.getLogger(UploadFrameUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UploadFrameUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UploadFrameUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UploadFrameUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UploadFrameUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aboutbtn;
    private javax.swing.JButton Contactbtn;
    private javax.swing.JButton Homebtn;
    private javax.swing.JButton Loginbtn;
    private javax.swing.JButton Searchbtn;
    private javax.swing.JButton Uploadbtn;
    private javax.swing.JButton WatchVideosbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
