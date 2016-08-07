package less_7_GUI_JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.xml.ws.handler.Handler;

public class Reader extends JFrame {
	JButton b1, b2;
	JLabel l1, l2, l3, l4;
	JTextField t1, t2;
	int i, k;
	String a,b;
	eHandler handler = new eHandler();
	
	public Reader(String s){
		//����� ����� JFrame
		//s - � ������������ ��� �����
		super(s);
		//������������� ������ - ��������
		setLayout(new FlowLayout());
		
		//���������� ����� ������
		//��� ��������� �.�. ������ �����
		//JButton b1 = new JButton(); - � ����� ������ ��� ��������
		//JButton b1, b2;
		
		b1 = new JButton("��������"); //������� �� ������
		b2 = new JButton("���������");
		
		l1 = new JLabel("������� ������ �����");
		l2 = new JLabel("������� ������ �����");
		l3 = new JLabel("");
		l4 = new JLabel("");
		
		t1 = new JTextField(10); // 10 - ������ ���� ����� � ��������
		t2 = new JTextField(10); // 10 - ������ ���� ����� � ��������
		
		//������ ��������� �������� �� ����� - add - ����������
		add(b1);
		add(b2);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		
		add(t1);
		add(t2);
		
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		
	}
	
	//������� ����� ������ ������
	//�� ������ ������������ ��� ���������� �� �������� ������ Reader
	//Add Unimplements Method!!!
	//
	public class eHandler implements ActionListener{

		//������� @Override
		//���� ����� ����� ��� ������������ �������� �� ����� ��������� 
		public void actionPerformed(ActionEvent e) {
			try{
				if(e.getSource() == b2){
					i = Integer.parseInt(t1.getText());
					k = Integer.parseInt(t2.getText());
					i++;
					k++;
					a = "���� ������ ����� ������ ����� " + i;
					b = "���� ������ ����� ������ ����� " + k;
					l3.setText(a);
					l4.setText(b);
				}
				if(e.getSource() == b1){
					t1.setText(null);
					t2.setText(null);
					l3.setText(null);
					l4.setText(null);
				}
			}catch (Exception ex) { JOptionPane.showMessageDialog(null, "������� � ���� �����");
				// TODO: handle exception
			}
			
		}
		
	}
}
