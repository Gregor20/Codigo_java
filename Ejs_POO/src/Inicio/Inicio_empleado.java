package Inicio;

import java.util.ArrayList;

import Clases.Empleado;
import Clases.EmpleadoFijo;
import Clases.EmpleadoPorHoras;

public class Inicio_empleado {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Manolo");
		
		EmpleadoFijo ef1 = new EmpleadoFijo("Paco");
		
		EmpleadoPorHoras eh1 = new EmpleadoPorHoras ("María", 100, 12);
		
		e1.setSalario(2100);
		
		
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		
		empleados.add(e1);
		empleados.add(ef1);
		empleados.add(eh1);
		
		for (Empleado worker : empleados) {
			System.out.println(worker.calcularSalario());
		}
		
		
		
		
		
	}

}
