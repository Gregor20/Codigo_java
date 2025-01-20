package fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class fecha_6 {
	public static String FechaHoraPer(String patron,LocalDateTime fecha,Locale l) {
		DateTimeFormatter f=DateTimeFormatter.ofPattern(patron, l);
		return fecha.format(f);
		}

	public static void main(String[] args) {
		LocalDateTime hoy=LocalDateTime.now();
		System.out.println(hoy);
		
		LocalDateTime fecha=LocalDateTime.of(2024, 1, 10, 12, 30);
		System.out.println(FechaHoraPer("dd-MM-yyy H:m:s",fecha,Locale.of("ES")));

	}

}
