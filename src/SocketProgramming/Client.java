/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor. 
 */
package SocketProgramming;

//package com.net;
import java.io.*;
import java.net.*;
public class Client
{
	public static Socket s_Client;
	public static BufferedReader kb_Client;
	public static PrintStream ps_Client;
	public static BufferedReader ser_Client;
	public static String name_Client;
        
	public static void main(String args[])throws IOException
	{
		s_Client=new Socket("172.16.6.153",102);
		kb_Client=new BufferedReader(new InputStreamReader(System.in));
		ps_Client=new PrintStream(s_Client.getOutputStream());
		ser_Client=new BufferedReader(new InputStreamReader(s_Client.getInputStream()));
		System.out.print("Please Enter Your Name:");
		name_Client=kb_Client.readLine();
                //name_Client=na;
		String str1,str2;
		ps_Client.println(name_Client);
		System.out.print("You Are Now Connected To "+ser_Client.readLine()+" (enjoy typing...)");
		System.out.print(name_Client+">:");
		while(!(str1=kb_Client.readLine()).equals("exit"))
		{
			ps_Client.println(name_Client+">:"+str1);
			if (!(str2=ser_Client.readLine()).equals(""))
			{
				System.out.println(str2);
				str2="";
			}
				
			System.out.print(name_Client+">:");
		
		}
		kb_Client.close();
		ps_Client.close();
		ser_Client.close();
	}
}
