package less_7_GUI_JFrame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main_Vizivaet_Reader {

	
	public static void main(String[] args) {
		Reader r = new Reader("Заголовок проги");
		//Включаем видимость окна
		r.setVisible(true); 
		//Определяем как будет закрываться окно при нажатии крестика
		//Обычно всегда подобная строка
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Установим размер окна высота и ширина
		r.setSize(300, 200);
		//Запретим менять размер окна
		r.setResizable(false);
		//Покажем программу в центре окна
		r.setLocationRelativeTo(null);

	}

}
