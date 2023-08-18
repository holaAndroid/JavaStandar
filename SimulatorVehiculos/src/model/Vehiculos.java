package model;

public class Vehiculos {
			protected String matricula;
			protected double velocidad;
			//Constructor
			public Vehiculos(String matricula) { //La matricula se recibe como parámetro
				super();
				this.matricula = matricula;
				this.velocidad = 0;
				//El método toString() de los veh. devuelve inform. acerca de la
				//matrícula y la velocidad. Además se puede acelerar, pasando como
				//paramétro la cantidad en km/h que se tiene que acelerar.
			}
			
			public String getMatricula() {
				return matricula;
			}

			public void setMatricula(String matricula) {
				this.matricula = matricula;
			}

			public double getVelocidad() {
				return velocidad;
			}

			public void setVelocidad(double velocidad) {
				this.velocidad = velocidad;
			}

			
			public void acelerar(double cantidad) {
				  velocidad += cantidad;
			}
			
			public String toString() {
    return "El vehiculo con matrícula " + matricula + " va a velocidad de " + velocidad + "km/h";   
}
}

