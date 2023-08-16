package model;

public class Car {
	//Crear una superclase llamada Car.  
	//La clase Car tiene los siguientes campos y
	//métodos. 
	// Atributos
	 private int velocidad;
	 protected double precioNormal;
	 private String color;
	 
	 //Constructor
		public Car(int velocidad, double precioNormal, String color) {
			super();
			this.velocidad = velocidad;
			this.precioNormal = precioNormal;
			this.color = color;
		}
		
		public double obtenerPrecioDeVenta() {
							return precioNormal;
		}; 
	 
}
