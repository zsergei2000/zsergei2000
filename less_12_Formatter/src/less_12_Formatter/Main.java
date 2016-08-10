package less_12_Formatter;

import java.util.Formatter;
import java.util.Scanner;

public class Main {
	
	static Formatter x;
	static Scanner scn;

	public static void main(String[] args) {
		try {
			x = new Formatter("res//1.txt");
			scn = new Scanner(System.in);
			System.out.println("Сколько Вам лет");
			int a = (int)Double.parseDouble(scn.next());
			System.out.println("Как Вас Зовут");
			String b = scn.next();
			System.out.println("Где Вы живете?");
			String c = scn.next();
			x.format("Меня зовут %s, мне %d лет, я живу в городе %s", b, a, c);
			x.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
