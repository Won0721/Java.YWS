package kh.model;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) {
		

		int port = 3000;
		String serverIP;

		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
//			serverIP = "192.168.20.34";
			Socket socket = new Socket(serverIP, port);
			System.out.println("connect");
		}catch(IOException e ) {
			System.out.println("IO");
		}
		catch(Exception e) {
			System.out.println("오류");
		}
		
	}

	
}
