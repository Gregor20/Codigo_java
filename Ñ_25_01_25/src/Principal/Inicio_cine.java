package Principal;

import clases.Cine;
import clases.Pelicula;

public class Inicio_cine {

	public static void main(String[] args) {
		Pelicula p1 = new Pelicula("Shrek", 100, 18, "Almodovar");
		Cine cinema= new Cine(p1,20, 8, 9); 
		
		
	}

}
