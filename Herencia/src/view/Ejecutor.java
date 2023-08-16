package view;

import model.Circulo;
import model.Figura;

public class Ejecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura f1 = new Figura("morado");
		f1.mostrarColor();
		Figura f2 = f1;
		f2.setColor("azul");
		
		Circulo c1 = new Circulo ("verde");
		c1.mostrarColor();
		f2.mostrarColor();
		Circulo c2 = new Circulo ("amarillo",10.0);
		c2.mostrarColor();
	}

}
