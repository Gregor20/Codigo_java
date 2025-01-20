package new_;
import java.util.ArrayList;
public class ej5_examen_2 {
//Realiza una función que tome como parámetro un array de cadenas de caracteres y que devuelva otro array con los mismos valores habiendo eliminado las posibles repeticiones. Se distinguen mayúsculas de minúsculas, por tanto “hola” es distinto de “Hola”. Por ejemplo, si el array a contiene los valores {“casa”, “coche”, “sol”, “mesa”, “mesa”, “coche”, “ordenador”, “sol”, “CASA”}, la sentencia sinRepetir(a) devolvería el array {“casa”,“coche”, “sol”, “mesa”, “ordenador”, “CASA”}. Se debe entregar tanto el código de la función como el código de prueba que la usa. La cabecera de la función es la siguiente:
	
	public static String[] sinRepetir  (String[] s) {
		
		ArrayList <String> listasinrepetir = new ArrayList<String>(); //--- ArrayList donde se almacenan elementos sin repetir
		
		for(String elementos : s) {
			if(!listasinrepetir.contains(elementos)) {
				listasinrepetir.add(elementos);
			}
		}
		
		 String lista_final []= new String [listasinrepetir.size()]; // --- Arreglo donde se almacenan los elementos finales
		 	
		 	for(int i=0; i<listasinrepetir.size(); i++) {
		 		lista_final[i]=listasinrepetir.get(i); // -------- Paso de la ArrayList a Arreglo
		 		
		 	}
		 	return lista_final; //------------- Devuelve arreglo
	}
	public static void main(String[] args) {
		
		String lista[] = {"casa","coche","sol","mesa","mesa","coche","ordenador","sol","CASA","libro","LIBRO","lapiz","lapiz","lápiz"};
		String resultado []=sinRepetir(lista);
		
		for(String devuelve : resultado) {
			System.out.println(devuelve); //-------Devuelve cada elemento unico
		}
		
	}

}
