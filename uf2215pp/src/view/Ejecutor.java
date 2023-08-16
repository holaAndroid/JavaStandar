package view;

import java.util.Scanner;

import model.Coches;

public class Ejecutor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// solicita matricula y kms de un coche
		System.out.println("Dime la matricula del coche: ");
		String matricula = sc.next();
		System.out.println("Dime los kilometros del coche: ");
		int kilometros = sc.nextInt();
		
		// Crea un objeto coche solicitando los datos anteriores
		Coches coche = new Coches (matricula, kilometros);
		// Llama a su método circular 2 veces con 100 y 200 kilómetros 
		coche.circular(100);
		coche.circular(200);
		// Mustra matricula y kilometros totales
		System.out.println("La matricula es: " +coche.getMatricula());
		System.out.println("Los kilometros totales son: " +coche.getKilometros());
	}

}
