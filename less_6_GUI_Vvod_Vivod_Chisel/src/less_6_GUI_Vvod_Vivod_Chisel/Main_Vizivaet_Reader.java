package less_6_GUI_Vvod_Vivod_Chisel;

public class Main_Vizivaet_Reader {

	public static void main(String[] args) {
		Reader r = new Reader();
		r.Scan();
		r.i = count(r.i);
		r.k = count(r.k);
		r.Scan(r.i, r.k);

	}
	
	private static int count(int x){
		x = x + 1;
		return x;
	}

}
