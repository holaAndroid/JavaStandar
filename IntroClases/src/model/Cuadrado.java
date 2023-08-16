package model;

public class Cuadrado {
	private int lado; 
	private String color;
	// constructor
	public Cuadrado() {
		lado = 1;
		color = "rojo";
	}
 public Cuadrado(int lado) { 
		this.lado = lado;
		color = "blanco";
}
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void mostrar(){
		System.out.println("El lado del cuadrado es " +lado);
		System.out.println("El color del cuadrado es " +color);
		System.out.println("El perimetro del cuadrado es "+perimetro());
		System.out.println("La superficie del cuadrado es "+superficie());
	}
	public double perimetro() {
		return lado*4;
	}
	public double superficie() {
		return lado*lado;
	}
}
