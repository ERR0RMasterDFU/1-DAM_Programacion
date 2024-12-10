package ejemploPasoParametros;

public class Principal {
public static void main(String[] args) {
// TODO Auto-generated method stub
	int x = 1;
	int y = 2;
	
	System.out.print("Valores de x e y antes de la modificación: ");
	System.out.println(" x = " + x + "; y = " + y);
	
	
	
	modifyPrimitiveTypes(x, y);
	
	System.out.print("Valores de x e y después de la modificación: ");
	System.out.println(" x = " + x + "; y = " + y); //Después de la modificación os valores antiguos son sustituidos.
}

	private static void modifyPrimitiveTypes(int x, int y) { //Los métodos static solo pueden llamar a otros static.
	x = 5;
	y = 10;
	}
}

