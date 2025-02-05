package Clases;

public class Motocicleta extends Vehiculo {
	
	
	
	

	public Motocicleta(String marca, String modelo) {
		super(marca, modelo);
		
	}

	public void hacer_caballito() {
		System.out.println("La motocicleta de la marca "+marca+" y modelo "+modelo+ " está haciendo el caballito");
	}
	
}
