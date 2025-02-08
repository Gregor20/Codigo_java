package clases;

import java.time.LocalDate;

public class CuentaCorrienteConInteres extends CuentaCorriente {

	public CuentaCorrienteConInteres(String nombre, String cuenta, double saldo, double tipoDeInteres,
			double importePorTrans, int transExentas) {
		super(nombre, cuenta, saldo, tipoDeInteres, importePorTrans, transExentas);
	}

	@Override
	public double intereses() {
		LocalDate hoy=LocalDate.now();
		
		if(hoy.getDayOfMonth()!=1 | this.saldo < 3000) return 0.0;
		
		
		double interesesProducidos = saldo*this.tipoDeInteres/1200;
		ingreso(interesesProducidos);
		this.transacciones--;
		
		return interesesProducidos;
	}
	
}
