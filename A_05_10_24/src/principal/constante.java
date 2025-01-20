package principal;

import java.util.Scanner;

public class constante {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		/*Realiza un programa que calcule cuanto tardará en caer un objeto desde una altura h.
		Aplica la formula t= √2h/g. Siendo g=9.81 m por segundo*/
		
		
		System.out.println("Dime la altura");
		
		
		double altura=sc.nextDouble();
		
		final double g=9.81;            //----- FINAL significa una constante, la cual no puede variar
		
		double tiempo=Math.sqrt((2*altura)/g );   //----- Math.sqrt significa la raiz cuadrada
		
		
		System.out.println(tiempo);
		
	

	}

}
