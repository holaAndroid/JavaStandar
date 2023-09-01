package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Contacto {
	private int id;
	private String nombre;
	private String email;
	private int edad;

}
