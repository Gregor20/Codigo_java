package Clases;

import java.time.LocalDate;

public class Animal {
	private String nombre;
	private String especie;
	private int año_nacimiento;
	private String codigo;
	private Instalacion instalacion;
	private Zona zona;
	
	public Animal(String nombre, String especie, int año_nacimiento, String codigo) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.año_nacimiento = año_nacimiento;
		this.codigo = codigo;
		this.instalacion = null;
		this.zona=null;
		
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public Instalacion getInstalacion() {
		return instalacion;
	}
	
	public void setInstalacion(Instalacion instalacion) {
		this.instalacion = instalacion;
		if(instalacion!=null) {
			this.zona=instalacion.getZona();
		}
	}
	public boolean comprobarInstalacion() {
		if(this.instalacion!=null) {
			System.out.println("El animal "+this.nombre +" ya tiene una instalación asignada");
			return false;
		}
		return true;	
	}
	public void asignarInstalacion(Instalacion a) {
		if(this.comprobarInstalacion()) {
			setInstalacion(a);
			//System.out.println("Instalación asignada a "+ this.nombre);
		}
	}
	
	
	@Override
	public String toString() {
		return "Especie: " + especie +", "+ "Nombre: "+ nombre+", " +  "Año_nacimiento: " + año_nacimiento+", " 
				+"NºInstalacion: " + instalacion.getCodigo_jaula()+", " + "Zona: "+ zona.getNombre();
	}
	
	
}
