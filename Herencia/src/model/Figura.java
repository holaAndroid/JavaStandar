package model;

public class Figura {
	// Esto es un JavaBean
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Figura(String color) { // constructor se llama como la clase
		this.color = color;
	}

	public void mostrarColor() { // método
		System.out.println("Mi color es: "+color);
	}

}
