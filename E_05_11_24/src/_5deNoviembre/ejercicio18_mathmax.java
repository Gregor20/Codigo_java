package _5deNoviembre;

import java.util.Scanner;

//Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado y validados como distintos, el programa debe empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7. 

public class ejercicio18_mathmax {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("dime el primer numero");
		int numero1=Integer.valueOf(sc.nextLine());
		System.out.println("dime el segundo numero");
		int numero2=Integer.valueOf(sc.nextLine());
		
		if (numero1==numero2) {
			System.out.println("Dime numeros distintos");
			}
		int mayor=Math.max(numero1, numero2);    //------------ El metodo "Math.max" se usa para hallar el maximo entre dos numeros.
		int menor=Math.min(numero1, numero2);    //------------ El metodo "Math.min" para hallar el menor entre dos.
		
		for(int i=menor; i<=mayor ; i+=7) {
			
			System.out.printf("%d"+" ",i);
		}
		
			
	}	
		
	
}
