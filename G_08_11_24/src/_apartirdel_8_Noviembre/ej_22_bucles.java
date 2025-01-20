package _apartirdel_8_Noviembre;

public class ej_22_bucles {

	// Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.

	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			if (esprimo(i)) {
				System.out.println(i);
			}
		}

	}

	public static boolean esprimo(int n) {
		if (n < 2) return false;
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) return false;
			}
		
		return true;
	}
}
