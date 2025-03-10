package ejercicios_practicos;

/*
 * Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números del 0-0-0-0-0
al 9-9-9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
 */
public class anidados {
	/*
	 * public static String sustituye(int valor) { return (valor==3) ? "E" :
	 * String.valueOf(valor); }
	 * 
	 * public static void main(String[] args) { for(int a=0; a<=9; a++) { for(int
	 * b=0; b<=9; b++) { for(int c=0; c<=9; c++) { for(int d=0; d<=9; d++) { for(int
	 * e=0; e<=9; e++) { String numero =
	 * 
	 * sustituye(a)+"-"+ sustituye(b)+"-"+ sustituye(c)+"-"+ sustituye(d)+"-"+
	 * sustituye(e); System.out.println(numero); } } } } }
	 * 
	 * }
	 */

	public static void main(String[] args) {
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= 9; k++) {
					for (int l = 0; l <= 9; l++) {
						for (int m = 0; m <= 9; m++) {
							if (i == 3)
								System.out.print("E");
							else
								System.out.print(i);
							if (j == 3)
								System.out.print("E");
							else
								System.out.print(j);
							if (k == 3)
								System.out.print("E");
							else
								System.out.print(k);
							if (l == 3)
								System.out.print("E");
							else
								System.out.print(l);
							if (m == 3)
								System.out.print("E");
							else
								System.out.print(m);
							System.out.println(" ");
						}
					}
				}
			}
		}
	}
}
