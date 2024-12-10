package ejercicio12;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*12. Imprime por pantalla un ticket de una tienda. El empleado se llama “John Snow” y el cliente ha 
		comprado 4 latas de Coca Cola a 1.20 €, una bolsa de pipas de 0.40 € y una espada llamada “Garra” 
		que cuesta 150 €. No hace falta calcular le devolución de la compra, pero puedes hacerlo si inicializas 
		una variable con el dinero entregado por el cliente*/
		
		double Cola=1.20, Bpip=0.40, Garra=150, PcolaT=0, TCob=0, dinC=160, Camb=0;
		String empleado= "John Snow", prod1= "Coca Cola", prod2= "Bolsa pipas", prod3= "Espada (Garra)", 
				hora="12:42", fecha="29/09/2023";
		
		System.out.println("------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que imprime el ticket de una tienda!");
		System.out.println("------------------------------------------------------------\n");
		
		PcolaT=4*Cola;
		TCob=PcolaT+Bpip+Garra;
		Camb=dinC-TCob;
		
		System.out.println("                               LA HERRERÍA DE SONNENSCHEIN");
		System.out.println("					Calle Tale");
		System.out.println("			  		  Angara");
		System.out.println("			   TEL: 666 555 444   NIF: 466735487");
		System.out.println("		      "+fecha+"   "+hora+"   Atendido por: "+empleado+".\n");
		System.out.println("                      ARTÍCULO         UNIDADES    PRECIO    TOTAL");
		System.out.println("                      "+prod1+"          4.00      "+Cola+"         "+PcolaT+" €");
		System.out.println("                      "+prod2+"        1.00      "+Bpip+"         "+Bpip+" €");
		System.out.println("                      "+prod3+"     1.00      "+Garra+"     "+Garra+" €");
		System.out.println("                  -----------------------------------------------------");
		System.out.println("                      TOTAL A COBRAR:                        "+TCob+" €\n");
		System.out.println("                      Efectivo:                              "+dinC+" €");
		System.out.printf("                      CAMBIO:                                  %.1f €\n", Camb);
		
		System.out.println("\n                     Gracias por comprar en nuestra tienda. (^ v ^) ");
			
		
	}

}
