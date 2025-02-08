package clases;

import java.time.LocalDate;

public class CuentaAhorro extends Cuenta {

	private double cuotaMantenimiento;
	
	public CuentaAhorro(String nombre, String cuenta, double saldo, double tipoDeInteres, double cuotaMantenimiento) {
		super(nombre, cuenta, saldo, tipoDeInteres);
		this.cuotaMantenimiento = cuotaMantenimiento;
	}
	

	public double getCuotaMantenimiento() {
		return cuotaMantenimiento;
	}
	public void setCuotaMantenimiento(double cuotaMantenimiento) {
		this.cuotaMantenimiento = cuotaMantenimiento;
	}


	@Override
	public void comisiones() {
		LocalDate hoy= LocalDate.now();
		if (hoy.getDayOfMonth()==1)reintegro(this.cuotaMantenimiento);
	}

	@Override
	public double intereses() {
		LocalDate hoy = LocalDate.now();
		if (hoy.getDayOfMonth()!=1) return 0.0;
		
		return this.saldo*this.tipoDeInteres/1200;
	}


	@Override
	public String toString() {
		return "CuentaAhorro [cuotaMantenimiento=" + cuotaMantenimiento + ", nombre=" + nombre + ", cuenta=" + cuenta
				+ ", saldo=" + saldo + ", tipoDeInteres=" + tipoDeInteres + ", getCuotaMantenimiento()="
				+ getCuotaMantenimiento() + ", intereses()=" + intereses() + "]";
	}
	
	
	
}
