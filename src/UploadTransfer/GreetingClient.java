/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UploadTransfer;

/**
 *

 */
import java.net.*;
import java.io.*;
import org.apache.commons.io.IOUtils;

public class GreetingClient
{
    public static void stream(InputStream in, OutputStream out)
        throws IOException {
    byte[] buf = new byte[1024];
    int bytesRead = 0;

    try {

        while (-1 != (bytesRead = in.read(buf, 0, buf.length))) {
            out.write(buf, 0, bytesRead);
        }

    } catch (IOException e) {
//        log.error("Error with streaming op: " + e.getMessage());
        throw (e);
    } finally {
                    try{
           in.close();
           out.flush();
           out.close();
                    } catch (Exception e){}//Ignore
    }
}
   public static void main(String [] args)
   {
      String serverName = "127.0.0.1";
      int port = Integer.parseInt("4445");
      try
      {
         System.out.println("Connecting to " + serverName + " on port " + port);
         Socket client = new Socket(serverName, port);
         
         OutputStream os = client.getOutputStream();
         InputStream is = new FileInputStream(new File("‪D:\\v\\java.mp4"));
          stream(is, os);
          
         client.close();
      }catch(IOException e)
      {
         e.printStackTrace();
      }
   }
}