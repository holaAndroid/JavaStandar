package model;

//Esto es un JavaBean
// sobrecarga cuando hay más de un constructor
public class Curso {
			private String nombre;
			private String tematica;
			private int duracion;
			private double precio;
			//constructor sin atributos
			public Curso() {
			}
			//Constructor con atributos
			public Curso(String nombre, String tematica, int duracion, double precio) {
				super(); // Llama al constructor de Object
				this.nombre = nombre;
				this.tematica = tematica;
				this.duracion = duracion;
				this.precio = precio;
			}
			public String getNombre() {
				return nombre;
			}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public String getTematica() {
				return tematica;
			}
			public void setTematica(String tematica) {
				this.tematica = tematica;
			}
			public int getDuracion() {
				return duracion;
			}
			public void setDuracion(int duracion) {
				this.duracion = duracion;
			}
			public double getPrecio() {
				return precio;
			}
			public void setPrecio(double precio) {
				this.precio = precio;
			}
			
}
