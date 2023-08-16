package geometria;

public abstract class Figura {
							private String color;
							
							public Figura(String color) {
									this.color = color;
							}
							
							public Figura() {
								this.color="blanco";
							}

							public String getColor() {
								return color;
							}

							public void setColor(String color) {
								this.color = color;
							}
							
							public abstract double superficie(); 
							// si no pongo llave no esta implementado
							// los métodos abstractos no pueden tener llave.
							// los abstractos no pueden tener implementación(ni vacia)
							// Las clases abstractas no se pueden instanciar.
}
