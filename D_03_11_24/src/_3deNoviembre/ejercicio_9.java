package _3deNoviembre;

import java.util.Scanner;

//Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de esta manera, la única limitación en el número de dígitos la establece el tipo de dato que se utilice (int o long). 

public class ejercicio_9 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		long numero_introducido;
		System.out.println("Dime un numero");
		numero_introducido=sc.nextLong();
		long digitos=0;
		
		do {
			numero_introducido/=10;
			digitos++;
			
		} while (numero_introducido>0);
		
		System.out.println("el numero tiene " + digitos + " digitos");
		
		
		

	}

}
