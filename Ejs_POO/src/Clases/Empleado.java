package Clases;

public class Empleado {
	private String nombre;
	protected double salario;
	
	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		
	}
	public double calcularSalario() {
		return salario;
	}
	

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre +"]";
	}

}
