package Clases;

public class EmpleadoFijo extends Empleado {
	private double sueldo_fijo = 1000;

	public EmpleadoFijo(String nombre) {
		super(nombre);
		this.sueldo_fijo = sueldo_fijo;
	}

	@Override
	public double calcularSalario() {
		
		return sueldo_fijo;
	}
	

	
	
	
	
}
