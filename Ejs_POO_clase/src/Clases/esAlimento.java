package Clases;

import java.time.LocalDate;

public interface esAlimento {
	//GETTER & SETTER DE CADUCIDAD Y GETTER CALORIAS
	void setCaducidad(LocalDate fc);
	LocalDate getCaducidad();
	int getCalorias();
}
