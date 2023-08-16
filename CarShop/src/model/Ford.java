package model;

public class Ford extends Car {
//Crear una subclase de Car y llamarla Ford.  
	//La clase Ford tiene los siguientes campos y 
	//métodos
	 		//Atributos
				private int anyo;
	 		private int fabricanteDescuento;
	 		
	 		//Constructor
				public Ford(int velocidad, double precioNormal, String color, int anyo, int fabricanteDescuento) {
					super(velocidad, precioNormal, color);
					this.anyo = anyo;
					this.fabricanteDescuento = fabricanteDescuento;
				}
				@Override
				public double obtenerPrecioDeVenta() {
					//double getSalePrice();  
					// al precio de venta calculado de la 
					//clase Car class, restar fabricanteDescuento. 
							return super.obtenerPrecioDeVenta() 
									- super.obtenerPrecioDeVenta()*fabricanteDescuento/100;	
				};  

}
