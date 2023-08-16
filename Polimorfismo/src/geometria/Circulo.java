package geometria;

public class Circulo extends Figura {
		//Atributo
			private double radio;
			//Constructor
			public Circulo(String color, double radio) {
				super(color);
				this.radio=radio;
			}
	

	@Override
	public double superficie() {
		return Math.PI*radio*radio;
	}


	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}

}
