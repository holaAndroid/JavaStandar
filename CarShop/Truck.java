package model;

public class Truck extends Car {
	private int weight;
	
	public Truck(int speed, double regularPrice, 
			String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}
	
	@Override
	public double getSalePrice() {
		return (weight>2000 ? super.getSalePrice()*0.90 
				//10% Descuento
				: super.getSalePrice()*0.80);
				//20% Descuento
	}

}
