package actividad5;

import java.util.Scanner;
public class ejercicios {

	public static void main(String[] args) {
	/*	// Leer un número e indicar si es positivo o negativo.
		//El proceso se repetirá hasta que se introduzca un 0.
		Scanner sc = new Scanner(System.in);
	 System.out.println("Introduzca un numero: ");
  int number = sc.nextInt();
  		while (number != 0) {
  					if (number > 0) {
  						System.out.println("El numero es positivo.");
  					}else if (number < 0) {
       System.out.println("El numero es negativo.");
  					}else {
       System.out.println("El numero es cero.");
  					}

   System.out.println("Introduzca un numero: ");
   number = sc.nextInt();
   
  	 }
  		System.out.println("El programa ha terminado.");*/
		
		//Leer números hasta que se introduzca un 0. 
		//Para cada número indicar si es par o impar.

/*		Scanner sc = new Scanner(System.in);
	 System.out.println("Introduzca un numero: ");
  int number = sc.nextInt();
  		while (number != 0) {
  					if (number % 2 == 0) {
  						System.out.println("El numero es par.");
  					}else {
       System.out.println("No es par");
  					}

   System.out.println("Introduzca un numero: "); //evitamos así el bucle infinito
   number = sc.nextInt(); 
   
  	 }*/
	//	2ª opción:
	/*		Scanner sc = new Scanner(System.in);
		 int num=0;
		 do {
		 	System.out.println("Introduzca un numero");
		 	num=sc.nextInt();
		 	if (num%2==0) {System.out.println("Es par");
		 	}else {System.out.println("Es impar");}
		 }while(num!=0);/*
		//Pedir números hasta que se teclee uno negativo, 
		//y mostrar cuántos números se han introducido.
/*		Scanner sc = new Scanner(System.in);
		int i = 0;
		int n = 0;
		System.out.println("Introduzca un numero positivo o negativo: ");
		n = sc.nextInt();
		while(n>0) {
			i++;
			System.out.println("Dame un numero");
			n = sc.nextInt();
		}
		System.out.printf("Total %d numeros positivos introducidos",i);*/
		//Realizar un juego para adivinar un número. 
		//Para ello generar un número N de forma aleatoria, 
		//y luego ir pidiendo números indicando “mayor” o “menor” 
		//según sea mayor o menor con respecto a N.
		//El proceso termina cuando el usuario acierta. 
		Scanner sc = new Scanner(System.in); //crea un objeto Scaner para leer entrada de user
		// Genera un numero aleatorio entre uno y cien
		int number = (int) Math.floor(Math.random()*10) + 1;
		int adivina; // numero introducido por usuario
		// Solicita a user que adivine el número
		System.out.println("Adivina un numero entre 1 y 10");
		adivina = sc.nextInt();
		while (adivina != number) {
			adivina = sc.nextInt();
			if (adivina == number) {
				System.out.println("el numero es correcto");
			}else if (adivina > number) {
				System.out.println("el numero introducido es mayor");
			}else {
				System.out.println("el numero introducido es menor");
			}
			
			// Pide al usuario que vuelva a adivinar
			System.out.println("Adivina un numero entre uno y diez");
			adivina = sc.nextInt();
		}
		// El usuario ha acertado
		System.out.println("Adivinaste el numero correcto!.El numero correcto es " +number);
	}
}

