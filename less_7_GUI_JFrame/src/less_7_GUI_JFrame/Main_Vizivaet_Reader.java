package less_7_GUI_JFrame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main_Vizivaet_Reader {

	
	public static void main(String[] args) {
		Reader r = new Reader("��������� �����");
		//�������� ��������� ����
		r.setVisible(true); 
		//���������� ��� ����� ����������� ���� ��� ������� ��������
		//������ ������ �������� ������
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//��������� ������ ���� ������ � ������
		r.setSize(300, 200);
		//�������� ������ ������ ����
		r.setResizable(false);
		//������� ��������� � ������ ����
		r.setLocationRelativeTo(null);

	}

}
