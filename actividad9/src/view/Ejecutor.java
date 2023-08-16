package view;

import java.util.Scanner;

import model.Persona;

public class Ejecutor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		//Introducimos los datos
		System.out.println("Introduce un nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduce la edad");
		int edad = Integer.parseInt(sc.nextLine());
	 System.out.println("Introduce el sexo");
	 char sexo = sc.nextLine().charAt(0);
		System.out.println("Introduce el peso");
		double peso = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce la altura");
		double altura = Double.parseDouble(sc.nextLine());
		
		// Creamos objetos
		Persona persona1 = new Persona();
		Persona persona2 = new Persona(nombre, edad, sexo);
		Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);
		
		persona1.setNombre("Tatiana");
		persona1.setEdad(40);
		persona1.setSexo('M');
		persona1.setPeso(83);
		persona1.setAltura(1.70);
		persona2.setPeso(90.5);
		persona2.setAltura(1.69);
		System.out.println("Persona1");
		Mostrar(persona1);
		MostrarMayorDeEdad(persona1);
		System.out.println(persona1.toString());
		System.out.println("Persona2");
		Mostrar(persona2);
		MostrarMayorDeEdad(persona2);
		System.out.println(persona2.toString());
		System.out.println("Persona3");
		Mostrar(persona3);
		MostrarMayorDeEdad(persona3);
		System.out.println(persona3.toString());
}
public static void Mostrar(Persona p) {
	int IMC = p.calcularIMC();
	switch (IMC) {
		case Persona.PESO_IDEAL:
		System.out.println("La persona esta en su peso ideal");
		break;
		case Persona.NOT_PESOIDEAL:
		System.out.println("La Persona esta por debajo de su peso.");
		break;
		case Persona.SOBRE_PESO:
		System.out.println("La persona tiene obesidad");
		break;
	}
}
public static void MostrarMayorDeEdad(Persona p) {
			if (p.esMayorDeEdad()) {
						System.out.println("La persona es mayor de edad");
			} else {
						System.out.println("La persona es menor de edad");
			}
			
}
}
