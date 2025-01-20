package fechas;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Fechas {

	public static void main(String[] args) {
		LocalDate fecha=LocalDate.now(); //fecha del sistema
		System.out.println(fecha);
		
		System.out.println(fecha.getDayOfMonth()+"/"+fecha.getMonthValue()+"/"+fecha.getYear());
		System.out.println(fecha.getDayOfWeek().getValue());
		System.out.println(fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.of("ES")));
		System.out.println(fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.of("EN")));
		
		LocalDate fecha1=LocalDate.of(1998, 6, 14);
		System.out.println(fecha1.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.of("ES")));

	}

}
