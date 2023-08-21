package model;

public class Moto {
	private String modelo;
	private int speed;
	private double price;
	private String color;
	
	public Moto(String modelo, int speed, double price, String color) {
		super();
		this.modelo = modelo;
		this.speed = speed;
		this.price = price;
		this.color = color;
	}
	
	public double getSalePrice() {
		return price;
	}
	
	public void print() {
		System.out.println("Modelo: "+modelo);
		System.out.println("Velocidad: "+speed);
		System.out.println("Color: "+color);		
	}
	
	
	
}
