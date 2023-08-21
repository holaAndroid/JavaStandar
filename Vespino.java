package model;

public class Vespino extends Moto {
	private int plazas;
	
	public Vespino(String modelo, int speed, double price, 
			String color,int plazas) {
		super(modelo,speed,price,color);
		this.plazas = plazas;
	}
	
	@Override
	public double getSalePrice() {
		return plazas == 2 ? super.getSalePrice()*0.95 
				: super.getSalePrice()*0.9;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Precio: "+getSalePrice());
	}

}
