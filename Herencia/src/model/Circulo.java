package model;

public class Circulo extends Figura{
	private double superficie;
	
	public Circulo(String color) {
		super(color);
		
	}
	
	public Circulo(String color, double superficie) {
		super(color);
		this.superficie = superficie;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}


}
