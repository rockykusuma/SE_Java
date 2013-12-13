 
package se_java;
 
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.embed.swing.JFXPanel;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebEvent;
import javafx.scene.web.WebView;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.concurrent.Worker.State.FAILED;
import static se_java.HomePageUpdate.loginName;

 

public class SimpleSwingBrowser1 extends JFrame {
    static SimpleSwingBrowser1 browser = new SimpleSwingBrowser1();
    private JFXPanel jPanel1;
    private WebEngine engine;
    private JPanel panel;
    private  JTextField txtURL = new JTextField();
    public static String VideoName1;
    //   ----------------------------------------------------------------------
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
    //private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
  //   -----------------------------------------------------------------------
    public SimpleSwingBrowser1() {
        super();
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
       
    }

    private void initComponents() {
    //    jfxPanel = new JFXPanel();
         jPanel1 = new JFXPanel();
        createScene();
        //   -----------------------------------------------------------------------

 
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
//        jPanel1 = new javax.swing.JPanel();
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
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 580, 330));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackgroundLogout2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 770));
  
//   -----------------------------------------------------------------------
        System.out.println("QWERTYUIOP"+VideoName1);
        jTextField2.setText(VideoName1);
        pack();
    }
    
   
    private void HomebtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        this.setVisible(false);
        HomePageUpdate.main(null);
    }                                       

    private void AboutbtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.setVisible(false);
        About.main(null);
    }                                        

    private void WatchVideosbtnActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        this.setVisible(false);

        DBConnection Count = new DBConnection();
        Hashtable hashThumb =  Count.thumbCount();

        int nob=0;
        System.out.println("size"+hashThumb.size());

        ShowVideosUpdate.main(hashThumb);
    }                                              

    private void UploadbtnActionPerformed(java.awt.event.ActionEvent evt) {                                          

        this.setVisible(false);
        UploadFrameUpdate.main(null);
    }                                         

    private void LoginbtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here
        this.setVisible(false);
        LoginPage.main(null);
    }                                        

    private void SearchbtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:

        this.setVisible(false);
        String SearchLetter =jTextField1.getText();
        DBConnection search = new DBConnection();
        Hashtable hash1 = search.searchInDB(SearchLetter);
        System.out.println("--------------"+hash1.toString());
        System.out.println(hash1.get(0));
        System.out.println("size"+hash1.size());
        // SearchFrame.main(hash1);
        ShowVideosUpdate.main(hash1);
    }                                         

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:

    }                                           

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        // TODO add your handling code here:
        //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
            final DateFormat timeFormat = new SimpleDateFormat("dd/MMM/yyyy    hh:mm:ss a");  
            Date date = new Date(); 
            String d = timeFormat.format(date); 
            String Name = jTextField2.getText();
            int id=0;
            if(Name.contains("Java"))
            {
                id = 2;
            }
            if(Name.contains("DBMS"))
            {
                id = 7;
            }
            if(Name.contains("Python"))
            {
                id = 13;
            }
            System.out.println("IDENTITY NUMBER______--->"+id);
            String FullString = id+"_"+loginName+"_"+jTextArea2.getText().toString()+"_"+d;

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
                    System.out.println("Testing 12345676789");
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
                         JOptionPane.showMessageDialog(null,"Question Successfully Posted");
                    }

                    FileOutputStream fop =fop = new FileOutputStream(file);
                    String content="";
                    byte[] contentInBytes = content.getBytes();
                    fop.write(contentInBytes);

                }
              // new DBConnection2().StoreinForum(FullString);
                new DBConnectionServer().StoreinForum(FullString);
                JOptionPane.showMessageDialog(null,"Question Successfully Posted");

            }
        }

        catch(Exception  ex)
        {

        }


    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String d;
        d = (String)dateFormat.format(date);
        
           String Name = jTextField2.getText();
            int id=0;
            if(Name.contains("Java"))
            {
                id = 2;
            }
            if(Name.contains("DBMS"))
            {
                id = 7;
            }
            if(Name.contains("Python"))
            {
                id = 13;
            }
            System.out.println("IDENTITY NUMBER______--->"+id);
            String FullString = id+"_"+loginName+"_"+jTextArea2.getText().toString()+"_"+d;

        try
        {
             // if(!new DBConnection2().DBConnection()){
                if(!new DBConnectionServer().DBConnection()){

                File file = new File("write2.txt");

                Scanner sc=new Scanner(file);
                String temp="";
                while(sc.hasNext())
                temp+=sc.nextLine()+"\n";
                temp+=FullString+"\n";
                FileWriter f = new FileWriter(new File("write2.txt"));
                System.out.print (temp);
                f.write(temp);
                f.close();
                System.out.println("Done");
                JOptionPane.showMessageDialog(null,"No Internet Connection-- Your Comment will be Posted when connection establishes");

            }
            else{
                    System.out.println("Testing 12345676789");
                File file = new File("write2.txt");
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
                        new DBConnectionServer().StoreinComment(temp);
                         JOptionPane.showMessageDialog(null,"Comment Successfully Posted");
                    }

                    FileOutputStream fop =fop = new FileOutputStream(file);
                    String content="";
                    byte[] contentInBytes = content.getBytes();
                    fop.write(contentInBytes);

                }
              // new DBConnection2().StoreinForum(FullString);
                new DBConnectionServer().StoreinComment(FullString);
                JOptionPane.showMessageDialog(null,"Comment Successfully Posted");

            }
        }

        catch(Exception  ex)
        {

        }

        
        

    }                                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           


    private void createScene() {

        Platform.runLater(new Runnable() {
            
            public void run() {

                WebView view = new WebView();
                engine = view.getEngine();
                engine.getLoadWorker()
                        .exceptionProperty()
                        .addListener(new ChangeListener<Throwable>() {

                            public void changed(ObservableValue<? extends Throwable> o, Throwable old, final Throwable value) {
                                if (engine.getLoadWorker().getState() == FAILED) {
                                    SwingUtilities.invokeLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            JOptionPane.showMessageDialog(
                                            panel,
                                            (value != null)
                                            ? engine.getLocation() + "\n" + value.getMessage()
                                            : engine.getLocation() + "\nUnexpected error.",
                                            "Loading error...",
                                            JOptionPane.ERROR_MESSAGE);
                                        }
                                    });
                                }
                            }
                        });

             //  jfxPanel.setScene(new Scene(view));
                jTextField2.setText(VideoName1);
               jPanel1.setScene(new Scene(view));
            }
        });
    }

    public void loadURL(final String url) {
        Platform.runLater(new Runnable() {
            
            public void run() {
                String tmp = toURL(url);

                if (tmp == null) {
                    tmp = toURL("http://" + url);
                }
                System.out.println("Tmp--"+tmp);
                engine.load(tmp);
            }
        });
    }

    private static String toURL(String str) {
        try {
            return new URL(str).toExternalForm();
        } catch (MalformedURLException exception) {
            return null;
        }
    }
    public static void changeVideoname(String videoname) throws IOException
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:/SE_DATABASE/Videos/abc.html")); //you don't need to create a File object, FileWriter takes a string for the filepath as well
        writer.write("Student number...1"); 
        writer.write(videoname);
       
    }
    public static void main(String VideoName) {
  //      System.out.println("ABCDEFGHIJKL"+VideoName);
        VideoName1 = VideoName;
        
        System.out.println("GOPIKRISHNA---"+VideoName1);
        SwingUtilities.invokeLater(new Runnable() {
            
            public void run() {
                
                browser.setVisible(true);
                browser.loadURL("file:///C:/SE_DATABASE/Videos/abc.html");
            }
        });
    }
}
