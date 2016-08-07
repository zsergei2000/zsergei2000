package less_5_Nasledovanie_Metodi_Klassa_Roditelya;

public class Klass_Delaet_Zapros_V_Klaasi_Rebenki {	
	public static void main(String[] args) {
		
		Rebenok_1 r1 = new Rebenok_1();
		Rebenok_2 r2 = new Rebenok_2();
		Rebenok_3 r3 = new Rebenok_3();
		
		//Пример для метода перегрузки
		Rebenok_4_Peregruzka_Metoda_Podmena r4 = new Rebenok_4_Peregruzka_Metoda_Podmena();
		
		//Пример работы напрямик с классом Main_Roditel
		Main_Roditel mr = new Main_Roditel();
		
		
		r1.Metod_Rebenok_();
		r2.Metod_Rebenok_();
		r3.Metod_Rebenok_();
		
		//Пример для метода перегрузки
		r4.Metod_Rebenok_();
		
		//Пример работы напрямик с классом Main_Roditel
		mr.Metod_Rebenok_();
		
		
		//Вначале метод был в каждом классе отдельно
		//r1.Metod_Rebenok_1();
		//r2.Metod_Rebenok_2();
		//r3.Metod_Rebenok_3();
		
	}

}
