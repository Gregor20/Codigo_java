package Principal;

import java.util.ArrayList;

import Poo.Estudiante;
import Poo.Persona;

public class InicioPersona {
	
	public static void imprimir(ArrayList<Persona> li) {
		for (Persona p : li) {
			System.out.println(p.mensaje() + " " + p);
		}
	}

	public static void main(String[] args) {
		
		Persona ana = new Persona ("Ana", 40);
		
		Estudiante juan = new Estudiante ("Juan", 32, 40);
		
		ArrayList <Persona> lista = new ArrayList <Persona>();
		lista.add(juan);
		lista.add(ana);
		imprimir(lista);
		
	}

}
