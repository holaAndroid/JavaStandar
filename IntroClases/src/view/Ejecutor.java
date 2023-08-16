package view;

import model.Circulo;
import model.Cuadrado;

public class Ejecutor {

	public static void main(String[] args) {
	 Circulo c1 = new Circulo(5,"azul"); // Creamos el objeto
	 Circulo c2 = new Circulo(10);
	 Circulo c3 = new Circulo();
	 Cuadrado b1 = new Cuadrado(5);
	 Cuadrado b2 = b1;
	 System.out.println(c1.getRadio());
  c1.setRadio(15);
  System.out.println(c1.getRadio());
  System.out.println(c1.getColor());
  c3.mostrar();
  c1.mostrar();
  b1.mostrar();
//  c2.radio=10;
//	 System.out.println(c1.radio);


	}

}
