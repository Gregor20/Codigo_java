package Inicio;

import Clases.Serie;

public class Inicio_serie {

	public static void main(String[] args) {
		
		Serie s1 = new Serie (); // por defecto
		Serie s2 = new Serie ("Peaky Blinders", "Steven Knight"); // solo nombre y creador
		Serie s3 = new Serie (5, "Dragon Ball", "Anime", "Akira Toriyama"); // todos menos entregado
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
