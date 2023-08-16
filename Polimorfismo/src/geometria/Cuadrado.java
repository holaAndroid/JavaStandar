package geometria;

public class Cuadrado extends Figura {
		
			private double lado;
			
			public Cuadrado(String color, double lado) {
				super(color);
				this.lado=lado;
			}
			
	public double getLado() {
				return lado;
			}

			public void setLado(double lado) {
				this.lado = lado;
			}

	@Override
	public double superficie() {
		// TODO Auto-generated method stub
		return lado*lado;
	}

}
