package actividad4;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// realiza un programa que permita ingresar dos operandos, seleccionar
		// la operación a realizar (suma, resta, multiplicación y división y 
		// presentar el resultado.
		int resultado = 0;
		int operador1, operador2;
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese el pimer operando");
			operador1 =sc.nextInt();
			System.out.println("Ingrese el segundo operando");
			operador2 =sc.nextInt();
			System.out.println("Ingrese el operador(+, -, *, /): ");
			char operador =sc.next().charAt(0);
   switch (operador) {
       case '+':
           resultado = operador1 + operador2;
           break;
       case '-':
           resultado = operador1 - operador2;
           break;
       case '*':
           resultado = operador1 * operador2;
           break;
       case '/':
       	if (operador2 != 0) {
           resultado = operador1 / operador2;
           System.out.println("El resultado es: " + resultado);
   					}else System.out.println("Error división por 0");
           break;
       default:
           System.out.println("Operador inválido.");
    
   }
   System.out.println("El resultado es: " + resultado);
		
	}

}
