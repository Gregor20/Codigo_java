package proyecto2;

import java.util.Scanner;

public class ejercicio13 {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		//---------Ordena de menor a mayor tres numeros enteros
		
		int a,b,c;
		int aux;    //---Declarar variable "aux", que significa un valor temporal
		
		System.out.println("Dime el primer numero ");
		a=sc.nextInt();
		System.out.println("Dime el segundo numero ");
		b=sc.nextInt();
		System.out.println("Dime el tercer numero ");
		c=sc.nextInt();
		
		if (a>b) {
	    aux=a;     //---Mientras "aux es igual a"
		a=b;       //---Igualo "a a b"
		b=aux;     //---Ahora "igualo b a el valor temporal aux, que es igual a a"
		}
			
		if	(b>c) {
		aux=b;
		b=c;
		c=aux;
	}
		
		if (a>b) {
		aux=a;
		a=b;
		b=aux;
		}	
       
	System.out.println(a+" "+b+" "+c+" ");
	}
	
}	 
			
	
		

	


