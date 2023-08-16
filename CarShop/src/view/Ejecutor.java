package view;

import model.Car;
import model.Ford;
import model.Sedan;

public class Ejecutor {

	public static void main(String[] args) {

		//Crear un objeto de la clase Sedan, ford y card
		//e inicializar todos los campos con valores apropiados.
		//Usar el método super(...) en el constructor 
		//para inicializar los campos de la super clase. 
		Sedan s1 = new Sedan(120, 21500.0,"Blanco",25); // longitud
		Ford f1 = new Ford(100, 21500.0,"Azul",2022,5);
		Ford f2 = new Ford(300, 21500.0,"Negro",2023,15);
	 Car seatPanda = new Car(300, 21500.0,"Rojo");
	 mostrarPrecio(s1);
	 mostrarPrecio(f1);
	 mostrarPrecio(f2);
	 mostrarPrecio(seatPanda);
	 
	 //	Mostrar los precios de venta de todas las instancias.
	 //	System.out.println("El precio de venta de Sedan: "+ s1.obtenerPrecioDeVenta());
	 // System.out.println("El precio de venta de Ford: " + f1.obtenerPrecioDeVenta());
	 //	System.out.println("El precio de venta de Ford2: " + f2.obtenerPrecioDeVenta());
	 //	System.out.println("El precio de venta de Car: " +  seatPanda.obtenerPrecioDeVenta());
	 
	}
		static private void mostrarPrecio(Car c) {
			System.out.println("El precio es: "+c.obtenerPrecioDeVenta());
		}

}
