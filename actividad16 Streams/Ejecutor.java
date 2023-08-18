package view;

import java.util.Comparator;
import java.util.List;

public class Ejecutor {

	public static void main(String[] args) {
		//actividad 16
		List<Integer> nums=List.of(9,-4,11,3,2,6,2,5,8,17,11,1,-5);
		List<String> nombres=List.of("cadena","luz","dia","meteoro","bicicleta");
		List<Integer> edades=List.of(5,19,27,75,23,11,6,64,49);
		//a.	¿cuántos números hay en la lista, sin contar repetidos?
		System.out.println(
				nums.stream() // Convierto la lista en Stream
				.distinct()  //Elimino duplicados del Stream
				.count()
				);   // Elimina duplicados
		// b.Imprimir los 8 primeros números sin contar duplicados.
				 nums.stream()
				 .distinct()
				 .limit(8) // Limito a los 8 primeros
				 .forEach(n->System.out.print((n)+ " ")); // imprime cada uno de los numeros
				 System.out.println();
				 //c.	¿Hay algún número negativo?
					System.out.println(
							nums.stream() // Convierto la lista en Stream
							.anyMatch(n->n<0)  //devuelve un booleano
							
							); 
					System.out.println(
							nums.stream() // Convierto la lista en Stream
							.allMatch(n->n<0)  //Son todos negativos.
							); 
				//	d.	¿Cuántos números negativos distintos hay?
					System.out.println(
							nums.stream() // Convierto la lista en Stream
							.filter(n->n<0) //Filtro los negativos
							.distinct()  //Elimino duplicados del Stream
							.count()
							);
					//e.	Mostrar los números de la lista 
					 //ordenados de menor a mayor.
					 nums.stream()
					 				.sorted() // Ordenacion natural
					 				.forEach(n->System.out.print(n+" "));
						System.out.println();
					 //f.	Mostrar el total de caracteres de cada nombre.
					 //List<String> nombres=List.of("cadena","luz","dia","meteoro","bicicleta");
					 			nombres.stream()
					 			// 					.forEach(n->System.out.print(n.length()+" "));
					 			// muestra la suma de todos los caracteres de los nombres.
					 					.mapToInt(n->n.length()) // crea un stream con la longitudes
					 					.forEach(n->System.out.print(n+" "));
					 					System.out.println();
					 			//g.	Mostrar la suma de todos los caracteres de la lista de nombres.
					 			System.out.println(
					 			nombres.stream()
					 			.mapToInt(n->n.length()) // crea un stream con la longitudes
			 					.sum()
					 					);
					 	//h.	Mostrar la media de todos los caracteres 
					 //de la lista de nombres.
					 			System.out.println(
							 			nombres.stream()
							 			.mapToInt(n->n.length()) // crea un stream con la longitudes
					 					.average() // devuelve la media envuelto en Optional
					 					.orElse(0)  // extraigo el dato del optional y 0 si vacio
							 					);
					 			//i.	Mostrar los nombres ordenados alfabéticamente
					 			nombres.stream()
					 						.sorted()
					 						.forEach(n->System.out.print(n+" "));
					 			//j.	Mostrar los nombres ordenados de menos a mayor
					 						//	número de caracteres.
					 			System.out.println();
					 			nombres.stream()
					 			// compara las longitudes 
		 						.sorted(Comparator.comparing(a->a.length()))
		 						.forEach(n->System.out.print(n+" "));
					 			System.out.println();
					 			nombres.stream()
					 			.sorted((a,b)->a.length()- b.length())
					 			//podemos invertir
					 			//.sorted(a,b)->b.length()- a.length()
					 			 	.forEach(n->System.out.print(n+" "));
					 			System.out.println();
					 			//k.	Mostrarlos nombres ordenados inversamente.
					 			nombres.stream() 
		 						.sorted(Comparator.reverseOrder())
		 						.forEach(n->System.out.print(n+" "));
					 			System.out.println();
					 //l.	Mostrar la media de la lista edades de los menores de edad.
					 			System.out.println(
					 			edades.stream()
					 			.filter(e->e<18)
					 			.mapToInt(n->n) // Devuelve im omtStrea,
					 			.average()
					 			.orElse(0)
					 			);
	}

}
