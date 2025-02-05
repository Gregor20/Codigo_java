package Inicio;

import java.util.ArrayList;

import Clases.Libro;
import Clases.Publicacion;
import Clases.Revista;

public class Principal_Publicacion {

	public static void main(String[] args) {
		
		Libro l1 = new Libro ("Kika Superbruja", "Maria Muertini");
		l1.setNumero_paginas(234);
		Revista r1 = new Revista ("Playboy", "Jeff Bezos");
		r1.setNumero_edicion(23);
		Libro p1 = new Libro ("Abracadabra", "Patadecabra");
		p1.setNumero_paginas(565);
		
		
		ArrayList<Publicacion> lista = new ArrayList<>();
		/*lista.add(new Libro ("Harry Potter y la piedra filosofal", "J.K Rowling"));
		lista.add(new Revista ("Vogue", "Arthur Baldwin"));
		lista.add(new Publicacion ("Mi blog personal", "Yo"));*/
		lista.add(l1);
		lista.add(r1);
		lista.add(p1);
		
		for (Publicacion publi : lista) {
			publi.mostrarInformacion();
		}

	}

}
