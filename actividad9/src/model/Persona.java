package model;

public class Persona {
	//Atributos
	private String nombre;
	private int edad;
	private String dni;
	private char sexo = 'H';
	private double peso;
	private double altura;
	//Constantes
	/* Sexo por defecto*/
	//private final static char SEX_DEF ='H';
		//peso por debajo del peso ideal.
	public static final int NOT_PESOIDEAL =-1;
	// peso de la persona dentro del peso ideal
	public static final int PESO_IDEAL = 0;
	// peso de la persona por encima del peso ideal
	public static final int SOBRE_PESO =1;
	// Constructor por defecto, todos los atributos menos el DNI
	//serán valores por defecto según su tipo (0 números, 
	//string cadena vacía, sexo por defecto hombre.
	public Persona() {

	}
	// contructor con el nombre, edad, sexo y el resto por defecto.
	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		comprobarSexo(sexo);
		//this.dni = Integer.toString(generaDni())+"A";

	}
	// controctor con todos los atributos
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		//this.dni = Integer.toString(generaDni())+"A";
		generaDni();
		comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}
	//Métodos

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
					comprobarSexo(sexo);
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	// Métodos 
	private void comprobarSexo(char sexo) {
		this.sexo=(sexo=='H' || sexo=='M') ? sexo : 'H';
		}
//	if(sexo!='H'&& sexo!='M') this.sexo='H';
	//	else this.sexo=sexo;
 
	/*private int generaDni() {
			return (int) Math.floor(Math.random())* 40000000+ 10000000)
	}*/
	private void generaDni() {
				final int divisor = 23;
				
				// Generamos el número de 8 digitos
				int numDni = ((int) Math.floor(Math.random()*
						(100000000 - 10000000) + 10000000));
				int res = numDni - (numDni /divisor * divisor);
				
				// Calculamos la letra del DNI
				char letraDni = generaLetraDni(res);
				
				//Pasamos el DNI a String
				dni = Integer.toString(numDni)+ letraDni;
	}
	
	private char generaLetraDni(int res) {
				char letras[] = { 'T','R','W','A','G','M','Y',
						'F','P','D','X','B','N','J','Z','S','Q','V',
						'H','L','C','K','E'};
				return letras[res];
				}

 public int calcularIMC() {
  //Calculamos el peso de la persona
  //double pesoActual = peso / (Math.pow(altura, 2));
 			double imc = peso/(altura*altura);
  //Segun el peso, devuelve un codigo
  /*if (pesoActual >= 20 && pesoActual <= 25) {
      return PESO_IDEAL;
  } else if (pesoActual < 20) {
      return NOT_PESOIDEAL;
  } else {
      return SOBRE_PESO;
  }*/
 				if (imc<20) {
 								return NOT_PESOIDEAL;
 				}else if (imc<=25) {
 								return PESO_IDEAL;
 				}else {
 					return SOBRE_PESO;
 				}
}
 public boolean esMayorDeEdad() {
 	return edad>=18;
 	//boolean mayor = false;
  //if (edad >= 18) {
  //    mayor = true;
  //}
 }
   	
  @Override
  public String toString() {
      String sexo;
      if (this.sexo == 'H') {
          sexo = "hombre";
      } else {
          sexo = "mujer";
      }
      return "Informacion de la persona:\n"
              + "Nombre: " + nombre + "\n"
              + "Sexo: " + sexo + "\n"
              + "Edad: " + edad + " anyos\n"
              + "DNI: " + dni + "\n"
              + "Peso: " + peso + " kg\n"
              + "Altura: " + altura + " metros\n";
  }
 }