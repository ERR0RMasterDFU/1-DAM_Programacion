package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int largPO=50, anchPO=21;
		int radPC=12;
		double profPO=2.50, profPC=1.80;
		double volumPO=0, volumPC=0;
		double precio=1.80, precioPO=0, precioPC=0;
		
		System.out.println("¡Bienvenido al ejercicio 2 de la Unidad 1!");
		
		System.out.println();
		
		volumPO=largPO*anchPO*profPO;
		
		System.out.println("El volumen de la piscina olímpica es de "+Math.round(volumPO)+" metros cúbicos.");
		
		precioPO=precio*volumPO;
		
		System.out.println("El precio que costará llenar la piscina olímpica será de "+Math.round(precioPO)+"€.");
		
		System.out.println();
		
		volumPC=Math.PI*radPC*profPC;
		
		System.out.println("El volumen de la piscina olímpica es de "+(volumPC)+" metros cúbicos.");
		
		precioPC=precio*volumPC;
		
		System.out.println("El precio que costará llenar la piscina circular será de "+(precioPC)+"€.");
		

	}

}
