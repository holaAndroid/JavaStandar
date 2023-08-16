package view;

import model.Cuenta;

public class Ejecutor {

	public static void main(String[] args) {
		
		Cuenta cc1 = new Cuenta("Caixabank");
		Cuenta cc2 = new Cuenta("Jose",300);
		//Ingresamos dinero.
		cc1.ingresar(800);
		cc2.ingresar(1200);
		cc2.setTitular("Sergio");
		cc2.setCantidad(300);
		// Retiramos dinero.
		cc1.retirar(100);
		cc2.retirar(50);
		System.out.println(cc1);
		System.out.println(cc2.getCantidad());
		int x=5;
		int y=5;
		y*=x++;
		System.out.println(x);
	}
}
