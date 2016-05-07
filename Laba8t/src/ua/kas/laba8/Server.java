package ua.kas.laba8;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javafx.collections.ObservableList;

public class Server implements Runnable{

	static private ServerSocket server;
	static private Socket connection;
	static private ObjectOutputStream output;
	static private ObjectInputStream input;
	
	@Override
	public void run() {
		
		try {
			server = new ServerSocket(5678, 10);
			while (true) {
				connection = server.accept();
				output = new ObjectOutputStream(connection.getOutputStream());
				input = new ObjectInputStream(connection.getInputStream());
				String number = (String)input.readObject();
				
				if(Integer.parseInt(number)>=1){
					output.writeObject("You number is: "+ number );
					
					for(int i=1; i<=Integer.parseInt(number); i++){
						System.out.println(i);
					}
				}
				
				if(Integer.parseInt(number)<1){
					output.writeObject("Uncorrect number");
				}
			} 
			
		}catch (Exception ex){};
	}
}
