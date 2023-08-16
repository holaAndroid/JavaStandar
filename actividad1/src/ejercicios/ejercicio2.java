package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un nombre: ");
		String nombre = teclado.next();
		System.out.println("Introduce un apellidos: ");
		String apellidos = teclado.next();
		System.out.println("Buenos días: " +nombre+ " "+apellidos);
	}
}
