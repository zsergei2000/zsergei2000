import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import server_listen.Main;

public class Server {

	public class Server implements Runnable {
		static private ServerSocket server;
		static private Socket connection;
		static private ObjectOutputStream output;
		static private ObjectInputStream input;
		
		static private String a;
		
		 private int Cont = 1;
		
		

		public void run() {
			System.out.println("����� ������� ������� " + Main.number);
			try {
				server = new ServerSocket(5678, 10);
				System.out.println("����� �������1");
				//System.out.println(Cont);
				//System.out.println(Main.number);
				while(Main.number==1){
					//Cont = Main.number;
					if(Main.number!=1){
						System.out.println("����� ����������1");
						
					}
					//System.out.println(Main.number);
					System.out.println(Main.number);
					//need_stop = 1;
					//if(!isInterrupted()){
						connection = server.accept();
						output = new ObjectOutputStream(connection.getOutputStream());
						input = new  ObjectInputStream(connection.getInputStream());
						a = (String)input.readObject();
						//output.writeObject("�� �������� c ������ �����: " + (String)input.readObject());
						output.writeObject("�� �������� c ������ �����: " + a + Integer.toString(Cont));
						//System.out.println("����������� �� ������" + (String)input.readObject());
						System.out.println("����������� �� ������" + a);
					//} else {
					//	throw new InterruptedException();
					
					//}
				} 
				//System.out.println("����� ����������");
				//System.out.println("����� �������");
			} catch (UnknownHostException e) {System.out.println(e);
			} catch (IOException e) {System.out.println(e);
			} catch (HeadlessException e) {System.out.println(e);
			} catch (ClassNotFoundException e) {System.out.println(e);}
			System.out.println("����� ���������� " + Main.number);
			try {
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}