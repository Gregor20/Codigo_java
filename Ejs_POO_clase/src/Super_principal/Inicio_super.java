package Super_principal;

import java.time.LocalDate;
import java.util.ArrayList;

import Clases.Cereales;
import Clases.Detergente;
import Clases.Vino;
import Clases.esAlimento;

public class Inicio_super {

	public static void main(String[] args) {
		
		Detergente d1 = new Detergente("Ariel", 50);
		d1.setDescuento(20);
		d1.setvolumen(10);
		d1.setTipoEnvase("Botella de plástico");
		
		System.out.println(d1);
		System.out.println("Precio con descuento "+d1.getPrecioDescuento());
		
		Cereales c1 = new Cereales("Corn Flakes",20,"Maiz");
		c1.setCaducidad(LocalDate.of(2022, 8, 2));
		System.out.println("Calorias "+c1.getCalorias());
		System.out.println(c1);
		
		Vino v1= new Vino("Cune", "tinto", 12, 20);
		v1.setvolumen(330);
		v1.setTipoEnvase("botella de cristal");
		v1.setCaducidad(LocalDate.of(2026, 7, 10));
		v1.setDescuento(5);
		System.out.println(v1);
		
		ArrayList<esAlimento> lista= new ArrayList<>();
		lista.add(c1);
		lista.add(v1);
		
		int total=0;
		for (esAlimento item : lista) total+=item.getCalorias();
		System.out.println("total Calorias "+total);
	}

}
