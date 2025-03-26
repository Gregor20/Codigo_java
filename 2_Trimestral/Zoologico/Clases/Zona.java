package Clases;

public class Zona {
	private String codigo;
	private String nombre;
	private int superficie;
	
	public Zona(String codigo, String nombre, int superficie) {
		super();
		this.codigo = codigo.toUpperCase();
		this.nombre = nombre;
		this.superficie = superficie;
	}
	public String getNombre() {
		return nombre;
	}
	

	@Override
	public String toString() {
		return "Zona: "+ nombre;
	}
	
	
	
	
	
	
}
