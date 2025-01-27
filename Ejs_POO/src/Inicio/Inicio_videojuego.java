package Inicio;

import Clases.Videojuego;

public class Inicio_videojuego {

	public static void main(String[] args) {
		
		Videojuego v1 = new Videojuego();
		Videojuego v2 = new Videojuego("NFS Most Wanted", 12, "Coches", "Japon");
		
		System.out.println(v1);
		System.out.println(v2);
		
		
		
		
		System.out.println(v2.isEntregado());

	}	
}
