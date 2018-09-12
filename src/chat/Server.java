package chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private ServerSocket server;
	
	public Server() throws IOException{
		server = new ServerSocket(8088);
		System.out.println("Waiting for a client's request to connect...");
		Socket socket = server.accept();
		System.out.println("One client connected!");
	}
	
	public static void main(String[] args) throws IOException {
		Server server = new Server();
	}
}
