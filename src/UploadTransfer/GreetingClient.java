/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UploadTransfer;

/**
 *
 * @author veerendra
 */
import java.net.*;
import java.io.*;

public class GreetingClient
{
   public static void main(String [] args)
   {
      String serverName = "127.0.0.1";
      int port = Integer.parseInt("4444");
      try
      {
         System.out.println("Connecting to " + serverName
                             + " on port " + port);
         Socket client = new Socket(serverName, port);
         
         long filesize=2022386000;
        int bytesRead;
        int currentTot = 0;
         byte [] bytearray  = new byte [filesize];
        InputStream is = client.getInputStream();
        FileOutputStream fos = new FileOutputStream("a.mp3");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        
        bytesRead = is.read(bytearray,0,bytearray.length);
        currentTot = bytesRead;
 
        do {
           bytesRead =
              is.read(bytearray, currentTot, (bytearray.length-currentTot));
           if(bytesRead >= 0) currentTot += bytesRead;
        } while(bytesRead > -1);
        
        bos.write(bytearray, 0 , currentTot);
        bos.flush();
        bos.close();
        
         
         client.close();
      }catch(IOException e)
      {
         e.printStackTrace();
      }
   }
}