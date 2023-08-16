package contarvocales;

public class vocalesTotales {

	public static void main(String[] args) {
		String frase = "La lluvia en Sevilla es una maravilla";
		int longitud = frase.length(), i, contador =0;
		for (i=0;i<longitud;i++) {
			if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' ||
						frase.charAt(i) == 'i' || frase.charAt(i) == 'o' 
								|| frase.charAt(i) == 'u') contador++;
			//charAt(i) me devuelve el caracter de la posición i,
			// empieza a contar desde 0
		}
		System.out.println("Hay " + contador + " vocales");

	}

}
