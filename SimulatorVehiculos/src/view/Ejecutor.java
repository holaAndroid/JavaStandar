package view;

import model.Vehiculos;
import model.Coche;
import model.Camion;
import model.Remolque;

public class Ejecutor {

	public static void main(String[] args) {
		Vehiculos coche1 = new Coche("ABC123", 5);
		System.out.println(coche1); 
		coche1.acelerar(10);
		System.out.println(coche1); 

		Camion camion1 = new Camion("DEF456");
		System.out.println(camion1); // Imprime "Matrícula: DEF456, Velocidad: 0"
		camion1.ponRemolque(new Remolque(1000));
		camion1.acelerar(10);
		System.out.println(camion1); // Imprime "Matrícula: DEF456, Velocidad: 10, Peso del remolque: 1000

	}

}
