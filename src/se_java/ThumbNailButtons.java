package se_java;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.Action.NAME;
  





public class ThumbNailButtons extends JFrame  
{  
    final java.util.List<JButton> buttons;  
     
    public ThumbNailButtons( Hashtable  hash )  
    {  
        
        super("PCS Videos");   
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        int numberOfButtons = hash.size();
        Container pane = getContentPane();
        JButton back = new JButton("back");
        back.addActionListener (new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              {
                 System.exit(0);
                  HomePage.main(null);
                  
              }
              
          });
        pane.add(back);
        pane.setLayout( new GridLayout( 4, 2 ) );   
        buttons = new ArrayList<>( numberOfButtons );                   
        for ( int i = 1; i <= numberOfButtons; i++ )  
        {  
            String temp = (String) hash.get(i);
            String TempFinal;
            TempFinal = temp.substring(temp.indexOf("os/")+3);
            //JButton button = new JButton( new SomeAction( "Video" , i ,hash)  );  
            
            JButton button = new JButton( new SomeAction( "" ,TempFinal)  ); 
            pane.add( button );  
            // Remember buttons in collection, we might need to access them sometime  
            buttons.add( button );  
        }  
        
        
        pack();  
    }  
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
        MediaPlayer.main(str);
        
        
    }  
}  