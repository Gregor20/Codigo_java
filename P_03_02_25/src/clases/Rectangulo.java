package clases;

public class Rectangulo extends FigurasGeometricas {
	private double lado2;
	
	public Rectangulo(double lado1, double lado2) {
		super(lado1);
		this.lado2 = lado2;
	}

	@Override
	public double perimetro() {
		
		return 2*(this.lado1 + this.lado2);
	}

	@Override
	public double area() {
		
		return this.lado1 * this.lado2;
	}

	@Override
	public String toString() {
		return "Rectangulo (" + this.lado1 + "";
	}
	

}
