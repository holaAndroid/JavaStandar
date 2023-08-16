package ejercicios;

import java.util.Scanner;

 public class ejercicio1 {

	public static void main(String[] args) {
// Leer 2 números enteros y mostrarlos por pantalla
		/*
		 * Scanner objeto para leer cosas del teclado.
		 */
		// Leer dos números enteros
	Scanner lectura = new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
	int numero1 = lectura.nextInt();
		System.out.println("Introduce el segundo numero: ");
		int numero2 = lectura.nextInt();


		// Mostrar los números por pantalla
		 System.out.println("Los numeros ingresados son: " + numero1 + " " + numero2);
	}

}
