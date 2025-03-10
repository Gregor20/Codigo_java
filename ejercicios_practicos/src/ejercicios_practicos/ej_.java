package ejercicios_practicos;
import java.util.Scanner;
//Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que son primos.
public class ej_ {
	
	public static boolean esPrimo (int numero) {
		if (numero <= 1) {
			return false;
		}
		for(int i = 2; i<numero; i++) {
			if(numero%i==0) {
				return false;
			}
		}
		return true;
	}

	
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Dime un número");
		int n = sc.nextInt();
		int contador_primos=0;
		
		for (int i = 1; i <= n; i++) {
			if(esPrimo(i)) {
				contador_primos++;
			}
		}
		System.out.printf("Hay %d número/s primo/s, del 1 al %d",contador_primos, n);
		
	}

}
