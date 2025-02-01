package clases;

public class Cine {
	private Pelicula Pelicula;
	private int Precio;
	private Asiento asientos[][];
	
	public Cine (Pelicula Pelicula, int Precio, int filas, int columnas) {
		this.Pelicula=Pelicula;
		this.Precio=Precio;
		asientos = new Asiento [filas][columnas];
		rellenarButacas();
	}
	private void rellenarButacas() {
		int fila=asientos.length;
		for (int i =0; i<asientos.length; i++) {
			for (int j=0; j<asientos.length; j++) {
				asientos[i][j]=new Asiento (fila, (char) ('A'+j));
			}
		}
		fila--;
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
		String cadena= "Cine[Precio"+Precio+", pelicula"+Pelicula+"\n]";
		for (int i =0; i<8; i++) {
			for (int j=0; j<9; j++) {
				cadena = cadena+asientos[i][j];
			}
			cadena +='\n';
		}
		return cadena;
	}
	
}
