package model;

public class Punto3D extends Punto {
				private int z;

				public Punto3D(int z) {
					super();
					this.z = z;
				}
				
				public Punto3D(int x, int y, int z) {
					super(x,y);
					this.z = z;
				}

				public int getZ() {
					return z;
				}

				public void setZ(int z) {
					this.z = z;
				}
				@Override
				public void mostrar() {
					super.mostrar();
					System.out.println("," +z );
				}
				
				public void mostrar2(int i) {
					for (int j=0;j<i;j++)
					super.mostrar();
					System.out.println("," +z );
				}

}
