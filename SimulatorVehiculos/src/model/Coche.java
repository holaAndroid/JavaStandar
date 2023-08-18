package model;

public class Coche extends Vehiculos {
	 //Atributos
				protected int numeroDePuertas;

		public Coche(String matricula, int numPuertas) {
			super(matricula);
			this.numeroDePuertas = numPuertas;
		}
		//Tiene además un método que devuelve el número de puertas.
		public int totalPuertas(){
				return numeroDePuertas;
		}

}
