package intro;

import java.util.Scanner;

public class Testing {
 	public static void main(String[] args) {
/* 		//Solicita 5 números mediante un bucle e indica
 		//cual es el mayor.
		Scanner sc = new Scanner(System.in);
		int i;
		int mayor= 0;
		// Solicita números al usuario
		for(i=0;i<5;i++) {
						System.out.println("Dime un numero: ");
						int n = sc.nextInt();
						if (n > mayor) {
							mayor = n;
						}
		}
System.out.println("El mayor numero es: " + mayor);*/
 		// Pedir números hasta que se teclee un 0 y mostrar la suma
 		// de los numeros introducidos.
 		System.out.println("Aplicacion que solicita numeros hasta introducir 0");
 		Scanner sc = new Scanner(System.in);
 		int n;
 		int total= 0;
 		do {
				System.out.println("Dime numeros: ");
				n = sc.nextInt();
				total += n;
			} while (n !=0);
 		System.out.println("La suma de los numeros introducidos es: " +total);
 	}
}
