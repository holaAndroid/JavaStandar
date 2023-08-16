package model;

public class Libro {
//Esto es un Java bean
private String titulo; 
private String editorial;
private String isbn;
private double precio;

public Libro(String titulo) { // constructor se llaman igual que la clase
	this.titulo = titulo;

}

public Libro(String titulo, String editorial, String isbn, double precio) { // Este es un constructor//se llaman igual que la clase
	this.titulo = titulo;
	this.editorial = editorial;
	this.isbn = isbn;
	this.precio = precio;

}

public void mostrar(){
	System.out.println("El titulo es " +titulo);
	System.out.println("La editorial " +editorial);
	System.out.println("ISBN " +isbn);
	System.out.println("Precio " +precio);
}

public double incrementar(double cantidad){
return precio = precio+precio*cantidad/100;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getEditorial() {
	return editorial;
}

public void setEditorial(String editorial) {
	this.editorial = editorial;
}

public String getIsbn() {
	return isbn;
}

public void setIsbn(String isbn) {
	this.isbn = isbn;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

}

