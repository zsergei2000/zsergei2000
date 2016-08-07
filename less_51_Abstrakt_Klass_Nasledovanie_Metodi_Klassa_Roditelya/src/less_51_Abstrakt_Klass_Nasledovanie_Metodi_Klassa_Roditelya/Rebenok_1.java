package less_51_Abstrakt_Klass_Nasledovanie_Metodi_Klassa_Roditelya;

public class Rebenok_1 extends Abstrakt_Main_Roditel{

	//Ниже идет метод ПЕРЕЗАПИСЫВАЮЩИЙ метод в абстракте
	@Override
	public void Metod_Rebenok_() {
		System.out.println("Код перезаписанного метода");
		
	}

}
