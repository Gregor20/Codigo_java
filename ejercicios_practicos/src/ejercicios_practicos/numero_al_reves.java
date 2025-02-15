package ejercicios_practicos;

import java.util.Scanner;

// Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
public class numero_al_reves {
static Scanner sc= new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("dime un numero");
		int num = sc.nextInt();
		
		int b=0;
		
			while (num > 0) { // ---- 5768
				
				int a = num % 10; 
				b = b*10 + a; 
				num = num / 10;
			}
			System.out.println(b);
			
		
			/*int h= num % 10;
			System.out.println(h);
			
			int j= num / 10;
			System.out.println(j);
		*/
	}

}
