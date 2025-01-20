package Clases;

public class Persona {
	private String Nombre;     //--Nombre, Apellidos y Edad son los atributos de la Persona
	private String Apellidos;
	private int Edad;
	
	public Persona(String nombre, String apellidos, int edad) { //--CONSTRUCTOR COMPLETO
		
		Nombre = nombre;
		Apellidos = apellidos;
		Edad = edad;
	}
	
	public Persona(String nombre, String apellidos) { //--CONSTRUCTOR SIN EDAD
		super();
		Nombre = nombre;
		Apellidos = apellidos;
		Edad=0;
	}
	
	public Persona(String apellidos) { //--CONSTRUCTOR SOLO APELLIDOS
		super();
		Nombre = "Vacio";
		Apellidos = apellidos;
		Edad=0;
	}
	
	public Persona() { //-- CONSTRUCTOR "NULL-NULL-0"
		super();
	}

	//--TENER TANTOS CONSTRUCTORES SE LLAMA SOBRECARGA DE CONSTRUCTORES
	//--SE USA EL MISMO OBJETO CON DISTINTOS PARAMETROS

	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}


	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad + "]";
	}
	
	
	

}
