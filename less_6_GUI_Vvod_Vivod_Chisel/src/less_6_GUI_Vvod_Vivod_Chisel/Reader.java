package less_6_GUI_Vvod_Vivod_Chisel;

import javax.swing.JOptionPane;

public class Reader {
	int i, k;
	String n1, n2;
	public void Scan(){
		n1 = JOptionPane.showInputDialog("������� ������ �����");
		n2 = JOptionPane.showInputDialog("������� ������ �����");
		i = Integer.parseInt(n1);
		k = Integer.parseInt(n2);
		
	}
	
	public void Scan(int a, int b){
		JOptionPane.showMessageDialog(null, "������ ���� ������ ����� = " + a);
		JOptionPane.showMessageDialog(null, "������ ���� ������ ����� = " + b);

		
	}

}
