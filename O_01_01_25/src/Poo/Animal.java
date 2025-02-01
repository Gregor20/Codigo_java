package Poo;

public class Animal { //--CREAR OBJETO ANIMAL
	private String nombre; //-- CON ESTOS ATRIBUTOS

	public Animal(String nombre) { // -- CON ESTE CONSTRUCTOR
		super();
		this.nombre = nombre;
		//System.out.println(nombre);
	}
	
	public void hacerSonido() { //-------- CON ESTE METODO
		System.out.println("El animal hace un sonido");
	}
	

	@Override
	public String toString() { //-------- CON ESTE toString
		return "Nombre: " + nombre + "\n";
	}
	
	

}
