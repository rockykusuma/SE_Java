/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se_java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author Rakesh
 */

class FileWrite
{
public static void main(String videoName)throws IOException 
{
try{
   FileOutputStream f=new FileOutputStream("E:\\SE_DATABASE\\Videos\\abc.html");
    try (PrintStream p = new PrintStream(f)) {
        p.println("<html><body><video id=myvideo controls><source src="+videoName+" type=video/mp4></video></body></html>");
    }
    SimpleSwingBrowser1.main(videoName);
 }
 catch(FileNotFoundException e)
 {
 }
  
}
}
