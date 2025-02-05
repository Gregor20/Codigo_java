package Inicio;

import java.util.ArrayList;

import Clases.*;

public class Principal_vehiculo {

	public static void main(String[] args) {
		
		Vehiculo v1 = new Vehiculo("Audi", "A3");
		Coche c1 = new Coche("Seat", "Córdoba");
		Motocicleta m1 = new Motocicleta("Peugeot", "Tweet");
		
		ArrayList <Vehiculo> lista= new ArrayList<>();
		lista.add(v1);
		lista.add(c1);
		lista.add(m1);
		lista.add(new Motocicleta("Yamaha", "Typhoon"));
		lista.add(new Motocicleta("Peugeot", "Tweet"));
		//m1=(new Motocicleta("Peugeot", "Tweet"));  NO IGUALA
		int n1 = 1;
		int n2;
		n2=n1;
		
		for (Vehiculo li : lista) {
			//li.arrancar();
			if(li instanceof Coche) {
				((Coche)li).abrir_maletero();
			}else if (li instanceof Motocicleta) {
				((Motocicleta)li).hacer_caballito();
			}
			
		}
		System.out.println();
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(m1.hashCode()); // SON IGUALES PORQUE SON EL MISMO OBJETO "M1"
		System.out.println(m1.hashCode());
		System.out.println( (new Motocicleta("Peugeot", "Tweet").hashCode() ) ); // SON DISTINTOS PORQUE SON LOS MISMOS ATRIBUTOS PERO DISTINTO "Nº DE SERIE"
		System.out.println( (new Motocicleta("Peugeot", "Tweet").hashCode() ) );
		
		if ((new Motocicleta("Peugeot", "Tweet")) == m1) {
			System.out.println("son iguales");
		}else {System.out.println("son distintos");}
		

	}

}
