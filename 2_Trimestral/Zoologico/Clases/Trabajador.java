package Clases;

public class Trabajador {
	private String nombreYapellidos;
	private String especialidad;
	private String dni;
	
	public Trabajador(String nombreYapellidos, String especialidad, String dni) {
		super();
		this.nombreYapellidos = nombreYapellidos;
		this.especialidad = especialidad;
		this.dni = dni;
	}
	public String getNombreYapellidos() {
		return nombreYapellidos;
	}
	public String getDni() {
		return this.dni;
	}
	public String getEspecialidad() {
		return this.especialidad;
	}

	@Override
	public String toString() {
		return "Trabajador: " + nombreYapellidos;
	}
	
	
	
}
