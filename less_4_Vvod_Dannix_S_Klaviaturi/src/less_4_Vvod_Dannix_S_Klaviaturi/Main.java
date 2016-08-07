package less_4_Vvod_Dannix_S_Klaviaturi;

public class Main {

	public static void main(String[] args) {
		Reader_Chtenie r = new Reader_Chtenie();
		r.Scan();
		r.i = count(r.i);
		r.k = count(r.k);
		System.out.println("Теперь Ваше число: " + r.i);
		System.out.println("Теперь Ваше число: " + r.k);

	}

	private static int count(int x) {
		x = x + 1;
		return x;
	}

}
