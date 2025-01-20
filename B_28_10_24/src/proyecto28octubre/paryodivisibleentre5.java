package proyecto28octubre;

import java.util.Scanner;

public class paryodivisibleentre5 {
	
	static Scanner sc=new Scanner (System.in);
    public static void main(String[] args) {
    	
    	System.out.println("dime un numero par y/o divisible entre 5");
    	int numero =sc.nextInt();
    	
    	if (numero%2==0&&numero%5==0){
    		
    	System.out.println("el numero es par y divisible entre 5");
    	System.out.println("Muy bien");
    	
    	} else System.out.println("Este numero no coincide con la peticion");
    	
		

	}

}
