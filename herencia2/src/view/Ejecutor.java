package view;

import model.Punto;
import model.Punto3D;

public class Ejecutor {

	public static void main(String[] args) {
					Punto p2 = new Punto();
					Punto p1 = new Punto(10,12);
					p1.mostrar();
					System.out.println();
					p2.mostrar();
					Punto3D p3 = new Punto3D(7);
					System.out.println();
					Punto3D p4 = new Punto3D(1,2,3);
					System.out.println();
					p4.mostrar();
					System.out.println();
					p4.mostrar2(5);
	}

}
