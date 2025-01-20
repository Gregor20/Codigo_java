package pack;
import java.util.ArrayList;
public class ej5_examen {
//Realiza una función que tome como parámetro un array de cadenas de caracteres y que devuelva otro array con los mismos valores habiendo eliminado las posibles repeticiones. Se distinguen mayúsculas de minúsculas, por tanto “hola” es distinto de “Hola”. Por ejemplo, si el array a contiene los valores {“casa”, “coche”, “sol”, “mesa”, “mesa”, “coche”, “ordenador”, “sol”, “CASA”}, la sentencia sinRepetir(a) devolvería el array {“casa”,“coche”, “sol”, “mesa”, “ordenador”, “CASA”}. Se debe entregar tanto el código de la función como el código de prueba que la usa. La cabecera de la función es la siguiente:
	
	public static String[] sinRepetir  (String[] s) {
		
		ArrayList <String> listasinrepetir = new ArrayList<String>();
	 	
		for(String elemento : s) {
			if(!listasinrepetir.contains(elemento)) {
				listasinrepetir.add(elemento);
			}
	}
		String []resultado= new String[listasinrepetir.size()];
		
		for(int i=0; i<listasinrepetir.size(); i++) {
			resultado[i]=listasinrepetir.get(i);
		}
		return resultado;
		
	}
	public static void main(String[] args) {
		
		String lista[] = {"casa","coche","sol","mesa","mesa","coche","ordenador","sol","CASA"};
		
		String[]resultado=sinRepetir(lista);
		System.out.println("Array sin repeticiones:");
        for (String elemento : resultado) {
            System.out.println(elemento);
        }
	}

}
