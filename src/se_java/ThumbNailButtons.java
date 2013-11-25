package se_java;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.Action.NAME;

public class ThumbNailButtons extends JFrame  
{  
  
     
}  
class SomeAction extends AbstractAction  
{  
    //public SomeAction( String text, int i,Hashtable hash )
    public SomeAction( String text, String temp )          
    {  
        
    //  String shrink = hash.get(i).toString();

        //super( text +""+i+"\n path is:"+hash.get(i)); 
         super( text +""+temp); 
    }  
      
    @Override
    public void actionPerformed( ActionEvent e )  
    {  
        //JOptionPane.showMessageDialog( null, "Action occured: " + getValue( NAME ) );        
        String str = "file:///D:/SE_DATABASE/Videos/"+(String) getValue( NAME );    
        System.out.println(str);
       // System.out.println("-----------------"+str.substring(16));   
        //String args = str.substring(str.indexOf(":")+1)  
        
        VideoResults.main((String) getValue( NAME ),str);
        
        //MediaPlayer.main(str);
        
        
    }  
}  