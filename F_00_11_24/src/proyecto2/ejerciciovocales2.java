package proyecto2;

import java.util.Scanner;

//Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.
public class ejerciciovocales2 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		boolean vocal;
		
		System.out.print("Dime una letra (si introuces espacio, terminas):  ");
		while (true) {
			
			
			String letra=sc.nextLine();
			
			if(letra.equals(" ")) {
				System.out.println("Programa terminado");
				break;
			} 
			letra=letra.toUpperCase();
            
			if (letra.equals("A")||letra.equals("E")||letra.equals("I")||letra.equals("O")||letra.equals("U")) {
            	vocal=true;
            } else {
            	vocal=false;
            }
			String cadena= vocal ? "es vocal": "es consonante";
            System.out.printf("la letra %s %s dime otra:  ",letra,cadena);}
		
	}

}
