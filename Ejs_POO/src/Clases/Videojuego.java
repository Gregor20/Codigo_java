package Clases;

public class Videojuego {
	
	private String titulo;
	private double horas_estimadas = 10;
	private boolean entregado;
	private String genero;
	private String compañia;
	
	public Videojuego() {}
	public Videojuego (String titulo, double horas_estimadas) {
		this.titulo=titulo;
		this.horas_estimadas=horas_estimadas;
	}
	public Videojuego(String titulo, double horas_estimadas,String genero, String compañia) {
		this.titulo = titulo;
		this.horas_estimadas = horas_estimadas;
		this.entregado= entregado;
		this.genero = genero;
		this.compañia = compañia;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getHoras_estimadas() {
		return horas_estimadas;
	}
	public void setHoras_estimadas(double horas_estimadas) {
		this.horas_estimadas = horas_estimadas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCompañia() {
		return compañia;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horas_estimadas=" + horas_estimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compañia=" + compañia + "]";
	}
	
	public void entregar() {
		this.entregado=true;
	}
	public void devolver() {
		this.entregado=false;
	}
	public boolean isEntregado() {
		if(entregado) {
			return this.entregado=true;
			}
		return false;
	}
	public boolean compareTo (Videojuego s) {
		if (horas_estimadas>getHorasestimadas(s)) {
			
		}
	}
	
	
	
	
	

}
