package service;

import java.util.ArrayList;
import java.util.List;

import model.Curso;

public class CursosService {
			static List<Curso> cursos = new ArrayList<>();
			
			public void altaCurso(Curso c) {
							cursos.add(c);
				
			}
			public List<Curso> buscaTematica(String tematica){
						 List<Curso> cursosTematica = new ArrayList<>();
						 for (Curso c: cursos) {
						 					if (c.getTematica().equals(tematica)) {
						 									cursosTematica.add(c);
						 					}
						 }
							return cursosTematica;
			}
			
			public double precioMedioCursos(){
			 double precioMedio = 0.0;
			 double suma = 0.0;
			 for (Curso c: cursos) {
			 				suma+=c.getPrecio();
			 }
			 precioMedio = suma / cursos.size();
				return precioMedio;
			}
			
			public Curso cursoMayorDuracion(){
			 Curso cm = new Curso();
			 int maxDuracion = 0; 
			 for (Curso c: cursos) {
			 	if(c.getDuracion()>maxDuracion) {
			 		cm = c;
			 		maxDuracion = c.getDuracion();
			 	}
 }
				return cm;
			}
			public List<Curso> cursosTodos(){
				return cursos;
			}
			
			public Curso buscaNombre(String nombre){
			 for (Curso c: cursos) {
			 					if (c.getNombre().equals(nombre)) {
			 						return c;
			 					}
			 }
				return null;
			}
			
			public double precioMedioTematica(String tematica){
				List<Curso> cursosTematica = buscaTematica(tematica);
			 double precioMedio = 0.0;
			 double suma = 0.0;
			 if (!cursosTematica.isEmpty()) {
			 			for (Curso c: cursosTematica) {
			 				suma+=c.getPrecio();
			 				
			 			}
			 			precioMedio = suma / cursosTematica.size();
			 }else precioMedio =0;
				return precioMedio;
		}
			public boolean bajaCurso(String nombre) {
					Curso c = buscaNombre(nombre);
							if (c != null) {
								cursos.remove(c);
								return true;
							}
							return false;
			}
}
