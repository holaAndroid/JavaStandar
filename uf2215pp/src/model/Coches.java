package model;

public class Coches {
	// Atributos
			private String matricula;
			private int kilometros;
			// Constructor
			public Coches(String matricula, int kilometros) {
				super();
				this.matricula = matricula;
				this.kilometros = kilometros;
			}
						
			public String getMatricula() {
				return matricula;
			}


			public void setMatricula(String matricula) {
				this.matricula = matricula;
			}


			public int getKilometros() {
				return kilometros;
			}


			public void setKilometros(int kilometros) {
				this.kilometros = kilometros;
			}


			public void circular (int kilometros) {
				this.kilometros += kilometros;
			}
	
}
