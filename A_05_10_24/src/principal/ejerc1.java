package principal;

public class ejerc1 {

	public static void main(String[] args) {
		
		
		String cadena= "Hola Mundo" ;
		int numero= 365;
		double salario= 3500.50, comision=300.45;
		
		System.out.println(cadena);
		System.out.println(numero);
		System.out.println(salario+" "+comision);
		
		
		numero=numero+1000; // numero+=1000; ----->1365
		numero=numero-1000; // numero-=1000; ----->365
		numero=numero*(2000+500); // numero*=2000+500;
		numero=numero/10; // numero/=10; ------>
		
		System.out.println(numero);
		
		salario*=1.10;    //salario=salario*1.10;  3.850,55
		salario/=20;     //salario=salario/20;    192,5275
		
		System.out.println(salario);
		
		

	}

}
