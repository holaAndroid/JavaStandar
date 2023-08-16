package model;

public class Circulo {
	// Esto es un Java bean
	private int radio;
	private String color;
 int diametro; // packat o por defecto.
 protected boolean visible;
 
 public Circulo() {
 	// Este es un constructor.
 	radio = 1;
 	color = "blanco";
 }
 
 public Circulo(int radio) { // Este es un constructor//se llaman igual que la clase
 		this.radio = radio;
 		color = "blanco";
 }
 
 public Circulo(int radio, String color) {
 	// Este es un constructor.
 	this.radio = radio;
 	this.color = color;
 }
	public void mostrar(){
		System.out.println("El radio del circulo es " +radio);
		System.out.println("El color del circulo es " +color);
		System.out.println("El perimetro del circulo es "+perimetro());
		System.out.println("El perimetro del circulo es "+superficie());
	}
	
	public double perimetro() {
		return 2*Math.PI*radio;
	}
	public double superficie() {
		return Math.PI*radio*radio;
	}
	

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	}
	

