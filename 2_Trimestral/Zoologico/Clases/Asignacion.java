package Clases;

public class Asignacion {
	private Trabajador trabajador;
	private Zona zona;
	private String diasTrabajo;
	
	public Asignacion(Trabajador trabajador, Zona zona, String diasTrabajo) {
		super();
		this.trabajador = trabajador;
		this.zona = zona;
		this.diasTrabajo = diasTrabajo;
	}
	

	public Trabajador getTrabajador() {
		return trabajador;
	}


	public Zona getZona() {
		return zona;
	}


	public String getDiasTrabajo() {
		return diasTrabajo;
	}


	@Override
	public String toString() {
		return this.trabajador.getNombreYapellidos() + ", trabaja en la zona de "
	+ zona.getNombre() + ", los dias " + this.diasTrabajo;
	}
	
	
}
