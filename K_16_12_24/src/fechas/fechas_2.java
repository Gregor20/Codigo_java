package fechas;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class fechas_2 {

	public static void main(String[] args) {
		
		int anno=LocalDate.now().getYear();
		
		LocalDate fecha=LocalDate.of(anno, 6, 14);
		
		System.out.println(fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.of("ES")));
		
		
		
		LocalDate fechapedido=LocalDate.now();
		LocalDate fechavenciemiento=fechapedido.plusMonths(3).plusWeeks(1).plusDays(1);
		
		System.out.println("Fecha pedido:"+fechapedido);
		System.out.println("Fecha venciemiento:"+fechavenciemiento);
		
		

	}

}
