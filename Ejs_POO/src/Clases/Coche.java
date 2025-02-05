package Clases;

public class Coche extends Vehiculo {
	
	
	
	

	public Coche(String marca, String modelo) {
		super(marca, modelo);
		
	}

	public void abrir_maletero () {
		System.out.println("El maletero del coche de la marca "+marca+" y modelo "+modelo+ " está abierto");
	}
}
