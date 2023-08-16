package model;

public class Punto {
//Atributos sería las cordenadas
		//protected menos restringida que private. 
		// protected acceso solo a las clases hijas.
			protected int x;
			private int y;
			
			public Punto() {
				super();
				this.x=0;
				this.y=0;
			}

			public Punto(int x, int y) {
				super();
				this.x = x;
				this.y = y;
			}

			public int getX() {
				return x;
			}

			public void setX(int x) {
				this.x = x;
			}

			public int getY() {
				return y;
			}

			public void setY(int y) {
				this.y = y;
			}
			
			// creamos un método
				// si no devuelve nada añadir void
			public void mostrar() {
				System.out.print("Las coordenadas"+ " de mi punto son: "
			+ x + ","+y );
			}
}
