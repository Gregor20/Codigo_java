package clases;

public class Asiento {
	private int filas;
	private char columnas;
	private Espectador espectador;
	
	public Asiento (int filas, char columnas) {
		this.filas=filas;
		this.columnas=columnas;
		this.espectador=null;
		
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public char getColumnas() {
		return columnas;
	}

	public void setColumnas(char columnas) {
		this.columnas = columnas;
	}

	public Espectador getEspectador() {
		return espectador;
	}

	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}
	public boolean estaOcupado() {
		return espectador != null;
	}

	@Override
	public String toString() {
		return "Asiento [filas=" + filas + ", columnas=" + columnas + ", espectador=" + espectador + "]";
	}
		
	
}
