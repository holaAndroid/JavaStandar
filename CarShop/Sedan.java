package model;

public class Sedan extends Car{
	private int length;

	public Sedan(int speed, double regularPrice, 
			String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}
	
	@Override
	public double getSalePrice() {
		return (length>20 ? super.getSalePrice()*0.95
				//5% Descuento
				: super.getSalePrice()*0.90);
				//10% Descuento
	}

}
