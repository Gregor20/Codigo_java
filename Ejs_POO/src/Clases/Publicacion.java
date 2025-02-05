package Clases;

public class Publicacion {
	
	private String titulo;
	private String autor;
	public Publicacion(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public void mostrarInformacion () {
		System.out.println("Título: " + titulo +"\n"+ "Autor: " + autor);
	}
	
	

}
