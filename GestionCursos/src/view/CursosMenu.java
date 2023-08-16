package view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import model.Curso;
import service.CursosService;

public class CursosMenu {
	
	
	static CursosService servicio = new CursosService();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion;
		Scanner sc = new Scanner(System.in);
		do {
					mostrarMenu();
					opcion = sc.nextInt();
					switch (opcion) {
						case 1:altaCurso();
													break;
						case 2:buscaTematica();
													break;
						case 3:calculaPreciomedio();
													break;
						case 4:muestraCursoMayorDuracion();
													break;
						case 5:mostrarCursos();
													break;
						case 6:precioMedioTematica();
						break;
						case 7:bajaCurso();
						break;							
					}
		}while (opcion!=6);
	}

	static void mostrarMenu() {
		System.out.println("********************************");
		System.out.println("*                              *");
		System.out.println("*  1.Alta de Curso             *");
		System.out.println("*  2.Busqueda por tematica     *");
		System.out.println("*  3.Precio medio de los cursos*");
		System.out.println("*  4.Curso de mayor duracion   *");
		System.out.println("*  5.Mostrar todos los cursos  *");
		System.out.println("*  6.Precio medio por tematica  ");
		System.out.println("*  7.Baja de curso             *");
		System.out.println("*  8.Salir de la aplicacion    *");
		System.out.println("*                              *");
		System.out.println("********************************");
		System.out.println("Selecciona una opcion entre (1-6)");
	}
	
	static void altaCurso() {
		String nombre, tematica;
		int duracion;
		double precio;
		System.out.print("Introduce el nombre: ");
		nombre = sc.nextLine();
		System.out.print("Introduce la tematica: ");
		tematica = sc.nextLine();
		System.out.print("Introduce la duracion: ");
		duracion = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce el precio: ");
		precio = Double.parseDouble(sc.nextLine());
		Curso c = new Curso(nombre, tematica, duracion, precio);
		servicio.altaCurso(c);
	}
	
	static void buscaTematica() {
		String tematica;
		List<Curso> cursos = new ArrayList<>();
		System.out.print("Introduce la tematica: ");
		tematica = sc.nextLine();
		cursos = servicio.buscaTematica(tematica);
		if (!cursos.isEmpty()) {
					for (Curso c: cursos) {
						mostrarCurso(c);
					}
	}else {System.out.println("No existen cursos de "+tematica);
		
	}
		System.out.println("Pulsa una tecla para volver al menu");
		sc.nextLine();
	}
	
	static void calculaPreciomedio() {
		System.out.println("El precio medio es: "+servicio.precioMedioCursos());
		System.out.println("Pulsa una tecla para volver al menu");
		sc.nextLine();
	}
	
	static void muestraCursoMayorDuracion() {
		Curso c = new Curso();
		c = servicio.cursoMayorDuracion();
		mostrarCurso(c);
		System.out.println("Pulsa una tecla para volver al menu");
		sc.nextLine();
	}
	
	static void mostrarCursos() {
		List<Curso> cursos = new ArrayList<>();
		cursos = servicio.cursosTodos();
		for (Curso c: cursos) {
						mostrarCurso(c);
		}
		System.out.println("Pulsa una tecla para volver al menu");
		sc.nextLine();
	}

		static void mostrarCurso(Curso c) {
			System.out.println("********************************");
			System.out.println("Cursos: "+c.getNombre());
			System.out.println("Tematica: "+c.getTematica());
			System.out.println("Duracion: "+c.getDuracion());
			System.out.println("Precio: "+c.getPrecio());
		}
		static void precioMedioTematica() {
			double precio;
			String tematica;
			System.out.println("Dime la temática: ");
			tematica=sc.nextLine();
			precio = servicio.precioMedioTematica(tematica);
			if (precio !=0) {
				System.out.println("El precio medio de "+tematica+ "es: " 
						+precio);
			}else{
			System.out.println("No existen cursos de "+tematica);
		}
			System.out.println("Pulsa una tecla para volver al menu");
			sc.nextLine();
		}
		
		static void bajaCurso() {
			String nombre;
			System.out.println("Introduce el nombre: ");
			nombre = sc.nextLine();
			if(servicio.bajaCurso(nombre)) {
				System.out.println("Curso borrado con exito.");
			}else {
				System.out.println("Curso no encontrado.");
			}
			System.out.println("Pulsa una tecla para volver al menu");
			sc.nextLine();
		}
		
}
