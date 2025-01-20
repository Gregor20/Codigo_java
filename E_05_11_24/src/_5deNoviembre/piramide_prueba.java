package _5deNoviembre;

import java.util.Scanner;

public class piramide_prueba {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		for(int i=1; i<=5; i++) {     // --- ALTURA = 5
			
			//System.out.println( " ".repeat(5-i) + "0".repeat((2*i)-1) );
			
		//    0    -- un cero
		//   000   -- tres ceros
		//  00000  -- cinco ceros
		// 0000000 -- siete ceros
		//000000000-- nueve ceros                        ------ PIRAMIDE HACIA ARRIBA
			
			
			// int n=8;
			// for(int i=n; i>=1; i--) {
			// System.out.println( " ".repeat(n-i) + "0".repeat((2*i)-1) );    -------------- ES OTRA MANERA DE HACER LA PIRAMIDE HACIA ABAJO
            //		                                                                     ---- DECLARANDO LA VARIABLE "n" Y HACIENDO "i--"
		  
			
			//System.out.println(" ".repeat(i-1) + "0".repeat(5-i) + "0".repeat(5-i) +"0");
			
		//000000000-- nueve ceros
		// 0000000 -- siete ceros
		//  00000  -- cinco ceros
		//   000   -- tres ceros
        //	  0    -- un cero                     ---------- PIRAMIDE HACIA ABAJO

			
			System.out.println("0".repeat(i)+"0".repeat(i) );

                    			
//0			
//00			
//000		
//0000
//00000
//0000
//000
//00
//0			
		}
    }
}








