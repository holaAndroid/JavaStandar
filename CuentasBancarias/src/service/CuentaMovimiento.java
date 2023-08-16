package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Movimiento;

public class CuentaMovimiento extends CuentaLimitada {
				private List<Movimiento> movimientos = new ArrayList<>();

				public CuentaMovimiento(double saldo, double limite) {
								super(saldo,limite);
				}
				
				public List<Movimiento> recuperarMovimientos() {
								return movimientos;
				}
				
				@Override
				public void ingresar(double cantidad) {
								movimientos.add(new Movimiento("Ingreso"
										,cantidad,LocalDate.now()));
								super.ingresar(cantidad);
				}
				@Override
				public void extraer(double cantidad) {
								if (cantidad>super.limite) {
									movimientos.add(new Movimiento("Extraccion"
											,super.limite,LocalDate.now()));
								}else {
											movimientos.add(new Movimiento("Extraccion"
															,cantidad,LocalDate.now()));
								}
									super.extraer(cantidad);
							}
				}
