package view;

import model.Car;
import model.Ford;
import model.Sedan;
import model.Truck;

public class Ejecutor {

	public static void main(String[] args) {
		Sedan sedan = new Sedan(120,6000.0,"Blanco",25);
		Ford ford1 = new Ford(120,6000.0,"Verde",2000,50);		
		Ford ford2 = new Ford(120,6000.0,"Azul",2000,15);
		Car seatPanda = new Car(120,6000.0,"Rojo");
		mostrarPrecio(sedan);
		mostrarPrecio(ford1);
		mostrarPrecio(ford2);
		mostrarPrecio(seatPanda);	
		mostrarPrecio(new Truck(120,6000.0,"Rojo",2000));

	}
	
	static private void mostrarPrecio(Car c) {
		System.out.println("El precio es :"+c.getSalePrice());
	}

}
