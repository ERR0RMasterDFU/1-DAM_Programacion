package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*6. Implementar un programa para un banco, donde se gestione la parte de cuentas de los usuarios. Este 
		banco solo y exclusivamente tiene 3 tipos de cuentas, cuenta corriente, cuenta joven y cuenta empresa. 
		Cada una de ellas se caracteriza por: 
		
		• La cuenta corriente paga mantenimiento fijo y acumula puntos cuando se usa en el cajero.
		• La cuenta joven no tiene mantenimiento y además, se le regala 1€ cada vez que hace un ingreso.
		• La cuenta de empresa, no tiene cuota de mantenimiento, pero el banco cobra un euro a la empresa 
		cuando saca dinero ya que está pensada para hacer transferencias y no usar dinero en efectivo.
		
		El cliente tendrá un saldo, podrá sacar o meter dinero (reintegro e ingreso) por el cajero y dependiendo 
		del tipo de cuenta se le hará un determinado cálculo y se le actualizará el saldo.
		Hacer una clase oficina con un array de cuentas y probar los métodos anteriores, calcular el total de 
		dinero que tiene la oficina entre todas las cuentas, cuánto se ha ganado la oficina por las veces que las 
		cuentas de empresa han sacado dinero, cuánto ha gastado la oficina del banco en regalar el euro cuando 
		se ingresa dinero en una cuenta joven, etc.
		
		Ampliación: Quien lo desee, puede plantearse alguna clase más, como la clase cliente que puede tener 
		varias cuentas o que en la clase Oficina también haya un atributo que sea la lista de Clientes.*/
		
		
		Scanner sc = new Scanner(System.in);
		
		String aux;
		int opcion, opcion2, opcion3, opcion4, tam=3;
		double dinero=0, saldoCorriente=0, saldoJoven=0, saldoEmpresa=0;
		
		Cuenta [] lista = new Cuenta [tam];
		
		Cuenta cc;
		Cuenta cj;
		Cuenta ce;
		Oficina o = new Oficina (lista);
				
		
		
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("¡BIENVENIDO AL EJERCICIO 6!");
		System.out.println("---------------------------------------------------------------------------------");
		
		
		System.out.println("Por favor, introduzca la cantidad de dinero que tiene en el saldo de su cuenta corriente.");
		aux=sc.nextLine();
		saldoCorriente=Double.parseDouble(aux);
		
		cc = new CuentaCorriente (30, 1, saldoCorriente);
		
		System.out.println("Por favor, introduzca la cantidad de dinero que tiene en el saldo de su cuenta joven.");
		aux=sc.nextLine();
		saldoJoven=Double.parseDouble(aux);
		
		cj = new CuentaJoven (1, saldoJoven);
		
		System.out.println("Por favor, introduzca la cantidad de dinero que tiene en el saldo de su cuenta de empresa.");
		aux=sc.nextLine();
		saldoEmpresa=Double.parseDouble(aux);
		
		ce = new CuentaEmpresa (1, saldoEmpresa);
		
		lista[0] = cc;
		lista[1] = cj;
		lista[2] = ce;
		
		do {
			System.out.println("Por favor, elija la cuenta con la que desea operar o alguna opción extra.");
			
			System.out.println("---------------------------------------------------------");
			System.out.println("1. CUENTA CORRIENTE.");
			System.out.println("2. CUENTA JOVEN.");
			System.out.println("3. CUENTA DE EMPRESA.");
			System.out.println("4. MOSTRAR LISTA DE CUENTAS");
			System.out.println("5. SUMAR SALDO DE TODAS LAS CUENTAS.");
			System.out.println("0. SALIR.");
			System.out.println("---------------------------------------------------------");
			aux= sc.nextLine();
			opcion = Integer.parseInt(aux);
			
			
			switch(opcion) {
			
				case 1:
					
					do {
						System.out.println("------------------------------------------------------");
						System.out.println("1. INGRESAR DINERO.");
						System.out.println("2. SACAR DINERO.");
						System.out.println("3. PAGAR MANTENIMIENTO FIJO (30€).");
						System.out.println("0. VOLVER.");
						System.out.println("------------------------------------------------------");
						aux = sc.nextLine();
						opcion2 = Integer.parseInt(aux);
					
						switch(opcion2) {
						
							case 1:
								System.out.println("Por favor, introduzca la cantidad de dinero que desea ingresar.");
								aux=sc.nextLine();
								dinero=Double.parseDouble(aux);
								
								cc.ingresarDinero(dinero);
								((CuentaCorriente)cc).sumarPuntos();
								
								System.out.println("Operación realizada con éxito.");
								break;
								
							case 2:
								System.out.println("Por favor, introduzca la cantidad de dinero que desea retirar.");
								System.out.printf("SU SALDO ACTUAL ES DE %.2f €\n", ((CuentaCorriente)cc).getSaldoCorriente());
								aux=sc.nextLine();
								dinero=Double.parseDouble(aux);
								
								if(((CuentaCorriente)cc).getSaldoCorriente() >= dinero) {
									cc.sacarDinero(dinero);
									((CuentaCorriente)cc).sumarPuntos();
									System.out.println("Operación realizada con éxito.");
								}else {
									System.out.println("ERROR, Su saldo es menor que la cantidad de dinero exigida para retirar.");
								}
								break;
								
							case 3:
								if(((CuentaCorriente)cc).getSaldoCorriente() > ((CuentaCorriente)cc).getMantenimientoFijo()) {
									((CuentaCorriente)cc).pagarMantenimientoFijo();
									System.out.println("Pago realizado con éxito.");
								}else {
									System.out.println("ERROR. No tiene suficiente dinero en la cuenta.");
								}
								break;

							case 0:
								break;
								
							default:
								System.out.println("ERROR. Esta tecla no está vinculada con ninguna opción. Por favor, escoja otra.");
								break;
						}
						
					} while(opcion2!=0);
					break;
			
				case 2:
					
					do {
						System.out.println("------------------------------------------------------");
						System.out.println("1. INGRESAR DINERO.");
						System.out.println("2. SACAR DINERO.");
						System.out.println("0. VOLVER.");
						System.out.println("------------------------------------------------------");
						aux = sc.nextLine();
						opcion3 = Integer.parseInt(aux);
						
						switch(opcion3) {
							
							case 1:
								System.out.println("Por favor, introduzca la cantidad de dinero que desea ingresar.");
								aux=sc.nextLine();
								dinero=Double.parseDouble(aux);
								
								cj.ingresarDinero(dinero);
								((CuentaJoven)cj).RegalarDinero();
								
								System.out.println("Operación realizada con éxito.");
								break;
								
							case 2:
								System.out.println("Por favor, introduzca la cantidad de dinero que desea retirar.");
								System.out.printf("SU SALDO ACTUAL ES DE %.2f €\n", ((CuentaJoven)cj).getSaldoJoven());
								aux=sc.nextLine();
								dinero=Double.parseDouble(aux);
								
								if(((CuentaJoven)cj).getSaldoJoven() >= dinero) {
									cj.sacarDinero(dinero);
									System.out.println("Operación realizada con éxito.");
								}else{
									System.out.println("ERROR, Su saldo es menor que la cantidad de dinero exigida para retirar.");
								}
								break;
								
							case 0:
								break;
								
							default:
								System.out.println("ERROR. Esta tecla no está vinculada con ninguna opción. Por favor, escoja otra.");
								break;
						}
						
					}while(opcion3!=0);
					break;
			
			
				case 3:
					
					do {
						System.out.println("------------------------------------------------------");
						System.out.println("1. INGRESAR DINERO.");
						System.out.println("2. SACAR DINERO.");
						System.out.println("0. VOLVER.");
						System.out.println("------------------------------------------------------");
						aux = sc.nextLine();
						opcion4 = Integer.parseInt(aux);
						
						switch(opcion4) {
							
							case 1:
								System.out.println("Por favor, introduzca la cantidad de dinero que desea ingresar.");
								aux=sc.nextLine();
								dinero=Double.parseDouble(aux);
								
								ce.ingresarDinero(dinero);
						
								System.out.println("Operación realizada con éxito.");
								break;
								
							case 2:
								System.out.println("Por favor, introduzca la cantidad de dinero que desea retirar.");
								System.out.printf("SU SALDO ACTUAL ES DE %.2f €\n", ((CuentaEmpresa)ce).getSaldoEmpresa());
								aux=sc.nextLine();
								dinero=Double.parseDouble(aux);
								
								if(((CuentaEmpresa)ce).getSaldoEmpresa() >= dinero) {
									ce.sacarDinero(dinero);
									((CuentaEmpresa)ce).cobrarDinero();
									System.out.println("Operación realizada con éxito.");
								}else{
									System.out.println("ERROR, Su saldo es menor que la cantidad de dinero exigida para retirar.");
								}
								break;
								
							case 0:
								break;
								
							default:
								System.out.println("ERROR. Esta tecla no está vinculada con ninguna opción. Por favor, escoja otra.");
								break;
						}
						
					}while(opcion4!=0);
					break;
					
					
				case 4:
					o.mostrarLista();
					break;
			
					
				case 5:
					System.out.println(o.sumarSaldoCuentas(cc, cj, ce));
					break;
			
			}
			
		}while(opcion!=0);
		
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("¡GRACIAS POR UTILIZAR EL PROGRAMA! LOS BANCOS SON UNOS TIMADORES >:(.");
		System.out.println("---------------------------------------------------------------------------------");
		
		
		
		
		
		
		
		
	}

}
