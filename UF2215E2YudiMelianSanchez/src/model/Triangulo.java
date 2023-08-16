package model;
/*
Clase Triangulo */
public class Triangulo {
	//Atributos
	private double base;
	private double altura;
	//Constructores
	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	//Método
	public double superficie() {
		return base*altura/2;
	}
}
