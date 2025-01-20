package _apartirdel_8_Noviembre;
import java.util.*;
public class ejemplo {

	public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);

	System.out.println("Dime tu nombre: ");
	String nombre=entrada.nextLine();
	
	System.out.println("Dime tus apellidos: ");
	String apellidos=entrada.nextLine();
	
	System.out.println("Dime tu edad: ");
	int edad=entrada.nextInt();
	
	System.out.println(nombre +" " + apellidos + ", el año que viene cumplirás "+ (edad+1)+ " años.");
	
	if (edad+1 == 18) {
		System.out.println("Y ya serás mayor de edad, al lío, ya puedes apostar");
	}
	
	if (edad<17) {
		System.out.println("Y todavía serás menor de edad");
	} 
	else if (edad>18&&edad<30) {
		System.out.println("Ya eres todo un hombre con pelos en los huevos!");
	}
	else if (edad>30&&edad<65) {
		System.out.println("Cuidado viejo, que se acerca la jubilación ");
	}
	else if(edad>65) {
		System.out.println("Eres un viejo ya, jubilate, descansa, cuidate, ve al médico...");
	}
	
	
	
	
	}

}
