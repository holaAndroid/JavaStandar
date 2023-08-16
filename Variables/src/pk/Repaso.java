package pk;

import java.util.Scanner;

public class Repaso {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		String nombre;
		String apellido;
		String fullName;
		String dni;
		System.out.println("Dime tu nombre");
		nombre = lector.nextLine();
		System.out.println("Mi nombre es: "+nombre);
		System.out.println("Dime tu D.N.I");
		dni = lector.nextLine();
		System.out.println("Mi nombre es: "+nombre+",y DNI: "+dni);
		
	}

}
