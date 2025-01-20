package proyecto2;

import java.util.Scanner;

public class randomnum {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		
		/*Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100. A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido, a demás de los intentos que te quedan (tienes 10 intentos para acertarlo)
		El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado), si se llega al limite de intentos te muestra el número que había generado.*/
	
		
		int numero_a_adivinar=(int)((Math.random()*100)+1);  //-------
        int intentos=10;
        
        
        while (intentos>=0&&intentos<=10) {  // --------------------------------------------------AQUI SE ABRE EL WHILE
        System.out.println("dime un Nº");
        int numero_usuario=sc.nextInt();
		
		
		if (numero_usuario<1 || numero_usuario>100) {
			System.out.println("Dime un nº entre 1 y 100");
		}
		
		
		if (numero_usuario==numero_a_adivinar) {
			System.out.println("Enhorabuena, has acertado el Nº");
			System.out.println("Lo has acertado en el intento nº: " + (11-intentos));
			break;
		}
		else if (numero_usuario<numero_a_adivinar) {
			System.out.println("Oooh, el numero tiene que ser mayor");
			
		}
		else {
			System.out.println("Oooh, el numero tiene que ser menor");
			
		}
		intentos--;
        System.out.println("te queda un intento menos");
        } // ----------------------------------------------------------------------------------------- AQUI SE CIERRA EL WHILE
        
        if(intentos==0) {
        	System.out.println("GAME OVER! :( " + "el numero correcto es:" + numero_a_adivinar);
        	
        }
		
		//me queda poner en cuantos aciertos lo he conseguido

	} 

}
