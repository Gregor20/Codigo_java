package ejs;

public class ex {

	public static void main(String[] args) {

		int aprobados = 0;
		int sobresalientes = 0;

		for (int i = 0; i < 10; i++) {
			double numero = (int) (Math.random() * 10) + 1;
			System.out.println(numero);

			if (numero >= 5 && numero < 9) {
				aprobados++;
			}

			else if (numero >= 9) {
				sobresalientes++;
			}
		}
		System.out.printf("Aprobados: %d Sobresalientes: %d",aprobados,sobresalientes);
	}

}
