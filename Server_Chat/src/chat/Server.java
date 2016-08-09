package chat;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class Server implements Runnable {
	static private ServerSocket server;
	static private Socket connection;
	static private ObjectOutputStream output;
	static private ObjectInputStream input;
	static private int Cont = 1;

	public void run() {
		try {
			server = new ServerSocket(5678, 10);
			while(Cont==1){
				Cont = Main.number;
				//connection = new Socket(InetAddress.getByName("192.168.0.206"), 5678);
				//connection = new Socket(InetAddress.getByName("192.168.0.2"), 5678);
				connection = server.accept();
				output = new ObjectOutputStream(connection.getOutputStream());
				input = new  ObjectInputStream(connection.getInputStream());
				output.writeObject("Вы прислали 0: " + (String)input.readObject());
				//JOptionPane.showMessageDialog(null, (String)input.readObject());
			} 
		} catch (UnknownHostException e) {
		} catch (IOException e) {
		} catch (HeadlessException e) {
		} catch (ClassNotFoundException e) {}
		
		
	}

}
