package ejercicios_practicos;
//Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
import java.util.Scanner;
public class negativoono {
static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("Introduce diez números");
		int n=0;
		boolean negativo=false;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Número:");
			n=sc.nextInt();
			if(n<0) {
				negativo=true;
			}
		}
		if(negativo==true) {
			System.out.println("Si hay");
		}else {
			System.out.println("No hay");
		}
	}
}
