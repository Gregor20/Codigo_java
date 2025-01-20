package principal;

import java.util.Scanner;

public class ejemploscanner {

	static Scanner sc=new Scanner(System.in);  //Cuando escribes esto, hay que poner las mayusculas!! "Scanner"
	
	public static void main(String[] args) {
		
		System.out.println("Dime un numero del 1 al 7");
		int dia=sc.nextInt();
		
		if(dia==1) {
			System.out.println( "Lunes" );
		}
		else if(dia==2) {
			System.out.println( "Martes" );
		}
		else if(dia==3) {
			System.out.println( "Miercoles" );
		}
		else if(dia==4) {
			System.out.println( "Jueves" );
		}
		else if(dia==5) {
			System.out.println( "Viernes" );
		}
		else if(dia==6) {
			System.out.println( "Sabado" );
		}
		else if(dia==7) {
			System.out.println( "Domingo" );
		}
		 
		System.out.println("Final");
		}
		
	}
	


