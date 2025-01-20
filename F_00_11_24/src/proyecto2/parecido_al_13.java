package proyecto2;

import java.util.Scanner;

public class parecido_al_13 {
	
    static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		
		// Ordename de mayor a menor estos 4 numeros (9,3,6,7)
		int aux;
		int a,b,c,d; 
		System.out.println("dime el primer numero");a=sc.nextInt();
		System.out.println("dime el segundo numero");b=sc.nextInt(); 
		System.out.println("dime el tercer numero");c=sc.nextInt(); 
		System.out.println("dime el cuarto numero");d=sc.nextInt(); 
		
		
		
		if (a<=b) {
			aux=a;
			a=b;
			b=aux;
		    
		    }   if (a<=c) {
		    	aux=a;
		    	a=c;
		    	c=aux;
		    	
		    }	if (a<=d) {
		    	aux=a;
		    	a=d;
		    	d=aux;
		    	
		    }   if (b<=c) {
		    	aux=b;
		    	b=c;
		    	c=aux;
		    	
		    }   if (b<=d) {
		    	aux=b;
		    	b=d;
		    	d=aux;
		    	
		    }   if (c<=d) {
		    	aux=c;
		    	c=d;
		    	d=aux;
		    	
		    }
		System.out.println("ordenado de mayor a menor;"+a+" "+b+" "+c+" "+d );
			
		
			
		
		
		
		

	}

}
