package Clases;

import java.time.LocalDate;

public class Animal {
	private String nombre;
	private String especie;
	private int año_nacimiento;
	private String codigo;
	private Instalacion instalacion;
	private Zona zona;
	
	public Animal(String nombre, String especie, int año_nacimiento, String codigo, Instalacion instalacion) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.año_nacimiento = año_nacimiento;
		this.codigo = codigo;
		this.instalacion = instalacion;
		this.zona=instalacion.getZona();
		
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Especie: " + especie +", "+ "Nombre: "+ nombre+", " +  "Año_nacimiento: " + año_nacimiento+", " 
				+"NºInstalacion: " + instalacion.getCodigo_jaula()+", " + "Zona: "+ zona.getNombre();
	}
	
	
}
