package view;

import model.Custom;
import model.Sport;
import model.Vespino;

public class Ejecutor {

	public static void main(String[] args) {
		Custom c1 = new Custom("Harley",120,12000,"Negra",true);
		Sport s1 = new Sport("Honda",220,10000,"Blanca",2020,2000);		
		Sport s2 = new Sport("Kawasaki",320,11000,"Verde",2020,2500);	
		Vespino v1 = new Vespino("Pin",120,6000,"Amarillo",1);	
		
		c1.print();
		s1.print();
		s2.print();
		v1.print();		
	}

}
