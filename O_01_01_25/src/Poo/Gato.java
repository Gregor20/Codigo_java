package Poo;

public class Gato extends Animal {
	private String color;

	public Gato(String nombre, String color) {
		super(nombre);
		this.color=color;
	}

	@Override
	public void hacerSonido() {
		System.out.println("El gato hace 'miau miau'");
	}

	@Override
	public String toString() {
		return "Gato [color=" + color + "]";
	}
	

	
	
}
