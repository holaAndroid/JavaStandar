package model;

public class Sport extends Moto {
	private int year;
	private int cilindrada;
	
	public Sport(String modelo, int speed, double price, 
			String color, int year, int cilindrada) {
		super(modelo,speed,price,color);
		this.year = year;
		this.cilindrada = cilindrada;
	}
	
	@Override
	public double getSalePrice() {
		return cilindrada > 2000 ? super.getSalePrice()*1.05 
				: super.getSalePrice()*0.95;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Precio: "+getSalePrice());
	}

}
