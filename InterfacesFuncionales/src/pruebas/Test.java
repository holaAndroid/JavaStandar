package pruebas;

@FunctionalInterface
interface Oper{
	void print();
}
// una implementación que genere mensaje de saludo.
class Imp1 implements Oper{
		public void print() {
		System.out.println("Hola");
	}
}
class Imp2 implements Oper{
	  public void print() {
	  	System.out.println("Lunes Martes Miercoles...");
	  }
}
public class Test {

	public static void main(String[] args) {
				Oper op1 = new Imp1();
				Oper op2 = new Imp2();
				op1.print();
				op2.print();
	}

}
