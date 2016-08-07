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
		//Супер класс JFrame
		//s - в конструкторе имя формы
		super(s);
		//Устанавливаем Лэйаут - подложку
		setLayout(new FlowLayout());
		
		//Определяем новую кнокпу
		//Код комментим т.к. делаем проще
		//JButton b1 = new JButton(); - в самом начале это пропишем
		//JButton b1, b2;
		
		b1 = new JButton("Очистить"); //Надпись на кнопке
		b2 = new JButton("Посчитать");
		
		l1 = new JLabel("Введите первое число");
		l2 = new JLabel("Введите второе число");
		l3 = new JLabel("");
		l4 = new JLabel("");
		
		t1 = new JTextField(10); // 10 - ширина поля ввода в символах
		t2 = new JTextField(10); // 10 - ширина поля ввода в символах
		
		//Теперь добавляем элементы на экран - add - добавление
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
	
	//Создаем класс внутри класса
	//Он сможет заимствовать все переменные из верхнего класса Reader
	//Add Unimplements Method!!!
	//
	public class eHandler implements ActionListener{

		//Убираем @Override
		//Этот метод ловит все производимые действия на форме программы 
		public void actionPerformed(ActionEvent e) {
			try{
				if(e.getSource() == b2){
					i = Integer.parseInt(t1.getText());
					k = Integer.parseInt(t2.getText());
					i++;
					k++;
					a = "Ваше первое число теперь равно " + i;
					b = "Ваше второе число теперь равно " + k;
					l3.setText(a);
					l4.setText(b);
				}
				if(e.getSource() == b1){
					t1.setText(null);
					t2.setText(null);
					l3.setText(null);
					l4.setText(null);
				}
			}catch (Exception ex) { JOptionPane.showMessageDialog(null, "Введите в поле число");
				// TODO: handle exception
			}
			
		}
		
	}
}
