package Poo;

public class Padre {
	private String nombre;
	
	public Padre (String nom) {
		this.nombre = nom;
		System.out.println(nombre);
	}
	
	public void mostrarInfo() {
		System.out.println("Padre: " + nombre);
	}
	
	
}
