package model;

public class Camion extends Vehiculos {
	//atributo de tipo Remolque 
	    private Remolque remolque;
	    
	    //constructor 
	    public Camion(String matricula) {
						super(matricula);
						remolque = null;
					}


					public void ponRemolque(Remolque rem) {
						   this.remolque = rem;
					}
					
					public void quitaRemolque() {
						  remolque = null;
					}
					
					@Override
					public void acelerar(double cantidad) {
						super.acelerar(cantidad);
						if (remolque != null && velocidad + cantidad > 100) {
							velocidad = 100;
						}
						
					}
					@Override
					public String toString() {
						  if(remolque != null) {
						  	return super.toString() + ".LLeva un remolque: " + remolque.toString();
						  } else {
						  	return super.toString();
						  }
					}
}
