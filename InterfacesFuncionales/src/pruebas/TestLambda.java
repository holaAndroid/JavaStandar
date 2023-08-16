package pruebas;
@FunctionalInterface
interface Opera{
				void print();
}
@FunctionalInterface
interface Opera2{
				void print(int n);
}
public class TestLambda {

	public static void main(String[] args) {
				Opera op1 = ()->System.out.println("Hola");
				op1.print();
				Opera op2 = ()->System.out.println("Lunes Martes Miercoles...");
				op2.print();
				Opera op3 = ()->{for(int i=1; i<=10;i++)System.out.println(i);};
				op3.print();	
				Opera2 op4 = a ->System.out.println("Estp es "+a);
	}

}
