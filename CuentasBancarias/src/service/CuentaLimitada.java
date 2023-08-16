package service;

public class CuentaLimitada extends CuentaBanco {
			protected double limite;

			public CuentaLimitada(double limite) {
				super();
				this.limite = limite;
			}

			public CuentaLimitada(double saldo, double limite) {
				super(saldo);
				this.limite = limite;
			}
			
			//metodos
			@Override
			public void extraer(double cantidad) {
				if (cantidad<=limite) {
					   super.extraer(cantidad);
				}else {
								super.extraer(limite);
				}
			}
			
			
}
