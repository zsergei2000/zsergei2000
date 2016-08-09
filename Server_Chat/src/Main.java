import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import chat.Main;

public class Main {

	public class Main extends JFrame implements Runnable{
		static private Socket connection;
		static private ObjectOutputStream output;
		static private ObjectInputStream input;
		
		static int number = 1;

		public static void main(String[] args) {
			//new Main("Test");
			new Thread(new Main("Test")).start();
			//new Thread(new Server()).start();
			
		}
		
		public Main (String name) {
			super(name);
			setLayout(new FlowLayout());
			setSize(300, 300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
			final JTextField t1 = new JTextField(10);
			final JButton b1 = new JButton("Send");
			final JButton b2 = new JButton("Restart");
			b1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					if(arg0.getSource()==b1){
						sendData(t1.getText());
					}
					
				}
			});
			b2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					if(arg0.getSource()==b2){
						restart();
					}
					
				}
			});
			add(t1);
			add(b1);
			add(b2);
			
		}

		@Override
		public void run() {
			while(number==1){
				
			
				try {
					while(true){
						//connection = new Socket(InetAddress.getByName("192.168.0.206"), 5678);
						connection = new Socket(InetAddress.getByName("192.168.0.2"), 5678);
						output = new ObjectOutputStream(connection.getOutputStream());
						input = new  ObjectInputStream(connection.getInputStream());
						JOptionPane.showMessageDialog(null, (String)input.readObject());
					} 
				} catch (UnknownHostException e) {
				} catch (IOException e) {
				} catch (HeadlessException e) {
				} catch (ClassNotFoundException e) {}
			}
			
		}
		
		private static void restart(){
			System.out.println("Restsrt");
			
			
		}
		
		private static void sendData(Object obj){
			try {
				output.flush();
				output.writeObject(obj);
			} catch (IOException e) {}
			
		}
	}
