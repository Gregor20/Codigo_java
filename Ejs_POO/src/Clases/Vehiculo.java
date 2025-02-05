package Clases;

public class Vehiculo {
	
	protected String marca;
	protected String modelo;
	
	public Vehiculo() {
	}
	
	public Vehiculo(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}



	public void arrancar() {
		System.out.println("El vehiculo de la marca "+ marca + " y modelo "+ modelo + " está arrancado");
	}

}
