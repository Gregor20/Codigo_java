package Poo;

public class Estudiante extends Persona {
	private int creditos;

	public Estudiante(String nombre, int edad, int creditos) {
		super(nombre, edad);
		this.creditos = creditos;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public String mensaje() {
		return "Soy una estudiante";
	}

	@Override
	public String toString() {
		return "Estudiante [creditos=" + creditos + "]"+super.toString();
	}
	
	
}
