package actividad4;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String password= "1234", cadena;
	int intentos = 3;
	Scanner sc = new Scanner(System.in);
	boolean acierto = false;
	do {
			System.out.println("Introduce la password: ");
			cadena = sc.nextLine();
			if (cadena.equals(password)) acierto = true;
	}while (--intentos > 0 && !acierto);
	if (acierto) System.out.println("Enhorabuena has acertado");
	else System.out.println("Intentalo en otro momento, has agotado los intentos");
	}
}
