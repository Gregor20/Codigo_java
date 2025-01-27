package clases;

public class Cine {
	private Pelicula Pelicula;
	private int Precio;
	
	public Cine (Pelicula Pelicula, int Precio) {
		this.Pelicula=Pelicula;
		this.Precio=Precio;
	}

	public Pelicula getPelicula() {
		return Pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		Pelicula = pelicula;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}

	@Override
	public String toString() {
		return "Cine [Pelicula=" + Pelicula + ", Precio=" + Precio + "]";
	}
	
}
