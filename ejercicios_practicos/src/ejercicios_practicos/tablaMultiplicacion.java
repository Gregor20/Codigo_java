package ejercicios_practicos;

// ejemplo del libro, usa un JOptionPane para ingresar un numero y se crea una matriz bidimensional para hacer la tabla de 
// multiplicacion de ese numero
import javax.swing.JOptionPane;

public class tablaMultiplicacion {

	public static void main(String[] args) {

		int tab[][] = new int[10][2];
		int num = 5;

		String mensaje = "Tabla de multiplicación del número";
		Integer NumeroIntroducido = Integer.valueOf(JOptionPane.showInputDialog(mensaje));

		int numero = NumeroIntroducido.intValue();

		for (int columna = 0; columna < 2; columna++) {
			for (int fila = 0; fila < 10; fila++) {
				if (columna == 0) {
					tab[fila][columna] = fila + 1;
				} else {
					tab[fila][columna] = numero * (fila + 1);
				}
			}
		}

		System.out.println("Tabla de " + numero);
		System.out.println("-----------------------");

		for (int columna = 0; columna < 2; columna++) {
			for (int fila = 0; fila < 10; fila++) {
				if (columna > 0) {
					System.out.println(tab[fila][columna - 1] + "x" + numero + "=" + tab[fila][columna]);
				}
			}
		}

	}
}
