package less_13_Potoki;

import java.util.Random;

public class potok implements Runnable {
	
	int time;
	String name;
	Random r = new Random();

	public potok(String name){
		this.name = name;
		time = r.nextInt(999);
	}
	
	@Override
	public void run() {
		System.out.printf("Поток %s спит %d\n", name, time);
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.printf("Поток %s проснулся и закончился\n", name);

	}

}
