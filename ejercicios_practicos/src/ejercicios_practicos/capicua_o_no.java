package ejercicios_practicos;

import java.util.Scanner;

// Pedir un número entre 0 y 9.999, decir si es capicúa.
public class capicua_o_no {
static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("dime un numero");
		
		int num = sc.nextInt();
		int a;
		int ulti=0;
		int s = num;
		
		while (num > 0) { // ---- 5768
			
			a = num % 10; 
			ulti = ulti*10 + a; 
			num = num / 10;
		}
			System.out.println(s);
			if (s==ulti)System.out.println("si es capicua");
			else {
				System.out.println("no es capicua");
			}
	
	}

}
