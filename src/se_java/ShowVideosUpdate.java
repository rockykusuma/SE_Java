/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se_java;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Rakesh
 */
public class ShowVideosUpdate extends javax.swing.JFrame {
final java.util.List<JButton> buttons;
   

    /**
     * Creates new form ShowVideosUpdate
     */
    
    public ShowVideosUpdate( Hashtable  hash ) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException  
    {  
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

        
        System.out.println("Testing 123");
        //super("PCS Videos");   
    //    JFrame.setDefaultLookAndFeelDecorated(true);
        
      //  setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        setLocationRelativeTo(null);
        int numberOfButtons = hash.size();
        Container pane = getContentPane();
        setLayout(new BorderLayout());
       // JLabel background = new JLabel(new ImageIcon("‪C:\\Users\\Rakesh\\Desktop\\ron0a.jpg"));
        //add(background);
        
       //pane.setBackground(Color.yellow);
       // pane.
       
       
       jLabel1.setLayout( new FlowLayout() );   
        buttons = new ArrayList<>( numberOfButtons );                   
        for ( int i = 1; i <= numberOfButtons; i++ )  
        {  
            System.out.println(hash.get(i));
            String temp = (String) hash.get(i);
            String TempFinal;
            TempFinal = temp.substring(temp.indexOf("os/")+3);
            //JButton button = new JButton( new SomeAction( "Video" , i ,hash)  );  
            
            JButton button = new JButton( new SomeAction( "" ,TempFinal)  );
            
            DBConnection image = new DBConnection();
         //   image.GetImage();
            
          //  byte[] imagedata = image.GetImage((String) hash.get(i));
            //java.awt.Image img = Toolkit.getDefaultToolkit().createImage(imagedata);
       //     ImageIcon icon =new ImageIcon(img);
//JLabel lPhoto = new JLabel(icon) ; 
           // button.setIcon(icon);
            button.setPreferredSize(new Dimension(100, 100));
            jLabel1.add( button );  
            // Remember buttons in collection, we might need to access them sometime  
            buttons.add( button );  
        }  
        
        
        pack();  
    }  

    private ShowVideosUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Searchbtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        Loginbtn = new javax.swing.JButton();
        Contactbtn = new javax.swing.JButton();
        Uploadbtn = new javax.swing.JButton();
        WatchVideosbtn = new javax.swing.JButton();
        Aboutbtn = new javax.swing.JButton();
        Homebtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Searchbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 60, 60, 50));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, 210, 50));

        Loginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 90, 40));

        Contactbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Contactbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 90, 40));

        Uploadbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Uploadbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Uploadbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 90, 40));

        WatchVideosbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        WatchVideosbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WatchVideosbtnActionPerformed(evt);
            }
        });
        getContentPane().add(WatchVideosbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 100, 40));

        Aboutbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aboutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Aboutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 90, 40));

        Homebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomebtnActionPerformed(evt);
            }
        });
        getContentPane().add(Homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackgroundLogout2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        ShowVideos.main(hash1);
    }//GEN-LAST:event_SearchbtnActionPerformed

    private void UploadbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadbtnActionPerformed

        this.dispose();;
        UploadFrameUpdate.main(null);
    }//GEN-LAST:event_UploadbtnActionPerformed

    private void WatchVideosbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WatchVideosbtnActionPerformed
        // TODO add your handling code here:
        this.dispose();

        DBConnection Count = new DBConnection();
        Hashtable hashThumb =  Count.thumbCount();

        int nob=0;
        System.out.println("size"+hashThumb.size());

        ShowVideos.main(hashThumb);
    }//GEN-LAST:event_WatchVideosbtnActionPerformed

    private void AboutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutbtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        About.main(null);
    }//GEN-LAST:event_AboutbtnActionPerformed

    private void HomebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomebtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        HomePageUpdate.main(null);
    }//GEN-LAST:event_HomebtnActionPerformed

    private void LoginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbtnActionPerformed
        // TODO add your handling code here
        this.dispose();
        LoginPage.main(null);
    }//GEN-LAST:event_LoginbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(final Hashtable  hash) {
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
            java.util.logging.Logger.getLogger(ShowVideosUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowVideosUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowVideosUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowVideosUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ShowVideosUpdate(hash).setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ShowVideosUpdate.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(ShowVideosUpdate.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(ShowVideosUpdate.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ShowVideosUpdate.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
