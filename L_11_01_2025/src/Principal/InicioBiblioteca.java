package Principal;

import Clases.Biblioteca;
import Clases.Libro;

public class InicioBiblioteca {

	public static void main(String[] args) {
		
		Biblioteca b1=new Biblioteca("RETIRO", "Doctor Esquerdo 33");
		
		b1.AñadirLibro(new Libro("111", "Prog Java", "Alberto"));
		b1.AñadirLibro(new Libro("222", "Prog C++", "Perez", 2025));
		
		
		System.out.println(b1);
		

	}

}
