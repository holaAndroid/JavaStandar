package service;

public class CuentaBanco {
	// atributo
		private double saldo;

		// Constructores
		
		public CuentaBanco() {
			super();
			this.saldo = 0;
		}

		public CuentaBanco(double saldo) {
			super();
			this.saldo = saldo;
		}
		
		// metodos
		
		public double consultarSaldo() {
				return saldo;
		}
		
		public void ingresar(double cantidad) {
			saldo +=cantidad;
		}
		
		public void extraer(double cantidad) {
			saldo -=cantidad;
		}
}
