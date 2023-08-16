package ejercicios;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// Realizar un programa que transforme la velocidad de km/h a m/s.
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la velocidad en km/h");
		double kmh = sc.nextDouble();
		// 1000 metros / 3600 segundos = 0.2778 m/s
		double ms = kmh / 3.6; // dividimos en 3.600
		System.out.println("La velocidad en m/s es: " + ms);
	}
}
