package _apartirdel_8_Noviembre;

public class Public_static_ejercicios {

	static int aleatorio(int inferior, int superior) {

		return (int) (Math.random() * (superior - inferior + 1)) + inferior;

	}

	public static void main(String[] args) {
		// cuantos han suspendido nota<5
		// ""Aprobado nota>=5 y nota<6
		// ""Bien nota>=6 y nota<7
		// ""Notable nota>=7 y nota<9
		// ""Sobresaliente nota>=9 y nota<=10

		int suspensos = 0, aprobados = 0, bienes = 0, notables = 0, sobresalientes = 0;
		int notas;

		for (int i = 0; i < 10; i++) {
			notas = (aleatorio(0, 10));
			System.out.println(notas);

			if (notas < 5) {
				suspensos++;
			} else if (notas >= 5 && notas < 6) {
				aprobados++;
			} else if (notas >= 6 && notas < 7) {
				bienes++;
			} else if (notas >= 7 && notas < 9) {
				notables++;
			} else {
				sobresalientes++;
			}

		}
		System.out.printf("suspensos= %d aprobados= %d bienes = %d notables= %d sobresalientes= %d", suspensos,
				aprobados, bienes, notables, sobresalientes);
	}

}
