package org.subwaySoriana.ExcelFiles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.PasswordAuthentication;
import java.net.URL;

public class PasswordURL {
	public void openingURL() throws Exception{
		Authenticator.setDefault(new MyAuthenticator());
	    URL url = new URL("https://partners.subway.com/portal/default.aspx");
		//URL url = new URL("https://accounts.google.com/ServiceLogin#identifier");
	    System.out.println("accessing to Partners Subway");
	    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
	    String str;
	    while ((str = in.readLine()) != null) {
	      System.out.println(str);
	    }
	    in.close();
	}	
}

class MyAuthenticator extends Authenticator {
	  
	  protected PasswordAuthentication getPasswordAuthentication() {
	    String promptString = getRequestingPrompt();
	    System.out.println("Printing promptString");
	    System.out.println(promptString);
	    String hostname = getRequestingHost();
	    System.out.println(hostname);
	    InetAddress ipaddr = getRequestingSite();
	    System.out.println(ipaddr);
	    int port = getRequestingPort();

	    String username = "098271gg";
	    String password = "NKiKxeo140	";
	    return new PasswordAuthentication(username, password.toCharArray());
	  }
	}
