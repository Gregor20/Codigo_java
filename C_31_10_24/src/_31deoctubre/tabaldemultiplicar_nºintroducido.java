package _31deoctubre;

import java.util.Scanner;

public class tabaldemultiplicar_nºintroducido {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int numero_solicitado;
		
		do {
			System.out.println("Dime un numero entre 1 y 1000");
			numero_solicitado=sc.nextInt();
			
		if (numero_solicitado<=0 || numero_solicitado>1000) {
					System.out.println("ERROR! Dime un numero entre 1 y 1000");
				}
		} while (numero_solicitado<=0 || numero_solicitado>1000);
		
		for(int i=0; i<=10; i++) {
		
		
		
		System.out.printf("  %2d * %2d = %2d\n ", numero_solicitado, i, numero_solicitado*i     );
		}		
				
			
		}
	}
