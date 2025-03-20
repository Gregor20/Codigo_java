package Clases;

import java.util.Arrays;

public class Tablero {

	private final static int COL = 4;
	private final static int FIL = 4;

	private int[][] tablero;

	private double alea() {
		return Math.random() * (FIL);
	}

	public void rellenarTablero() {
		int a = (int) alea();
		int b = (int) alea();

		while (this.tablero[a][b] != 0) {
			a = (int) alea();
			b = (int) alea();
		}
		this.tablero[a][b] = 2;
	}

	public Tablero() {
		super();
		this.tablero = new int[FIL][COL];
	}

	public void mostrarTablero() {
		for (int i = 0; i < FIL; i++) {
			for (int j = 0; j < COL; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void moverArriba() {
		for (int j = 0; j < COL; j++) {
			for (int i = 1; i < FIL; i++) {
				if (this.tablero[i][j] != 0) {
					int ref = i;
					while (ref > 0 /* && this.tablero[ref-1][j] == 0 */) {
						this.tablero[ref - 1][j] += this.tablero[ref][j];
						this.tablero[ref][j] = 0;
						ref--;
					}
				}
			}
		}
		rellenarTablero();
	}

	public void moverAbajo() {
		for (int j = 0; j < COL; j++) {
			for (int i = 0; i < FIL; i++) {
				if (this.tablero[i][j] != 0) {
					int ref = i;
					while (ref < 3) {
						this.tablero[ref + 1][j] += this.tablero[ref][j];
						this.tablero[ref][j] = 0;
						ref++;
					}
				}
			}
		}
		rellenarTablero();
	}



	public void moverDerecha() {
		for (int i = 0; i < FIL; i++) {
			for (int j = 0; j < COL; j++) {
				if (this.tablero[i][j] != 0) {
					int ref = j;
					while (ref < 3) {
						this.tablero[ref+1][i]+=this.tablero[ref][i];
						this.tablero[ref][i]=0;
						ref++;
					}
				}
			}
		}
		rellenarTablero();
	}

}
