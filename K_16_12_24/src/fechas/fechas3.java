package fechas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class fechas3 {
	
	public static String FechaHoraPer(String patron,LocalDate fecha,Locale l) {
	DateTimeFormatter f=DateTimeFormatter.ofPattern(patron, l);
	return fecha.format(f);
	}
	
	
	public static void mes(LocalDate f) {
		f = f.plusMonths(1).minusDays(1); //El ultimo dia del mes
		while(f.getDayOfWeek()!=DayOfWeek.FRIDAY) {
			f=f.minusDays(1);
		}
		//System.out.println(f.getDayOfMonth()+"/"+f.getMonthValue()+"/"+f.getYear());
		
		System.out.println(FechaHoraPer("EEEE dd-MMMM-yyyy",f,Locale.of("ES")));
		
		
	}

	public static void main(String[] args) {
		//en mi empresa se paga el ultimo viernes d cada mes.
		//indicar en cada uno de los meses del año la fecha de pago.
		LocalDate fecha;
		int anno=LocalDate.now().getYear();
		for(int i=1; i<=12; i++) {
			fecha=LocalDate.of(anno, i, 1);
			mes(fecha);
		}

	}

}
