/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se_java;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Rakesh
 */
public class UploadFrame extends javax.swing.JFrame {

    public static URL MEDIA_Path;
    public static String mediapath;
    public static String ImagePath;
    /**
     * Creates new form UploadFrame
     */
    public UploadFrame() {
        initComponents();
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
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
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(770, 470));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("             Video Upload");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 20, 150, 30);

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel3.setText("Video Title");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(410, 80, 70, 15);

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel4.setText("Description");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(410, 140, 70, 15);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(520, 80, 220, 30);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(520, 340, 230, 30);

        jButton1.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jButton1.setText("File Location");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(400, 340, 110, 30);

        jButton2.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jButton2.setText("Upload");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(610, 380, 130, 50);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(520, 120, 220, 110);

        jButton3.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 10, 70, 23);

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel5.setText("ThumbNail Image");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 260, 110, 20);

        jButton4.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jButton4.setText("Browse");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(660, 280, 80, 20);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(520, 250, 220, 30);

        jLabel6.setText("Only JPEG Format");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(410, 270, 100, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/corporate_01.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 751, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        String VideoName = jTextField1.getText();
        String VideoDescription = jTextArea1.getText();   
        String VideoPath = jTextField3.getText();
        String Destinationpath = "";
        String ImagePath1 = jTextField4.getText();
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
                File destinationFile = new File("D:\\SE_DATABASE\\Videos\\" + VideoName+"."+Temporary);
                //Destinationpath = "D:\\Partition1\\SE_DATABASE\\Videos\\" + sourceFile.getName();
                Destinationpath = "D:\\SE_DATABASE\\Videos\\" + VideoName+"."+Temporary;
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
                //int i = objDB.storeInDB(VideoName,VideoDescription,Destinationpathfinal,ImagePath1);
                
//                if (i==1)
//                {
//                    JOptionPane.showMessageDialog(null, "Uploaded Succesfully");
//                }

            //System.out.println(Destinationpathfinal);
            //System.out.println(VideoDescription);
           // System.out.println(VideoName);
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public void copyFile(File sourceFile, File destinationFile) {
           try {

                    System.out.println(sourceFile);
                    System.out.println(destinationFile);
                    FileUtils.copyFile(sourceFile, destinationFile);

           }
           catch (Exception e) 
           {
           }
   }

    
    
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        HomePage.main(null);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        JFileChooser filechooser = new JFileChooser();
        int result = filechooser.showOpenDialog(this);
        String res=null;
        if(result == JFileChooser.APPROVE_OPTION)
        {
            ImagePath = filechooser.getSelectedFile().toString();

        }
        
        else
        {
           
            System.out.println("File Not Selected");
        }
       
                 jTextField4.setVisible(true);
                jTextField4.setText(ImagePath);
                jTextField4.enable(false);
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UploadFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UploadFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
