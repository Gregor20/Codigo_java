package asdf;

public class inicio_matrices2 {

	public static void primero() {
		String tb[] = { "Maria", "Juan", "Andres", "Jose Manuel" };

		System.out.println("EL numero de posiciones es " + tb.length);
		tb[1] = "Juan Pedro";

		for (int i = 0; i < tb.length; i++)
			System.out.println(i + " " + tb[i]);

	}

	/************************************************************/
	public static int alea(int li, int ls) {

		return (int) (Math.random() * (ls - li + 1)) + li;

	}

	/************************************************************/
	public static void main(String[] args) {
		// primero();
		int tb[] = new int[5];
		for (int i = 0; i < tb.length; i++)
			tb[i] = alea(100, 200);

		for (int i = 0; i < tb.length; i++)
			System.out.println(i + " " + tb[i]);

		String meses[] = new String[12];
		meses[0] = "Enero";
		meses[1] = "Febrero";
		meses[2] = "Marzo";
		meses[3] = "Abril";
		meses[4] = "Mayo";
		meses[5] = "Junio";
		meses[6] = "Junio";
		meses[7] = "Agosto";
		meses[8] = "Septiembre";
		meses[9] = "Octubre";
		meses[10] = "Noviembre";
		meses[11] = "Diciembre";

		for (int i = 0; i < meses.length; i++)
			System.out.println(i + " " + meses[i]);

	}

}
