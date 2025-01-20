package proyecto3;

import java.util.Scanner;

public class ejerc18 {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		//--Crea un programa que me diga cual es la primera cifra de un numero entero introducido por teclado
		
		
		System.out.println("dime el numero");
		
		int a=sc.nextInt();
		int b=0;
		
		if (a<10) b=a;
		
		if(a>=10&&a<100){ 
		b=a/10;}
		
		if(a>=100&&a<1000){ 
		b=a/100;}
		
		if(a>=1000&&a<10000){ 
		b=a/1000;}
		
		if(a>=10000&&a<100000){ 
		b=a/10000;}
		
		System.out.println(b);
		
		
		
		
		

	}

}
