package model;
/*
  Clase Cuenta */
public class Cuenta {
	//Atributos
	private String titular;
	private double cantidad;
	//Constructores
	public Cuenta(String titular) {
		super();
		this.titular = titular;
	}
	public Cuenta(String titular, double cantidad) {
		super();

		this.titular = titular;
		this.cantidad = cantidad;
	}

	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public void ingresar(double cantidad) { // método
		//se ingresa una cantidad a la cuenta, si la cantidad es negativa 
	 // no se hará nada
		if(cantidad > 0) {
			this.cantidad += cantidad;
		}
		
	}
	public void retirar(double cantidad) { // método
		// se retira una cantidad a la cuenta,
		// si restando la cantidad actual a la que nos pasan es negativa
		// la cuenta pasa a ser 0
		if(cantidad>this.cantidad) {
			this.cantidad = 0;
		}else {
			this.cantidad-= cantidad;
		}
	}
	@Override
	public String toString() {
				return "El titular " + titular + " tiene " + cantidad + " euros";
			}
		}
	
