package clases;

public class Cuadrado extends FigurasGeometricas {

	public Cuadrado(double lado1) {
		super(lado1);
	}

	@Override
	public double perimetro() {
		
		return 4*this.lado1;
	}

	@Override
	public double area() {
		
		return Math.pow(lado1, lado1);
	}
	
	

}
