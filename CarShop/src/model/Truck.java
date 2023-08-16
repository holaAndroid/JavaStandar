package model;

public class Truck extends Car {
	//Crear una subclase de Car y llamarla Truck.
	//La clase Truck tiene los siguientes campos y métodos.
 			private int peso;

				public Truck(int velocidad, double precioNormal, String color, int peso) {
					super(velocidad, precioNormal, color);
					this.peso = peso;
				}
				//double obtenerPrecioDeVenta();  
				// If weight > 2000, 10% discount.
				//Otherwise, 20% discount.
				@Override				
 			public double obtenerPrecioDeVenta() {
			 					return (peso>2000 ? super.obtenerPrecioDeVenta()*0.90 : super.obtenerPrecioDeVenta()*0.80);
			 				}
}
