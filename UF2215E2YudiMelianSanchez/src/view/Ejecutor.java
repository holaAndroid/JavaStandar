package view;

import java.util.Scanner;

import model.Triangulo;

public class Ejecutor {

	public static void main(String[] args) {
		double base, altura;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la base: ");
		base = sc.nextDouble();
		System.out.println("Introduce la altura: ");
		altura = sc.nextDouble();
	 Triangulo a = new Triangulo(base,altura);
	 System.out.println("La superficie es: " +a.superficie());

	}
}
