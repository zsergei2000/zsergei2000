import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Calc_F {
	//JTextField textField;

	private JFrame frame;
	private JTextField textField;
	
	static private String current_text_calk = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc_F window = new Calc_F();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc_F() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 264, 306);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickButton("1");
			}
		});
		btnNewButton.setBounds(8, 55, 52, 42);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickButton("2");
			}
		});
		button.setBounds(68, 55, 52, 42);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickButton("3");
			}
		});
		button_1.setBounds(128, 55, 52, 42);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickButton("4");
			}
		});
		button_2.setBounds(188, 55, 52, 42);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickButton("5");
			}
		});
		button_3.setBounds(8, 108, 52, 42);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickButton("6");
			}
		});
		button_4.setBounds(68, 108, 52, 42);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickButton("7");
			}
		});
		button_5.setBounds(128, 108, 52, 42);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickButton("8");
			}
		});
		button_6.setBounds(188, 108, 52, 42);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickButton("9");
			}
		});
		button_7.setBounds(8, 161, 52, 42);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickButton("0");
			}
		});
		button_8.setBounds(68, 161, 52, 42);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("-");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_9.setBounds(128, 161, 52, 42);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("+");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_10.setBounds(188, 161, 52, 42);
		frame.getContentPane().add(button_10);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(8, 11, 232, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_11.setBounds(8, 214, 52, 42);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_12.setBounds(68, 214, 52, 42);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_13.setBounds(128, 214, 112, 42);
		frame.getContentPane().add(button_13);
	}
	
	private void clickButton(String batt_name){
		current_text_calk = batt_name + current_text_calk;
		textField.setText(current_text_calk);
		
	}
}
