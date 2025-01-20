package new_;

public class ej1_examen {
	
	public static int alea(int li, int ls) {
		
		return (int) (Math.random() * (ls - li + 1)) + li;
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
		System.out.println();
		System.out.printf("El numero maximo es %5d [%d][%d] y el numero minimo es %2d [%d][%d]", maximo, imax, jmax,
				minimo, imin, jmin);
	}


	public static void imprimir(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%5d", m[i][j]);
			}
			System.out.println();
		}
	}

	public static void rellenar(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = alea(0, 1000);
			}
		}

	}
	public static void buscar(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				boolean repetido;
				int numero;
					do {
						repetido=false;
						numero=alea(0,1000);
						for (int k = 0; k < m.length; k++) {
							for (int g = 0; g < m[k].length; g++) {
								if(m[k][g]==numero) {
								repetido=true;
								}
						}
						if(repetido) {
							break;
						}
					}
				}
				while(repetido);
				m[i][j]=numero;	
			}
		}
	}

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		buscar(array);
		// rellenar(array);
		imprimir(array);
		maxmin(array);

	}

}
