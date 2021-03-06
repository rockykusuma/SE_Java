/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se_java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rakesh
 */
public class VideoResultsUpdate extends javax.swing.JFrame {

    /**
     * Creates new form VideoResultsUpdate
     */
    
    public static String VideoName,VideoPath;
    public VideoResultsUpdate() {
        initComponents();
        
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
        
//        jButton3.setOpaque(false);
//        jButton3.setContentAreaFilled(false);
//        jButton3.setBorderPainted(false);
        
        jTextField2.setText(VideoName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Homebtn = new javax.swing.JButton();
        Aboutbtn = new javax.swing.JButton();
        WatchVideosbtn = new javax.swing.JButton();
        Uploadbtn = new javax.swing.JButton();
        Contactbtn = new javax.swing.JButton();
        Loginbtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        Searchbtn = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(Contactbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 90, 40));

        Loginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 90, 40));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, 210, 50));

        Searchbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 60, 60, 50));

        jTextField2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 210, 30));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel2.setText("Video Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 110, 30));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setText("Discussion Forum");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, 180, 30));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, 430, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 520, 430, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setText("Comments");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, 110, 30));

        jButton2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton2.setText("Post");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 410, -1, -1));

        jButton1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton1.setText("Comment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 650, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 530, 330));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackgroundLogout2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomebtnActionPerformed
        // TODO add your handling code here:
     //   this.dispose();
        this.setVisible(false);
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

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // TODO add your handling code here:
        //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
            final DateFormat timeFormat = new SimpleDateFormat("dd/MMM/yyyy    hh:mm:ss a");  
            Date date = new Date(); 
            String d = timeFormat.format(date); 
            String FullString = "Uname"+"*"+jTextArea2.getText().toString()+"*"+jTextField1.getText().toString()+"*"+d;

        try
        {
           // if(!new DBConnection2().DBConnection()){
                if(!new DBConnectionServer().DBConnection()){
                File file = new File("write.txt");

                Scanner sc=new Scanner(file);
                String temp="";
                while(sc.hasNext())
                temp+=sc.nextLine()+"\n";
                temp+=FullString+"\n";
                FileWriter f = new FileWriter(new File("write.txt"));
                System.out.print (temp);
                f.write(temp);
                f.close();
                System.out.println("Done");
                JOptionPane.showMessageDialog(null,"No Internet Connection-- Your Question will be Posted when connection establishes");

            }
            else{
                File file = new File("write.txt");
                if(file.exists()){

                    Scanner s=new Scanner(file);
                    while(s.hasNext()){

                        String temp=s.nextLine();
                        System.out.println(""+temp);
                        if(temp.equals("") || temp.equals(null))
                        {

                        }
                        else
                        //new DBConnection2().StoreinForum(temp);
                        new DBConnectionServer().StoreinForum(temp);
                    }

                    FileOutputStream fop =fop = new FileOutputStream(file);
                    String content="";
                    byte[] contentInBytes = content.getBytes();
                    fop.write(contentInBytes);

                }
               // new DBConnection2().StoreinForum(FullString);
                new DBConnectionServer().StoreinForum(FullString);

            }
        }

        catch(Exception  ex)
        {

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try {
            // TODO add your handling code here:
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            String d;
            d = (String)dateFormat.format(date);

            DBConnection DiscForum = new DBConnection();
            DiscForum.DiscussionForum("UName",jTextArea1.getText().toString(),jTextField1.getText().toString(),d);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VideoResults.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VideoResults.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String Name, String Path) {
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
            java.util.logging.Logger.getLogger(VideoResultsUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VideoResultsUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VideoResultsUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VideoResultsUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         VideoName=Name;
         VideoPath=Path;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VideoResultsUpdate().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
