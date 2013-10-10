package DiscussionForum;

import java.net.InetAddress;
import java.net.UnknownHostException;
 
public class IpAddress {
 
	public static void main(String[] args) {
            

 
	}
        
        
        public String Ip()
        {
             String IPA = null;
            InetAddress ip;
	  try {
               
		ip = InetAddress.getLocalHost();
		System.out.println("Current IP address : " + ip.getHostAddress());
                IPA = ip.getHostAddress();
	  } catch (UnknownHostException e) {
 
		e.printStackTrace();
 
	  }
            return IPA;
        }
        
        
 
}