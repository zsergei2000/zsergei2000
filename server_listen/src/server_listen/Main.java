package server_listen;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class Main extends JFrame implements Runnable{
	static private Socket connection;
	static private ObjectOutputStream output;
	static private ObjectInputStream input;
	
	static private String serverState;
	static private String a;
	
	static int number;
	
	JLabel l1;
	
	public int need_stop;
	
	static private Thread mainThread;

	public static void main(String[] args) {
		new Main("Test");
	}
	
	public Main (String name) {
		super(name);
		setLayout(new FlowLayout());
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		a = "Сервер остановлен";
		final JTextField t1 = new JTextField(10);
		final JButton b1 = new JButton("Start Server");
		final JButton b2 = new JButton("Stop Server");
		l1 = new JLabel(a);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==b1){
					serverStart();
					//number = 1;
					a = "Сервер стартовал";
					//need_stop = 0;
					l1.setText(a);
				}
				/*
				if(arg0.getSource()==b2){
					serverStop();
					a = "Сервер остановился";
					l1.setText(a);
				}*/
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				/*if(arg0.getSource()==b1){
					serverStart();
					a = "Сервер стартовал";
					l1.setText(a);
				}*/
				if(arg0.getSource()==b2){
					serverStop();
					a = "Сервер остановился";
					l1.setText(a);
				}
			}
		});
		add(b1);
		add(b2);
		add(l1);
	}

	@Override
	public void run() {
	/*	try {
			while(true){
				connection = new Socket(InetAddress.getByName("192.168.0.206"), 5678);
				//connection = new Socket(InetAddress.getByName("192.168.0.2"), 5678);
				output = new ObjectOutputStream(connection.getOutputStream());
				input = new  ObjectInputStream(connection.getInputStream());
				JOptionPane.showMessageDialog(null, (String)input.readObject());
			} 
		} catch (UnknownHostException e) {
		} catch (IOException e) {
		} catch (HeadlessException e) {
		} catch (ClassNotFoundException e) {}
		*/
		
	}
	
	private static void serverStart() {
		number = 1;
		mainThread = new Thread(new Server());
		mainThread.start();
		//new Thread(new Server()).start();
		System.out.println("Сервер стартовал");
	}
	
	
	private static void serverStop() {
		//mainThread = new Thread(new Server());
		//mainThread.interrupt();
		//new Thread(new Server()).start();
		number ++;
		System.out.println("Сервер остановился");
		System.out.println("number " + number);
	}
	
}
