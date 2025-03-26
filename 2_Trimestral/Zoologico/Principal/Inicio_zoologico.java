package Principal;

import Clases.Animal;
import Clases.Asignacion;
import Clases.Instalacion;
import Clases.Trabajador;
import Clases.Zona;
import Clases.Zoologico;

public class Inicio_zoologico {

	public static void main(String[] args) {
		
		Zoologico z1 = new Zoologico("Faunia");
		
		Zona f1 = new Zona ("fel01","Felinos",100);
		Zona p1 = new Zona ("prim01","Primates",50);
		Zona rest = new Zona ("rst01","Restaurante",200);
		
		Zona av1 = new Zona ("ave01","Aves",135);
		
		
		Instalacion i1 = new Instalacion(f1,"Jaula para leones",2000);
		Instalacion i2 = new Instalacion(p1,"Jaula para primates",2010);
		Instalacion i3 = new Instalacion(av1,"Jaula para las aves",1998);
		Instalacion i4 = new Instalacion(av1,"Jaula para las aves peligrosas",2001);
		
		
		Animal a1 = new Animal ("Spike","León africano",2010,"leo01",i1);
		Animal a2 = new Animal ("Manolo","Tigre siberiano",2005,"tig01",i1);
		Animal a3 = new Animal ("Paquito","Mono Gibon",2006,"tig01",i2);
		
		Animal a4 = new Animal ("Águila","Águila Real",2000,"agu01",i3);
		
		Trabajador t1 = new Trabajador("Juan Perez", "veterinaria", "50909886g");
		Trabajador t2 = new Trabajador("Maria Jimenez", "cuidadora", "51349523j");
		Trabajador t3 = new Trabajador("David Bisbal", "animador", "576456543e");
		
		Asignacion as1 = new Asignacion (t1,f1,"Lunes y martes de 9 a 14");
		Asignacion as2 = new Asignacion (t2,p1,"Martes y Jueves de 10 a 16");
		Asignacion as3 = new Asignacion (t3,rest,"De Lunes a Viernes de 9 a 15");
		Asignacion as4 = new Asignacion (t1,rest,"Fines de semana de 17 a 20");
		
		
		z1.añadirAnimales(a1);
		z1.añadirAnimales(a2);
		z1.añadirAnimales(a3);
		
		z1.añadirZonas(f1);
		z1.añadirZonas(p1);
		z1.añadirZonas(rest);
		z1.añadirZonas(av1);
		
		z1.añadirInstalaciones(i1);
		z1.añadirInstalaciones(i2);
		z1.añadirInstalaciones(i3);
		z1.añadirInstalaciones(i4);
		
		z1.añadirTrabajadores(t1);
		z1.añadirTrabajadores(t2);
		z1.añadirTrabajadores(t3);
		
		z1.añadirAsignaciones(as1);
		z1.añadirAsignaciones(as2);
		z1.añadirAsignaciones(as3);
		z1.añadirAsignaciones(as4);
		
		//System.out.println(z1.toString());
		/*z1.mostarZonas();
		System.out.println();
		*/
		//z1.mostarZonaTrabajador("50909886g");
		z1.mostarAnimales();
	}

}
