package stringJoiner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int opcion, posicion, posicion1, posicion2;
		String aux, nombre, apellido1, apellido2, dni, dni2, fechaNacimiento, personalizado, delimitador, prefijo, sufijo,
		nuevoNombre, nuevoApellido1, nuevoApellido2, nuevoDni, nuevaFechaNacimiento;
		
		Persona p;
		
		StringJoiner sj;
		
		List <Persona> lista = new ArrayList <Persona> ();
		List <StringJoiner> listaContrasenia = new ArrayList <StringJoiner> ();
		
		CRUDPersona cp = new CRUDPersona (lista);
		CRUDContrasenia cc = new CRUDContrasenia (listaContrasenia);
		
		/*	PUEDE USAR ESTA LISTA CON DATOS YA INSERTADOS :P 
		lista.add(new Persona ("Álvaro", "Carrión", "Brito", "14356098R", "17/03/2010"));
		lista.add(new Persona ("Eloy", "Falla", "Brito", "435276571P", "29/08/2015"));
		lista.add(new Persona ("Rosa", "García", "Corcuera", "231453675L", "04/05/1968"));
		lista.add(new Persona ("Manuel", "Pérez", "Gómez", "43821451R", "24/02/2004"));
		lista.add(new Persona ("Paula", "Aranda", "Pérez", "53427896C", "03/12/2005"));
		lista.add(new Persona ("Pablo", "Noguerol", "Ureña", "54621329R", "21/12/2005"));
		lista.add(new Persona ("Marla", "García", "Colorado", "34125364T", "18/03/2005"));
		lista.add(new Persona ("Txutxunpo", "Rey", "Plateado", "73526876Y", "03/03/1995"));
		lista.add(new Persona ("Iulian George", "Pabel", "Pabel", "63287132B", "13/07/2004"));
		lista.add(new Persona ("María", "Núñez", "Iglesias", "05342710S", "01/06/2004"));
		*/
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("¡BIENVENIDO AL EJEMPLO DE LA CLASE STRINGJOINER!");
		System.out.println("-------------------------------------------------------------------------------");
		
		do {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1. AÑADIR DATOS DE UNA PERSONA PARA GENERAR CONTRASEÑA.");  //CONTRASEÑA = CADENA DE CARACTERES
			System.out.println("2. MODIFICAR DATOS DE UNA PERSONA."); 
			System.out.println("3. BORRAR DATOS DE UNA PERSONA"); 
			System.out.println("4. MOSTRAR LISTA DE DATOS DE PERSONAS.");
			System.out.println("5. CREAR CONTRASEÑA."); 
			System.out.println("6. MOSTRAR CONTRASEÑAS."); 
			System.out.println("7. BORRAR CONTRASEÑA.");
			System.out.println("8. FUSIONAR DOS CONTRASEÑAS PARA CREAR UNA NUEVA.");	//MERGE()
			System.out.println("9. CONTAR CARACTERES DE UNA CONTRASEÑA.");	//LENGTH()
			System.out.println("10. MOSTRAR UNA CONTRASEÑA.");	//ToSTRING()
			System.out.println("0. SALIR.");
			System.out.println("--------------------------------------------------------------------");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
				case 1:
					System.out.println("\nPor favor, introduzca el nombre de la persona.");
					nombre=sc.nextLine();
					
					System.out.println("Por favor, introduzca el primer apellido de la persona.");
					apellido1=sc.nextLine();
					
					System.out.println("Por favor, introduzca el segundo apellido de la persona.");
					apellido2=sc.nextLine();
					
					System.out.println("Por favor, introduzca el DNI de la persona.");
					dni=sc.nextLine();
					
					System.out.println("Por favor, introduzca la fecha de nacimiento de la persona.");
					fechaNacimiento=sc.nextLine();
					
					cp.agregarPersona(nombre, apellido1, apellido2, dni, fechaNacimiento);

					System.out.println();
					break;
			
					
				case 2:
					System.out.println("\nPor favor, introduzca el NUEVO nombre de la persona.");
					nuevoNombre=sc.nextLine();
					
					System.out.println("Por favor, introduzca el NUEVO primer apellido de la persona.");
					nuevoApellido1=sc.nextLine();
					
					System.out.println("Por favor, introduzca el NUEVO segundo apellido de la persona.");
					nuevoApellido2=sc.nextLine();
					
					System.out.println("Por favor, introduzca el NUEVO DNI de la persona.");
					nuevoDni=sc.nextLine();
					
					System.out.println("Por favor, introduzca la NUEVA fecha de nacimiento de la persona.");
					nuevaFechaNacimiento=sc.nextLine();
					
					System.out.println();
					
					cp.mostrarDatosLista();
					
					System.out.println("\nPor favor, introduzca el DNI de la persona a la que quiere modificar con los datos NUEVOS.");
					dni2=sc.nextLine();
					
					cp.modificarPersona(nuevoNombre, nuevoApellido1, nuevoApellido2, nuevoDni, nuevaFechaNacimiento, cp.buscarPorDni(dni2));
					
					System.out.println();
					break;
					
					
				case 3:
					System.out.println("\nPor favor, introduzca el DNI de la persona para borrar sus datos.");
					dni2=sc.nextLine();
					
					cp.borrarDatos(cp.buscarPorDni(dni2));
					
					System.out.println();
					break;
					
					
				case 4:
					System.out.println();
					
					cp.mostrarDatosLista();
					
					System.out.println();
					break;
					
					
				case 5: 
					System.out.println("\n¿Qué delimitador quiere que tenga la contraseña?");
					delimitador=sc.nextLine();
					
					System.out.println("¿Qué carácter quiere que tenga como prefijo la contraseña?");
					prefijo=sc.nextLine();
					
					System.out.println("¿Y como sufijo?");
					sufijo=sc.nextLine(); 
					
					System.out.println();
					
					cp.mostrarDatosLista();
					
					System.out.println("\nIntroduzca el DNI de la persona para usar sus datos y crear la contraseña.");
					dni2=sc.nextLine();			
					
					System.out.println("\nPor último, introduzca un elemento personalizado para que su contraseña sea más segura.");
					personalizado=sc.nextLine();
					
					sj = new StringJoiner(delimitador, prefijo, sufijo);
					
					cc.agregarElementoAContrasenia(sj, cp.buscarPorDni(dni2), personalizado);
					
					cc.guardarContraseniaEnlista(sj);
					
					System.out.println();					
					break;
					
					
				case 6: 
					System.out.println();
					
					cc.mostrarListaConstrasenia();
					
					System.out.println();
					break;
					
					
				case 7:
					System.out.println();
					
					cc.mostrarListaConstrasenia();
					
					System.out.println("\nIntroduzca el número de la contraseña que quiere borrar.");
					aux=sc.nextLine();
					posicion=Integer.parseInt(aux);	
				
					cc.borrarContrasenia(cc.buscarPorIndice(posicion));
					break;
					
					
				case 8:
					System.out.println();
					
					cc.mostrarListaConstrasenia();
					
					System.out.println("\nIntroduzca el número de la contraseña que va a ir en primer lugar.");
					aux=sc.nextLine();
					posicion1=Integer.parseInt(aux);
					
					System.out.println("Introduzca el número de la contraseña que va a ir en segundo lugar.");
					aux=sc.nextLine();
					posicion2=Integer.parseInt(aux);
					
					System.out.println();
					
					cc.guardarContraseniaEnlista(cc.fusionarContrsenia(cc.buscarPorIndice(posicion1), cc.buscarPorIndice(posicion2)));
					break;
					
					
				case 9:
					System.out.println();
					
					cc.mostrarListaConstrasenia();
					
					System.out.println("\nIntroduzca el número de la contraseña de la que quiere saber los caracteres.");
					aux=sc.nextLine();
					posicion=Integer.parseInt(aux);
					
					System.out.println("\nLa contraseña posee: "+cc.contarCaracteresContrasenia(cc.buscarPorIndice(posicion))+" caracteres.\n");
					break;
					
					
				case 10:
					System.out.println();
					
					cc.mostrarListaConstrasenia();
					
					System.out.println("\nIntroduzca el número de la contraseña que quiere ver sola.");
					aux=sc.nextLine();
					posicion=Integer.parseInt(aux);
					
					System.out.println();
					
					cc.mostrarConstrasenia(cc.buscarPorIndice(posicion));
					
					System.out.println();
					break;
					
					
				case 0:
					System.out.println("\nSaliendo...\n");
					break;		
		
					
				default:
					System.out.println("ERROR. Esta tecla no está asignada a ninguna opción. Por favor, escoja otra que esté disponible.");
					break;
			}
			
		}while (opcion!=0);
	
		System.out.println("---------------------------------------------------------------------------------------------------------------------");
		System.out.println("¡GRACIAS POR USAR EL PROGRAMA! // ESPERO QUE CREE SUS CONTRASEÑAS CON ESTE PROGRAMA A PARTIR DE AHORA >:V");
		System.out.println("---------------------------------------------------------------------------------------------------------------------");
		
	}
	
}
