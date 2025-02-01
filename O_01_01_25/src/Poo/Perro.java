package Poo;

public class Perro extends Animal {
	protected String raza;

	public Perro(String nombre, String raza) {
		super(nombre);
		this.raza = raza;
		//System.out.println(raza);
	}

	@Override
	public void hacerSonido() {
		System.out.println("El perro hace 'guau guau'");
		
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + "]";
	}
	
	

	

	
	
	
	
}
