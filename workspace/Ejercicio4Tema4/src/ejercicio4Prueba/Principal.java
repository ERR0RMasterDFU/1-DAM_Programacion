package ejercicio4Prueba;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto p1 = new Alimentacion ("Melocotón", 1, 2.30, 45, false);
		Producto p2 = new Electronica ("Cable", 2, 5.50, 30);
		
		LineaDeVenta lv1 = new LineaDeVenta(p1,4);
		LineaDeVenta lv2 = new LineaDeVenta(p2,3);
	}

}
