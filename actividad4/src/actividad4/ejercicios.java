package actividad4;

import java.util.Scanner;


public class ejercicios {

	public static void main(String[] args) {
/*	// Muestras los números del 1 al 100(ambos incluidos)
		int i = 1;
		while (i<=100) {
			System.out.println(i);
			i++;
			// int i =0; while(++i<=100) System.out.println(i); 
		}*/
// Muestra los números del 1 al 100 (ambos incluidos) divisibles
		// entre 2 y 3. Utiliza el bucle que desees
	/*	for (int i = 1;i <= 100; i++) {
			if (i % 2 ==0 || i % 3 == 0) {
				System.out.println(i);
			}
		}
		*/
		// lee un número por teclado y comprueba que este número 
		// es mayor o igual que cero, si no lo es lo volverá a pedir
		// (do while), después muestra ese número por consola.
		/*
		int number;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduce un numero: ");
			number = sc.nextInt();
		} while (number < 0);
		System.out.println("El numero introducido es " + number);
	}
}
		//Escribe una aplicación con un String que contenga una contraseña
		// cualquiera. Después se te pedirá que introduzcas la contraseña,
		// con 3 intentos. Cuando aciertes ya no pedirá más la contraseña
		// y mostrará un mensaje diciendo «Enhorabuena».
		//Piensa bien en la condición de salida (3 intentos y 
		//si acierta sale, aunque le queden intentos).
		/*Scanner sc = new Scanner(System.in);
		String password= "1234";
		int intentos = 3;
		boolean acierto = false;
		
		while (intentos > 0) {
			System.out.println("Introduce la passoword: ");
			String passwordUser= sc.nextLine();
			if (password.equals(passwordUser)) {
				System.out.println("Enhorabuena");
				break;
			}else {
			System.out.println("Password incorrecta.Quedan " + --intentos + " intentos.");	
			}
			}
			}
		}
		//2ª OPCIÓN
		 * String password= "1234", cadena;
		int intentos = 3;
		Scanner sc = new Scanner(System.in);
		boolean acierto = false;
		do {
				System.out.println("Introduce la contraseña: ");
				cadena = sc.nextLine();
				if (cadena.equals(password)) acierto = true;
		}while (--intentos > 0 && !acierto);
		if (acierto) System.out.println("Enhorabuena has acertado");
		else System.out.println("Inténtalo en otro momento, has agotado los intentos");
		}
		}
		 */
		//del siguiente string <La lluvia en Sevilla es una maravilla> cuenta 
		//vocales en total
/*	
		String texto= "La lluvia en Sevilla es una maravilla";
		int vocales=0;
				
		for (int i = 0;i < texto.length(); i++) {
			char caracter = texto.charAt(i);
			if(caracter == 'a' || caracter == 'e' || caracter == 'i' || 
				caracter == 'o' || caracter == 'u') vocales++;
			}
		System.out.println("Hay " + vocales + " vocales en la cadena.");
		} 
}
	*/
		int a, b, r;
		char operacion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el primer operando: ");
		a = sc.nextInt();
		System.out.println("Dime el segundo operando: ");
		b = sc.nextInt();
		System.out.println("Dime la operacion(+, -, *, /): ");
		operacion = sc.next().charAt(0);
		switch (operacion) {
				case '+':
					r = a + b;
					System.out.println("El resultado es: " + r);
					break;
				case '-':
					r = a - b;
					System.out.println("El resultado es: " + r);
					break;
				case '*':
					r = a * b;
					System.out.println("El resultado es: " + r);
					break;
				case '/':
					if (b != 0) {
						r = a / b;
						System.out.println("El resultado es: " + r);
					}
					else System.out.println("Error división por 0");
					break;
default: System.out.println("Operación incorrecta.");
		}
	}
}