package pack;

import java.util.HashMap;
import java.util.Map.Entry;

public class ej_hashmap1 {

	public static void main(String[] args) {
		
		HashMap<String,Double> alumnos=new HashMap<String,Double>();
		alumnos.put("PEREZ", 1.80);
		alumnos.put("RUIZ", 1.85);
		alumnos.put("LOPEZ", 1.72);
		alumnos.put("MARTIN", 1.60);
		alumnos.put("MARTIN", 1.75);
		
		for(String c:alumnos.keySet()) {
			System.out.println(c+" "+alumnos.get(c));
		}
		System.out.println("==================");
		for(Double v:alumnos.values()) {
			System.out.println(v);
		}
		System.out.println("=================");
		for(Entry<String,Double> item: alumnos.entrySet()) {
			System.out.printf("clave=%s valor=%.2f\n",item.getKey(),item.getValue());
		}

	}

}
