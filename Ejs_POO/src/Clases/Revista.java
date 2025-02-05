package Clases;

public class Revista extends Publicacion {
	private int numero_edicion;

	public Revista(String titulo, String autor) {
		super(titulo, autor);
		
	}

	public int getNumero_edicion() {
		return numero_edicion;
	}

	public void setNumero_edicion(int numero_edicion) {
		this.numero_edicion = numero_edicion;
	}

	@Override
	public void mostrarInformacion() {
		
		super.mostrarInformacion();
		
		System.out.println("Nº edición: " + getNumero_edicion() + "\n");
	}
	
	
	
}
