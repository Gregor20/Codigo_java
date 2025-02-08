package ejercicios_practicos;

import java.util.Scanner;

public class alternativa_mayor_de_tres {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("dime el primer numero");
		int n1=sc.nextInt();
		System.out.println("dime el segundo numero");
		int n2=sc.nextInt();
		System.out.println("dime el tercer numero");
		int n3=sc.nextInt();
		
		if(n1 != n2 && n1 != n3 && n2 != n3) {
			
			int mayor=Math.max(n1, (Math.max(n2, n3)));
			int menor=Math.min(n1, (Math.min(n2, n3)));
			
			int medio= (n1 + n2 + n3) - mayor - menor;
			
			System.out.printf("Numeros ordenados de mayor a menor: %d, %d, %d",mayor, medio, menor);
			
			
		}else {
			System.out.println("son iguales");
		}
		

	}

}
