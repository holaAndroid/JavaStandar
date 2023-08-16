package pruebas;

import java.util.List;
import java.util.function.Predicate;

public class UsoPredicate {

	public static void main(String[] args) {
		List<Integer> nums = List.of(5,4,9,1,-3,8,-5,-6,22);
		//Sumar los pares
		System.out.println("La suma de los pares es:"
		+sumaPares(nums));
		System.out.println("La suma de los pares es:"
		+sumaCondicion(nums,a->a%2==0));		
		//Sumar los positivos
		System.out.println("La suma de los positivos es:"		
				+sumaPositivos(nums));
		System.out.println("La suma de los pares es:"
		+sumaCondicion(nums,a->a>0));			
		//Sumar los m�ltiplo de 5
		System.out.println("La suma de los multiplos de 5 es:"		
				+sumaMultiplos5(nums));	
		System.out.println("La suma de los pares es:"
		+sumaCondicion(nums,a->a%5==0));			
	
		//Sumar los impares
		System.out.println("La suma de los impares es:"
		+sumaCondicion(nums,a->a%2!=0));
		//Sumar los impares positivos
		System.out.println("La suma de los impares positivos es:"
		+sumaCondicion(nums,a->(a%2!=0 && a>0)));
	}

	private static int sumaCondicion(List<Integer> list, Predicate<Integer> condicion) {
		int suma=0;
		for(Integer n:list) {
			if (condicion.test(n)) suma+=n;
		}
		return suma;
	}

	private static int sumaPares(List<Integer> list) {
		int suma=0;
		for(Integer n:list) {
			if (n%2==0) suma+=n;
		}
		return suma;
	}
	
	private static int sumaPositivos(List<Integer> list) {
		int suma=0;
		for(Integer n:list) {
			if (n>0) suma+=n;
		}
		return suma;
	}
	
	private static int sumaMultiplos5(List<Integer> list) {
		int suma=0;
		for(Integer n:list) {
			if (n%5==0) suma+=n;
		}
		return suma;
	}
}
