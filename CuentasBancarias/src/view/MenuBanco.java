package view;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Movimiento;
import service.CuentaMovimiento;

public class MenuBanco {
	
				static CuentaMovimiento cuenta;

	public static void main(String[] args) {
			double cantidad,limite;
			//Solicitar Saldo inicial y límite
			Scanner sc=new Scanner(System.in);
			System.out.println("Introduce la cantidad a ingresar: ");
			cantidad=Double.parseDouble(sc.nextLine());
			System.out.println("Introduce el limite a extraer: ");
			limite=Double.parseDouble(sc.nextLine());
			cuenta=new CuentaMovimiento(cantidad,limite);
			int opcion;
			do {
				   mostrarMenu();
				   opcion=sc.nextInt();
				   switch (opcion) {
								case 1:ingresar();
															break;
								case 2:extraer();
															break;
								case 3:MostrarSaldoMovimientos();
															break;
								case 4:MovimientoDosCantidades();
															break;
								case 5:verTipo("Ingreso");
															break;
								case 6:verTipo("Extraccion");
															break;
							}
			} while (opcion!=7);

	}
	
	private static void mostrarMenu() {
		System.out.println("****************************");
		System.out.println("*    1.Ingresar     ********");
		System.out.println("*    2.Extraer      ********");
		System.out.println("*    3.Ver Saldo    ********");
		System.out.println("*    4.Ver mov entre 2cant ***");
		System.out.println("*    5.Ver mov ingresos   ****");
		System.out.println("*    6.Ver nmov extraccion   *");
		System.out.println("*    7.Salir        *");
		System.out.println("*********************");
	}
	
			private static void ingresar() {
							Scanner sc = new Scanner(System.in);
							double cantidad;
							System.out.println("Introduce la cantidad a ingresar: ");
							cantidad=Double.parseDouble(sc.nextLine());
							cuenta.ingresar(cantidad);
							System.out.println("Mi nuevo saldo es: "+cuenta.consultarSaldo());
							sc.nextLine();
			}
	
			private static void extraer() {
						Scanner sc = new Scanner(System.in);
						double cantidad;
						System.out.println("Introduce la cantidad a extraer: ");
						cantidad=Double.parseDouble(sc.nextLine());
						cuenta.extraer(cantidad);
						System.out.println("Mi nuevo saldo es: "+cuenta.consultarSaldo());
						sc.nextLine();
						
					}
	
    private static void MostrarSaldoMovimientos() {
											Scanner sc = new Scanner(System.in);
											List<Movimiento> movimientos = new ArrayList<>();
											//Crea una lista de movimientos vacía
											// para recoger los movimientos del método
											movimientos = cuenta.recuperarMovimientos();
											if(!movimientos.isEmpty()) {
												//Compruebo que la lista no está vacía isEmpty
													for(Movimiento m:movimientos) { //Declaro objeto m 
														//de tipo movimiento para recorrer la lista movimientos
														System.out.println(m.getTipo()+" \t  "+m.getCantidad()+" \t  " +m.getFecha());
													}
											}else {
												System.out.println("No existen movimientos en la cuenta");
											}
											System.out.println("Mi Saldo es: "+cuenta.consultarSaldo());
											sc.nextLine();
					}
	   private static void MovimientoDosCantidades() {
	   	Scanner sc = new Scanner(System.in);
	  		double max,min;
	  		System.out.println("Dime el limite inferior:");
	  		min=Double.parseDouble(sc.nextLine());
	  		System.out.println("Dime el limite superior:");
	  		max=Double.parseDouble(sc.nextLine());		
	  		List<Movimiento> movimientos = new ArrayList<>();
	  		movimientos = cuenta.recuperarMovimientos();
	  		if (!movimientos.isEmpty()) {
	  			for(Movimiento m:movimientos) {
	  				if (m.getCantidad()>=min && m.getCantidad()<=max) {
	  					System.out.println(m.getTipo()+" \t "
	  					+m.getCantidad()+" \t "+m.getFecha());
	  				}
	  			}	
	  		}else {
	  			System.out.println("No existen movimientos en la cuenta");
	  		}
	  		System.out.println("Mi saldo es: "+cuenta.consultarSaldo());
	  		sc.nextLine();			
	  	}			
	   	

	  	private static void verTipo(String tipo) {
	  		Scanner sc = new Scanner(System.in);
	  		List<Movimiento> movimientos = new ArrayList<>();
	  		movimientos = cuenta.recuperarMovimientos();
	  		if (!movimientos.isEmpty()) {
	  			for(Movimiento m:movimientos) {
	  				if (m.getTipo().equals(tipo)) {
	  					System.out.println(m.getTipo()+" \t "
	  					+m.getCantidad()+" \t "+m.getFecha());
	  				}
	  			}	
	  		}else {
	  			System.out.println("No existen movimientos en la cuenta");
	  		}
	  		System.out.println("Mi saldo es: "+cuenta.consultarSaldo());
	  		sc.nextLine();			
	  	}

}
