package view;

import model.Libro;

public class Ejecutor {

	public static void main(String[] args) {
		Libro fantasia = new Libro ("El coche","Santillana","111",10);
		
		fantasia.mostrar();
		fantasia.incrementar(20);
		fantasia.mostrar();
	}

}
