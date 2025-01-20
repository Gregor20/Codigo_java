package _08_noviembre;

import java.util.Scanner;

public class xdfgdfgb {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Tienes 3 intentos para acertar");
		System.out.print("dime un numero: ");
		int random=(int) (Math.random()*3);
		int intentos=3;
		
		for (int i=0; i<=3 ; i++) {
			
		int num1=sc.nextInt();
		if(num1>random) {
			intentos--;
			System.out.println("El numero es menor!  " +"te quedan "+intentos+" intentos");
			}else if (num1<random) {
				intentos--;	
			System.out.println("El numero es mayor!  "+"te quedan "+intentos+" intentos");
			}else {System.out.println("Enhorabuena, has acertado");break;
			}
		if (intentos==0) {System.out.println("Has perdido");break;
		}
		
	}
		}
	

}
		
		
		
		
		
		

	


