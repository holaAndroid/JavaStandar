package model;

import java.time.LocalDate;

public class Movimiento {
	// Atributos
	 		private String tipo;
	 		private double cantidad;
	 		private LocalDate fecha;

	// Constructor con los tres atributos
				public Movimiento(String tipo, double cantidad, LocalDate fecha) {
					super();
					this.tipo = tipo;
					this.cantidad = cantidad;
					this.fecha = fecha;
				}

				public String getTipo() {
					return tipo;
				}

				public void setTipo(String tipo) {
					this.tipo = tipo;
				}

				public double getCantidad() {
					return cantidad;
				}

				public void setCantidad(double cantidad) {
					this.cantidad = cantidad;
				}

				public LocalDate getFecha() {
					return fecha;
				}

				public void setFecha(LocalDate fecha) {
					this.fecha = fecha;
				}
				
}
