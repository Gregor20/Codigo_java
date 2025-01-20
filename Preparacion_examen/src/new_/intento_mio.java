package new_;

//Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición tanto del máximo como del mínimo.
public class intento_mio {

	public static int alea(int nm, int m) {
		return (int) (Math.random() * (m - nm + 1) + nm);
	}

	public static void imprimirYrellenar(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {

				m[i][j] = alea(0, 1000);
				System.out.printf("%5d", m[i][j]);
			}
			System.out.println();
		}
	}

	public static void maxmin(int m[][]) {
		int maximo = -1, minimo = 1050, imax = 0, jmax = 0, imin = 0, jmin = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {

				if (m[i][j] > maximo) {
					maximo = m[i][j];
					imax = i;
					jmax = j;
				} else if (m[i][j] < minimo) {
					minimo = m[i][j];
					imin = i;
					jmin = j;
				}

			}
		}
		System.out.printf("Nº maximo= %3d [%d][%d]  Nº minimo=%3d [%d][%d]", maximo, imax, jmax, minimo, imin, jmin);
	}

	public static void main(String[] args) {
		int array[][] = new int[6][10];
		imprimirYrellenar(array);
		maxmin(array);
	}
}
