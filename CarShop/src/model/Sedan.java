package model;

public class Sedan extends Car {
		// crear una subclase de car llamada Sedan con los
	 // siguientes campos y métodos
	// double obtenerPrecioDeVenta();  

			private int longitud;

		public Sedan(int velocidad, double precioNormal, String color, int longitud) {
			super(velocidad, precioNormal, color);
			this.longitud = longitud;
		}
		// If longitud > 20 pies, 5% discount,
		//en caso contrario, 10% discount.
		@Override
		public double obtenerPrecioDeVenta() {
			return (longitud>20 ? super.obtenerPrecioDeVenta()*0.95 : super.obtenerPrecioDeVenta()*0.90);
		}

		}

