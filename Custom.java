package model;

public class Custom extends Moto {
	private boolean cromada;
	
	public Custom(String modelo, int speed, double price, String color
			, boolean cromada) {
		super(modelo,speed,price,color);
		this.cromada=cromada;
	}
	
	@Override
	public double getSalePrice() {
		return cromada ? super.getSalePrice()*1.20 
				: super.getSalePrice();
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Precio: "+getSalePrice());
	}
	
}
