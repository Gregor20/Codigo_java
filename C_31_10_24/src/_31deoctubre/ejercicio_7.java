package _31deoctubre;

import java.util.Scanner;

public class ejercicio_7 {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		System.out.println("Tienes 4 intentos para abrir la caja fuerte");
		
		
		int intentos=4;
		int clave=1234;
		
		System.out.print("Dime una combinacion de 4 cifras  ");
		for(int i=1;i<=intentos; i++) {
			
			
			int respuesta=sc.nextInt();
		    if (respuesta==clave) {
			System.out.println("Enhorabuena!, has acertado en el intento " + i);
		     break;
		     } 
		    
		    else {
		    	System.out.print("¡¡¡ ERROR !!! te quedan " +  (intentos -i ) + " intentos  ");
		    }
		    
		    if (i==intentos ) {
		    	System.out.println("Lo siento has perdido");
		    }
				
		
			
		}
		}

}
