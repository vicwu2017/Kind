package chat;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	private Socket socket;
	
	public Client() throws UnknownHostException, IOException{
		System.out.println("Client connection server...");
		socket = new Socket("localhost", 8088);
		System.out.println("Connected!");
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Client client = new Client();
		
	}
}
