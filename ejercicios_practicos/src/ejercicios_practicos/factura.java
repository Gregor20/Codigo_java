package ejercicios_practicos;

import java.util.ArrayList;

/*Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las
facturas. En cada factura figura: el código del artículo, la cantidad vendida en litros y el
precio por litro.
Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1
y cuantas facturas se emitieron de más de 600 €.*/

public class factura {
	
	private int codigo;
	private double cantidad;
	private double precio;
	

	public factura(int codigo, double cantidad, double precio) {
		super();
		this.codigo = codigo;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	public double getCantidadArticuloUno() {
		return (this.codigo==1) ? this.codigo : 0;
		
	}


	public double facturacion_total() {
		 double total = this.cantidad * this.precio;
		 return total;
	}


	@Override
	public String toString() {
		return "factura [codigo=" + codigo + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	
	public static void main (String[]args) {
		factura f1 = new factura (1, 24, 100);
		factura f7 = new factura (1, 50, 200);
		factura f2 = new factura (2, 34, 25.2);
		factura f3 = new factura (3, 10, 24);
		factura f4 = new factura (4, 2, 76);
		factura f5 = new factura (5, 4, 10.5);
		factura f6 = new factura (6, 150, 10.5);
		
		ArrayList<factura> matriz=new ArrayList<factura>();
		matriz.add(f1);
		matriz.add(f2);
		matriz.add(f3);
		matriz.add(f4);
		matriz.add(f5);
		matriz.add(f6);
		matriz.add(f7);
		
		double total=0;
		int cantidad=0;
		double totalCantidad=0;
		
		for (factura i : matriz) {
			total += i.facturacion_total();
				if(i.facturacion_total()>600) {
					cantidad++;
			}
				totalCantidad += i.getCantidadArticuloUno();
				
				
		}
		System.out.printf("La facturación total es de: %.2f€\n",total);
		System.out.printf("La cantidad en litros vendidos del artículo 1 es %.2f\n",totalCantidad);
		System.out.printf("Se han emitido %d facturas de mas de 600€",cantidad);
	}
	
}
