/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketProgramming;

/**
 *
 * @author Rakesh
 */
import java.io.*;
import java.net.*;
public class Server
{
		public static String name__Server;
		public static ServerSocket ss_Server;
		public static BufferedReader kb_Server;
		public static Socket s_Server;
		public static BufferedReader cli_Server;
		public static PrintStream ps_Server;



	public static void main(String args[])throws IOException
	{
		
		ss_Server=new ServerSocket(102);
		System.out.print("Please Enter Your Name:");
		kb_Server=new BufferedReader(new InputStreamReader(System.in));
		name__Server=kb_Server.readLine();
		System.out.println("Waiting for users...........");
		s_Server=ss_Server.accept();
		cli_Server=new BufferedReader(new InputStreamReader(s_Server.getInputStream()));
		OutputStream out=s_Server.getOutputStream();
		ps_Server=new PrintStream(out);
		String str1,str2=null;
		System.out.println("Connected To "+cli_Server.readLine());
		ps_Server.println(name__Server);
		while((str1=cli_Server.readLine())!=null)
		{
			System.out.println(str1);
			System.out.print(name__Server+">:");
			
				ps_Server.println(name__Server+">:"+kb_Server.readLine());	
			
			
		}
		cli_Server.close();
		kb_Server.close();
		ps_Server.close();
	}
}