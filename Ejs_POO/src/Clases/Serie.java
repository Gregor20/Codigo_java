package Clases;

public class Serie {
	
	private int n_temporadas;
	private String titulo;
	private boolean entregado;
	private String genero;
	private String creador;
	
	//constantes
	/*public final static boolean entregado_def = false; --- por defecto un boolean en una clase es siempre false*/
	public final static int n_temporadas_def = 3;
	
	//constructores
	public Serie () {
		this.n_temporadas = n_temporadas_def;
	}
	public Serie (String titulo, String creador) {
		this.titulo=titulo;
		this.creador=creador;
	}
	public Serie(int n_temporadas, String titulo, String genero, String creador) {
		this.n_temporadas = n_temporadas;
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
	}
	
	//metodos
	public int getN_temporadas() {
		return n_temporadas;
	}
	public void setN_temporadas(int n_temporadas) {
		this.n_temporadas = n_temporadas;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	@Override
	public String toString() {
		return "n_temporadas=" + n_temporadas +"\n"+"titulo=" + titulo +"\n"+ "entregado=" + entregado +"\n"+ "genero="
				+ genero +"\n"+ "creador=" + creador + "\n";
	}
	
	

}
