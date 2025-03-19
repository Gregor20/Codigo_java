package Principal;

import Clases.Coleccion;
import Clases.Dimension;
import Clases.Figura;
import Clases.Superheroe;

public class Inicio_superheroes {

	public static void main(String[] args) {
		
		Superheroe n1 = new Superheroe("Superman");
		Superheroe n2 = new Superheroe("Batman");
		Superheroe n3 = new Superheroe("Hulk");
		
		Dimension d1 = new Dimension(10,5,5);
		Dimension d2 = new Dimension(2,2,2);
		Dimension d3 = new Dimension(20,15,10);
				
		Figura f1 = new Figura("xsd", 20, n1, d1);
		Figura f2 = new Figura("kjl", 30, n2, d2);
		Figura f3 = new Figura("sdf", 40, n3, d3);
		Figura f4 = new Figura("loi", 100, n3, d3);
		
		n1.setDescripcion("Soy el mas fuerte y puedo volar");
		n2.setDescripcion("Soy como un murcielago nocturno");
		n3.setDescripcion("Soy un bicho verde, grande y fuerte");
		n2.setCapa(true);
		
		//f1.subirPrecio(20);
		
		Coleccion c1 = new Coleccion("MiColeccion");
		c1.añadirFigura(f1);
		c1.añadirFigura(f2);
		c1.añadirFigura(f3);
		c1.añadirFigura(f4);
		
		
		
		System.out.println(c1.toString());
		//System.out.println(c1.conCapa());
		System.out.println(c1.getVolumenColeccion());
	}

}
