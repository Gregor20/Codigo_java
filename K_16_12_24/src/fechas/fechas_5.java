package fechas;

import java.time.LocalDate;
import java.time.YearMonth;

public class fechas_5 {

	public static void main(String[] args) {
		YearMonth f=YearMonth.of(2024, 1);
		LocalDate fecha=f.atDay(15);
		System.out.println(fecha);

	}

}
