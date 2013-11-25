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
// File Name GreetingServer.java

import java.net.*;
import java.io.*;

public class GreetingServer extends Thread
{
   private ServerSocket serverSocket;
   
   public GreetingServer(int port) throws IOException
   {
      serverSocket = new ServerSocket(port);
      //serverSocket.setSoTimeout(10000);
   }

   public void run()
   {
      while(true)
      {
         try
         {
            System.out.println("Waiting for client on port " +
            serverSocket.getLocalPort() + "...");
            Socket server = serverSocket.accept();
            
            
            File transferFile = new File ("D:\\Partition 2\\Music\\Audio Songs\\Zanjeer (2013)\\01 - Mumbai Ke Hero [DoReGaMa].mp3");
              byte [] bytearray  = new byte [(int)transferFile.length()];
              FileInputStream fin = new FileInputStream(transferFile);
              BufferedInputStream bin = new BufferedInputStream(fin);
              OutputStream os = server.getOutputStream();
              System.out.println("Sending Files...");
              while(bin.read(bytearray,0,bytearray.length)>1)
              {
                  
              os.write(bytearray,0,bytearray.length);
              os.flush();
              }
              System.out.println("File Sent");


            server.close();
         }catch(SocketTimeoutException s)
         {
            System.out.println("Socket timed out!");
            break;
         }catch(IOException e)
         {
            e.printStackTrace();
            break;
         }
      }
   }
   public static void main(String [] args)
   {
//      int port = Integer.parseInt(args[0]);
      try
      {
         Thread t = new GreetingServer(4444);
         t.start();
      }catch(IOException e)
      {
         e.printStackTrace();
      }
   }
}