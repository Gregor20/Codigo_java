package Clases;

public class Dimension {
	//ATRIBUTOS
	private double alto;
	private double ancho;
	private double profundidad;
	//CONSTRUCTOR INICIALIZANDO A 0
	public Dimension() {
		super();
		this.alto = 0;
		this.ancho = 0;
		this.profundidad = 0;
	}
	//CONSTRUCTOR PARA DAR VALORES
	public Dimension(double alto, double ancho, double profundidad) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
	}
	//GETTERS & SETTERS
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getProfundidad() {
		return profundidad;
	}
	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}
	//METODO QUE DEVUELVE VOLUMEN MAXIMO
	public double getVolumen() {
		double volumen = this.alto*this.ancho*this.profundidad;
		return volumen;
	}
	@Override
	public String toString() {
		return "Dimension [alto=" + alto + ", ancho=" + ancho + ", profundidad=" + profundidad + ", Volumen="
				+ getVolumen() + "]";
	}
	
	
	
	
}
