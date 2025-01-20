package proyecto2;

import java.util.Scanner;

public class ejercicio12 {
	
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		int aciertos=0;
		
		System.out.println("¿Un boolean puede ser numero? (si/no) ");
	    String respuesta=sc.next();
	    
	    if (respuesta.equals("no"))  aciertos++;     //---- la funcion ".equals" sirve para comparar dos strings
	    	else aciertos--; 
	    
	    System.out.println(aciertos);
	    
	    System.out.println("¿Eclipse es un programa de ordenador para leer codigo ? (si/no) ");
	    String respuesta2=sc.next();
	    
	    if(respuesta2.equals("si"))  aciertos++;
	       else aciertos--;
	    
	    System.out.println(aciertos);
	    
	    
		
		

	}

}
