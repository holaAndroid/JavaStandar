package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// leer la cantidad de ºC y permite traducir a grados Fahrenheit. 
		// La fórmula para realizar está transformación es: F = 32 + ( 9 * C / 5 )
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la temperatura en grados centigrados");
		// Leer la entrada del usuario
		double celsius = sc.nextDouble();
		// Convertimos la temperatura a grados Fahrenheit.
		double Fahrenheit = 32 + ( 9 * celsius / 5 );
		// imprime la temperatura convertida.
		System.out.println("La temperatura en grados Fahrenheit es: " + Fahrenheit +" F ");
	}

}
