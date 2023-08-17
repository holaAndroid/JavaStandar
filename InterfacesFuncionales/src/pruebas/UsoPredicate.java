package pruebas;

import java.util.List;
import java.util.function.Predicate;

public class UsoPredicate {

	public static void main(String[] args) {
		Predicate<Integer> numero = a -> a%2==0;
		System.out.println(numero.test(8));
		numero.test(8);

	
		/*
		List<Integer> nums = List.of(5,4,9,1,-3,8,-5,-6);
		List<String> nombres = List.of("Andrea","Juan","Pedro","Ana","Juan","Luis","Fefa","Juan");
 		System.out.println("Suma pares: "+sumaCondicion(nums,a->a%2==0));
		System.out.println("Suma positivos: "+sumaCondicion(nums,a->a>=0));
		System.out.println("Suma múltiplos de 5: "+sumaCondicion(nums,a->a%5==0));
		
		//¿Cuántos números positivos hay?
		System.out.println("Son positivos: "+ nums.stream().filter(n->n>0).count());
		//¿Cuántos Juanes hay?
		System.out.println("Son Juanes: "+ nombres.stream()
			.filter(n->n.equals("Juan"))
			.count());
		//¿Cuántos nombres distintos hay?
		System.out.println("Son: "+ nombres.stream()
			.distinct()
			.count());	
		//El promedio de los pares
		System.out.println("El menor de los pares es: "+ 
				nums.stream()
				.filter(n->n%2==0) //Filtro los pares
				.sorted()  //Ordenacion natural
				.findFirst()  //Encuentra el primero
				.orElse(0) // Devuelve 0 sino hubiera resultado
);		
		//Imprimir los nombres ordenados eliminando duplicados
		// y que empiecen por "A" 
		   nombres.stream().distinct() .filter(n->n.startsWith("A")) .sorted() 
		   .forEach(n->System.out.println(n));
	}
	
	//método que reciba una lista y devuelva la suma de los pares
	private static int sumaCondicion(List<Integer> list, Predicate<Integer> condicion){
		int suma=0;
		for(Integer n:list) {
			if(condicion.test(n)) {
				suma+=n;
			}
		}	
		return suma;*/
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
