package proyecto28octubre;

import java.util.Scanner;

public class ejerc17 {
	
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		//--Crea un programa que me diga cual es la ultima cifra de un numero entero introducido por teclado
		
		int a;
		int b;
		
		System.out.println("Dime un numero");
		a=sc.nextInt();
		
		b=(a/10)*10;  //---un numero dividido entre 10 siempre da un entero (no puede dar decimal)
		
		
		System.out.println(a - b);
		

	}

}
