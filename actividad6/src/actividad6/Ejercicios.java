 package actividad6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicios {
	static void ejercicio1() {
		// Genera un array de 10 enteros con números aleatorios del 1 al 100.
		//Indica el valor del menor y el mayor de los números del array.
		int [] numeros = new int[10];
		int i, min=101, max=0;
		for (i = 0; i < numeros.length; i++)			//floor elimina decimales
				numeros[i]= (int) Math.floor(Math.random()*100)+1; // random aleatorios
			// genera números aleatorios entre 1 y 100
		for (i = 0; i < numeros.length; i++) 
			System.out.print(numeros[i]+ " ");

	for (i=0; i < numeros.length; i++) {
		if (min > numeros[i]) min= numeros[i];
		if (max < numeros[i]) max= numeros[i];
	}
	System.out.println();
	System.out.print("El minimo  de los numeros aleatorios es: " +min + "y el máximo es :" +max);

	}	
	static void ejercicio2() {
		// Genera un array de 10 enteros con números aleatorios del 1 al 100.
		//Solicita un valor entero e indica si se encuentra entre los valores
		//del array o no. En caso de encontrarse indica su posición.
		//Creamos una matriz aleatoria de 10 enteros.
		int i = 0;
		int[] numeros = new int[10];
		Random random = new Random();
		// Generamos el array de numeros aleatorios
		for (i=0; i < numeros.length; i++) {
			numeros[i] = (int) Math.floor(Math.random()*100)+1;
		}
		//Mostrar el array generado
		System.out.println("El array de numeros generados: ");
		for (i =0; i< numeros.length; i++) {
			System.out.print(numeros[i]+ " ");
		}
		System.out.println();

		Scanner sc = new Scanner(System.in);
		// Pedir al usuario que introduzca un número
		System.out.print("\nIntroduce un numero: ");
		int number = sc.nextInt();
				// Comprobar si el número introducido está en el array
				
				boolean encontrado = false;
			for (i=0; i < numeros.length; i++) {
					if (numeros[i] == number) {
						encontrado = true;
						break;
					}
			}
			if (!encontrado) System.out.println("El numero " + number + 
					" no se encontro en el array");
			else {
				System.out.println("Se ha encontrado el numero " + number + 
						" en la posicion " + ++i);
			}
}
	
	static void ejercicio2b() {
		// Genera un array de 10 enteros con números aleatorios del 1 al 100.
		//Solicita un valor entero e indica si se encuentra 
		//entre los valores del array o no. 
		//En caso de encontrarse indica su posición.
		//Creamos una matriz aleatoria de 10 enteros.
	 int[] numeros = new int[10];
  int i, entrada;
  boolean encontrado = false;
  Scanner sc = new Scanner(System.in);
  for (i=0;i<numeros.length;i++) {
      numeros[i]= (int) Math.floor(Math.random()*100)+1;
      System.out.print(numeros[i]+" ");
  }
  System.out.print("\nDime el numero a buscar: ");
  entrada = Integer.parseInt(sc.nextLine());
  i = 0;
  while (i<numeros.length && !encontrado)
      if (entrada==numeros[i++]) encontrado = true;
  if (encontrado) 
      System.out.println("Numero encontrado en la posicion: " + i);
  else
      System.out.println("Numero no encontrado");
}


	static void ejercicio3() {
		// Genera un array de 10 enteros con números aleatorios del 1 al 100.
		//Indica el valor del menor y el mayor de los números del array.
		int[] numeros = new int [10];
		int i,j,t;
		for (i=0;i<numeros.length;i++) {
						numeros[i]= (int) Math.floor(Math.random()*100)+1;
						System.out.print(numeros[i]+ " ");
	}
		for (i=0;i<numeros.length-1;i++) {
			for (j=i+1;j<numeros.length;j++) {
				if(numeros[i]<numeros[j]) {
					t =numeros[i];
					numeros[i]= numeros[j];
					numeros[j]=t;
				}
			}
		}
  System.out.println("\nLos numeros ordenados descendente son: ");
  for (i=0;i<numeros.length;i++)
      System.out.print(numeros[i]+" ");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio2();
	}

}
