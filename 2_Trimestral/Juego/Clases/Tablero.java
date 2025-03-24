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
			System.out.println();
			for (int j = 0; j < COL; j++) {
				System.out.printf("%4d",this.tablero[i][j]);
			}
			System.out.println();
		}
	}
	public boolean tableroCompleto() {
		for (int i = 0; i < FIL; i++) {
			for (int j = 0; j < COL; j++) {
				if(tablero[i][j]==0) {
					return false;
				}
			}
		}return true;
	}

	public void moverArriba() {
		for (int j = 0; j < COL; j++) {
			for (int i = 1; i < FIL; i++) {
				if (this.tablero[i][j] != 0 ) {
					int ref = i;
					while (ref > 0  && this.tablero[ref-1][j] == 0 ) {
							this.tablero[ref - 1][j] = this.tablero[ref][j];
							this.tablero[ref][j] = 0;
							ref--;
					}
					if(ref > 0 && this.tablero[ref-1][j] == this.tablero[ref][j]) {
						this.tablero[ref-1][j] += this.tablero[ref][j];
						this.tablero[ref][j] = 0;
					}
				}
		}
		}
		rellenarTablero();
	}

	public void moverAbajo() {
		for (int j = 0; j < COL; j++) {
			for (int i = FIL-1; i >= 0; i--) {
				if (this.tablero[i][j] != 0) {
					int ref = i;
					while (ref < FIL-1 && this.tablero[ref+1][j]==0) {
						this.tablero[ref + 1][j] = this.tablero[ref][j];
						this.tablero[ref][j] = 0;
						ref++;
					}
					if(ref < FIL-1 && this.tablero[ref+1][j]==this.tablero[ref][j]) {
						this.tablero[ref+1][j] += this.tablero[ref][j];
						this.tablero[ref][j]=0;
					}
				}
			}
		}
		rellenarTablero();
	}

	public void moverDerecha() {
		for (int i = 0; i < FIL; i++) {
			for (int j = COL - 2; j >= 0; j--) {
				if (this.tablero[i][j] != 0) {
					int ref = j;
					while (ref < COL -1 && this.tablero[i][ref +1] == 0) {
						this.tablero[i][ref + 1] = this.tablero[i][ref];
						this.tablero[i][ref] = 0;
						ref++;
					}
					if(ref < COL -1 && this.tablero[i][ref +1] == this.tablero[i][ref]) {
						this.tablero[i][ref +1] += this.tablero[i][ref];
						this.tablero[i][ref]=0;
					}
				}
			}
		}
		rellenarTablero();
	}
/*	ESTE MOVER IZQUIERDA ES MOVER DERECHA PERO EL BUCLE DISTINTO
	public void moverIzquierda() {
		for (int j = 0; j < FIL; j++) {
			for (int i = 0; i < COL; i++) {
				if (this.tablero[j][i] != 0) {
					int ref = i;
					while (ref < 3) {
						this.tablero[j][ref+1] += this.tablero[j][ref];
						this.tablero[j][ref] = 0;
						ref++;
					}
				}
			}
		}
		rellenarTablero();
	}
*/
	
	public void moverIzquierda() {
		for (int i = 0; i < FIL; i++) {
			for (int j = 1; j < COL; j++) {
				
				if (this.tablero[i][j] != 0) {// si la posicion es 2 por ejemplo, haz esto
					
					int ref = j;//variable de referencia 
					
					while (ref > 0 && this.tablero[i][ref-1]==0) { // mientras que ref sea mayor que 0 y la posicion [0][0] a la que voy a moverme = 0
						this.tablero[i][ref-1] = this.tablero[i][ref];
						this.tablero[i][ref] = 0;
						ref--;
					}
					if(ref > 0 && this.tablero[i][ref-1] == this.tablero[i][ref]) {
						this.tablero[i][ref-1]+=this.tablero[i][ref];
						this.tablero[i][ref]=0;
					}
				}
			}
		}
		rellenarTablero();
	}
	
	public boolean ganador() {
		for (int i = 0; i < FIL; i++) {
			for (int j = 0; j < COL; j++) {
				if(tablero[i][j]==2048)return true;
			}
		}return false;
	}
	
	public String finPartida() {
		if(tableroCompleto()) {
			return "Tablero completo\n";
		}else if(ganador()) {
			return "Has ganado\n";
		}return "Fin del juego";
		
	}
	
}
