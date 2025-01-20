package ejs;

import java.util.Scanner;

public class ej1 {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
			
		
		System.out.println("Tienes 4 oportunidades para abrir la caja fuerte, dime la combinación:");
		
		int combi_correcta=1234;
		int intentos=4;
		
		for(int i=1; i<=4; i++) {
			
			int combi=Integer.valueOf(sc.nextLine());
			
			if(combi==combi_correcta) {
				System.out.println("Enhorabuena, has acertado!");
				break;
			}
			else {
				intentos--;
				
				if(intentos==0) {
					System.out.println("Te has quedado sin intentos");
					break;
				}
				
				System.out.println("ERROR, prueba otra vez");
			}
			
			
		}
		
		

	}

}
