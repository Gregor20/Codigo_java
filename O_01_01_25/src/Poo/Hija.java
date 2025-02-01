package Poo;

public class Hija extends Padre {
	private int Edad;
	private String nombre_hija;
	
	

	public Hija(String nom,String nombre_hija, int ed) {
		
		super(nom);
		this.nombre_hija=nombre_hija;
		this.Edad=ed;
	}

	@Override
	public void mostrarInfo() {
		System.out.println(Edad +" " + nombre_hija);
		super.mostrarInfo();
	}
	
	
	
	
}
