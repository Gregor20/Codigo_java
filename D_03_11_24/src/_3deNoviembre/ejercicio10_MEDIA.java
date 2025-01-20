package _3deNoviembre;

import java.util.Scanner;

//Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de introducir los datos cuando meta un número negativo. 

public class ejercicio10_MEDIA {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		double numero;           //------------------------ Se declaran las variables a utilizar
		double suma_numeros=0;
		double cantidad=0;
		
		System.out.println("Introduce los numeros para hacer la media, si quieres parar, introduce un numero negativo");  
		
		while (true) {          //------------------------- No se usa "for" porque NO sabemos cuantos numeros se introduciran en total
			numero=sc.nextDouble();
		
		
		if(numero<0)break;     //--------------------- Si el numero es menor que 0 (negativo) se para el bucle
		suma_numeros+=numero;  //-------- MUY IMPORTANTE EL ORDEN!!!!!
		cantidad++;
		
		System.out.print("Dime otro ");
			
			}
		double media=suma_numeros/cantidad;
		System.out.printf(" La media es: %.2f ", media);
		
		
		
		
		
		
		
		

	
	}
}
