package ejercicios_practicos;
import java.util.Scanner;
//Leer 5 números y mostrarlos en el mismo orden introducido.
public class orden {
static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		int m [];
		m= new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.println("introduce un nº");
			m[i] = sc.nextInt();
		}
		//PARA IR DE ATRAS HACIA ADELANTE
		for(int i=4; i>=0; i--) {
			System.out.println(m[i]);
		}

	}

}
