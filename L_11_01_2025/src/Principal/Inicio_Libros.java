package Principal;

import Clases.Libro;

public class Inicio_Libros {

	public static void main(String[] args) {
		
		Libro l1 =new Libro("111", "Programacion en java", "Perez", 2024);
		Libro l2 =new Libro("222", "Programacion en c#", "Perez");
		
		l1.setAñoPublicacion(2025);
		
		System.out.println(l1);
		System.out.println(l2);
	}

}
