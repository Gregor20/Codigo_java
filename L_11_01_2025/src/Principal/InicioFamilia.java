package Principal;

import Clases.Familia;
import Clases.Persona;

public class InicioFamilia {
	
	public static void main(String[] args) {
		
		Familia f1=new Familia (
				new Persona("Juan","Perez", 45),
				new Persona("Ana","Ruiz", 43));
		
		f1.AñadirHijo(new Persona ("Juanita","Perez Ruiz",32));
		f1.AñadirHijo(new Persona ("Marquitos","Perez Ruiz",22));
		
		f1.getPadre().setEdad(55);
		
		System.out.println(f1);
	}

}
