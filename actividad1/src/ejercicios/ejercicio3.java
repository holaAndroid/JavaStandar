package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// Diseñar un programa que permita ingresar el número de horas y presentará el número de semanas,
		// días y horas que corresponda a las horas ingresadas.
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese el número de horas: ");
			int horasIngresadas = sc.nextInt();
			int semanas = horasIngresadas / (24 * 7);
			int dias = horasIngresadas % (24 * 7) / 24;
			int horasRestantes = horasIngresadas % 24;
			
			System.out.println("Hay " + semanas + " semanas, " + dias + " dias y " 
			+ horasRestantes + " horas en " + horasIngresadas + " horas.");
	}
}