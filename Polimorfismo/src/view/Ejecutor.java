package view;

import geometria.Circulo;
import geometria.Cuadrado;
import geometria.Figura;
import geometria.Triangulo;

public class Ejecutor {

	public static void main(String[] args) {
				Figura c = new Circulo("blanco",2.0);
				Figura t = new Triangulo("verde",2.0,5.0);
				Figura c1 = new Cuadrado("rojo",2.0);
				Object o1 = new Cuadrado("rojo",2.0);
				Object o2 = new String("Hola Paco");
				mostrar(c);
				mostrar(t);
				mostrar(c1);
				muestra(o1);
				muestra(o2);
				

	}
	  static void muestra(Object o) {
	  	System.out.println("Soy un/a:"+o.getClass().getSimpleName());

		}
		static void mostrar(Figura f) {
			System.out.println("El color de:"+f.getClass().getSimpleName()+" "+f.getColor());
			System.out.println("La superficie es: "+f.superficie());
		}

		
}
