package intro;

import java.util.Scanner;

public class Saludo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner objeto
											/* para leer cosas
											 del teclado.*/
		int a = 5;
		String cadena = "hola";
		// syso ctrl + espacio
		System.out.println("Dime tu edad:");
		a=sc.nextInt();
		System.out.println("Tienes : "+a+" años");
		cadena=sc.next();
		System.out.println("Te llamas: "+cadena);
		/*
		  Variables primitivas(primera letra minus: 
		  int(entero), float(coma flotante)
		  char c = 'a', boolean fumador = true
		  double
		  De referencia:String cadena= "Hola"
		  añadir espacios: " "
		 */

	}

}
