package stringBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int edad, nuevaEdad, opcion, posicion, capacidad, indiceI, indiceF;
		double altura, peso, nuevaAltura, nuevoPeso;
		String aux, nombre, apellidos, dni, dni2, personalizado, nuevoNombre, nuevosApellidos, nuevoDni;
		
		Persona p;
		
		StringBuilder sb;
		
		List <Persona> lista = new ArrayList <Persona> ();
		List <StringBuilder> listaContrasenia = new ArrayList <StringBuilder> ();
		
		CRUDPersona cp = new CRUDPersona (lista);
		CRUDContrasenia cc = new CRUDContrasenia (listaContrasenia);
		
		/*	PUEDE USAR ESTA LISTA CON DATOS YA INSERTADOS :P 
		lista.add(new Persona ("Juan José", "Reyes Segura", "73526876Y", 1.65, 82.4, 56));
		lista.add(new Persona ("Álvaro", "Carrión Brito", "14356098R", 1.64, 51.2, 14));
		lista.add(new Persona ("Eloy", "Falla Brito", "435276571P", 1.25, 24.8, 8));
		lista.add(new Persona ("Rosa", "García Corcuera", "231453675L", 1.62, 49.3, 57));
		lista.add(new Persona ("Manuel", "Pérez Gómez", "43821451R", 1.83, 60.2, 20));
		lista.add(new Persona ("Paula", "Aranda Pérez", "53427896C", 1.65, 52.5, 18));
		lista.add(new Persona ("Pablo", "Noguerol Ureña", "54621329R", 1.85, 63.7, 18));
		lista.add(new Persona ("Marla", "García Colorado", "34125364T", 1.74, 47.0, 19));
		lista.add(new Persona ("Iulian George", "Pabel", "63287132B", 1.76, 64.8, 19));
		lista.add(new Persona ("María", "Núñez Iglesias", "05342710S", 1.75, 58.3, 19));
		*/
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("¡BIENVENIDO AL EJEMPLO DE LA CLASE STRINGBUILDER!");
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
			//---OPCIONES EXCLUSIVAS DE STRINGBUILDER---------------------------------------------------------------------------------------------------------------------
			System.out.println("8. AÑADIR CARACTERES EXTRAS AL FINAL DE LA CONTRASEÑA."); 	//APPEND()
			System.out.println("9. VER CAPACIDAD ACTUAL DE CARACTERES DE LA CONTRASEÑA."); 	//CAPACITY()
			System.out.println("10. CONTAR CARACTERES DE UNA CONTRASEÑA."); 	//LENGTH()
			System.out.println("11. INVERTIR CONTRASEÑA.");	//REVERSE()
			System.out.println("12. AÑADIR CARACTERES EXTRAS EN UNA POSICIÓN CONCRETA DE LA CONTRASEÑA.");	//INSERT()
			System.out.println("13. BORRAR CARACTERES DE LA CONTRASEÑA (SELECCIONANDO LÍMITES).");	//DELETE()
			System.out.println("14. INTERCAMBIAR CIERTOS CARACTERES POR OTROS EN LA CONTRASEÑA (SELECCIONANDO LÍMITES).");	//REPLACE()
			System.out.println("15. MOSTRAR PARTE DE LA CONTRASEÑA (SELECCIONANDO LÍMITES).");	//SUBSTRING()
			System.out.println("0. SALIR.");
			System.out.println("--------------------------------------------------------------------");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
				case 1:
					System.out.println("\nPor favor, introduzca el nombre de la persona.");
					nombre=sc.nextLine();
					
					System.out.println("Por favor, introduzca los apellidos de la persona.");
					apellidos=sc.nextLine();
					
					System.out.println("Por favor, introduzca el DNI de la persona.");
					dni=sc.nextLine();
					
					System.out.println("Por favor, introduzca la altura (m) de la persona.");
					aux=sc.nextLine();
					altura=Double.parseDouble(aux);
					
					System.out.println("Por favor, introduzca el peso (Kg) de la persona.");
					aux=sc.nextLine();
					peso=Double.parseDouble(aux);
					
					System.out.println("Por favor, introduzca la edad de la persona.");
					aux=sc.nextLine();
					edad=Integer.parseInt(aux);
					
					cp.agregarPersona(nombre, apellidos, dni, altura, peso, edad);
					
					System.out.println();
					break;
			
					
				case 2:
					System.out.println("\nPor favor, introduzca el NUEVO nombre de la persona.");
					nuevoNombre=sc.nextLine();
					
					System.out.println("Por favor, introduzca los NUEVOS apellidos de la persona.");
					nuevosApellidos=sc.nextLine();
					
					System.out.println("Por favor, introduzca el NUEVO DNI de la persona.");
					nuevoDni=sc.nextLine();
					
					System.out.println("Por favor, introduzca la NUEVA altura (m) de la persona.");
					aux=sc.nextLine();
					nuevaAltura=Double.parseDouble(aux);
					
					System.out.println("Por favor, introduzca el NUEVO peso (Kg) de la persona.");
					aux=sc.nextLine();
					nuevoPeso=Double.parseDouble(aux);
					
					System.out.println("Por favor, introduzca la NUEVA edad de la persona.");
					aux=sc.nextLine();
					nuevaEdad=Integer.parseInt(aux);
					
					System.out.println();
					
					cp.mostrarDatosLista();
					
					System.out.println("\nPor favor, introduzca el DNI de la persona a la que quiere modificar con los datos NUEVOS.");
					dni2=sc.nextLine();
					
					cp.modificarPersona(nuevoNombre, nuevosApellidos, nuevoDni, nuevaAltura, nuevoPeso, nuevaEdad, cp.buscarPorDni(dni2));
					
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
					System.out.println("\n¿Qué límite máximo de caracteres quiere que tenga la contraseña?");
					System.out.println("SI MÁS TARDE EL NÚMERO DE CARACTERES VARÍA Y SUPERA EL MÁXIMO, DICHO LÍMITE AUMENTARÁ AUTOMÁTICAMENTE.");
					aux=sc.nextLine();
					capacidad=Integer.parseInt(aux);
					
					System.out.println();
					
					cp.mostrarDatosLista();
					
					System.out.println("\nIntroduzca el DNI de la persona para usar sus datos y crear la contraseña.");
					dni2=sc.nextLine();			
					
					//NO ES OBLIGATORIO USAR LOS DATOS EN LA CONTRASEÑA, SÓLO ESTÁ PARA QUE EL USUARIO PUEDA INTRODUCIRLOS SI QUIERE.
					
					System.out.println("\n"+cp.buscarPorDni(dni2));
					
					sb = new StringBuilder (capacidad);
					
					System.out.println("\nIntroduzca la contraseña.");
					personalizado=sc.nextLine();
					
					cc.agregarElementoAContrasenia(sb, personalizado);
					
					cc.guardarContraseniaEnlista(sb);
					
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
					
					System.out.println("\nIntroduzca el número de la contraseña a la que quiere añadir los caracteres.");
					aux=sc.nextLine();
					posicion=Integer.parseInt(aux);		
					
					System.out.println("\nPor favor, introduzca la cadena de caracteres extras.");
					personalizado=sc.nextLine();
					
					cc.agregarElementoAContrasenia(cc.buscarPorIndice(posicion), personalizado);
					
					System.out.println();
					break;
					
					
				case 9:
					System.out.println();
					
					cc.mostrarListaConstrasenia();
					
					System.out.println("\nIntroduzca el número de la contraseña de la que quiere saber su capacidad .");
					aux=sc.nextLine();
					posicion=Integer.parseInt(aux);	
					
					System.out.println("\nLa capacidad máxima actual de caracteres que puede almacenar la contraseña es de: "+cc.calcularCapacidad(cc.buscarPorIndice(posicion))+" caracteres.\n"); 
					break;
					
					
					
				case 10:
					System.out.println();
					
					cc.mostrarListaConstrasenia();
					
					System.out.println("\nIntroduzca el número de la contraseña de la que quiere saber los caracteres.");
					aux=sc.nextLine();
					posicion=Integer.parseInt(aux);
					
					System.out.println("\nLa contraseña posee: "+cc.contarCaracteresContrasenia(cc.buscarPorIndice(posicion))+" caracteres.\n");
					break;
					
				
				case 11:
					System.out.println();
					
					cc.mostrarListaConstrasenia();
					
					System.out.println("\nIntroduzca el número de la contraseña que quiere revertir.");
					aux=sc.nextLine();
					posicion=Integer.parseInt(aux);
					
					cc.revertirCadena(cc.buscarPorIndice(posicion));
					break;
					
					
				case 12:
					
					System.out.println();
					
					cc.mostrarListaConstrasenia();
					
					System.out.println("\nIntroduzca el número de la contraseña a la que quiere añadir los caracteres.");
					aux=sc.nextLine();
					posicion=Integer.parseInt(aux);		
					
					System.out.println("\nPor favor, introduzca la cadena de caracteres extras.");
					personalizado=sc.nextLine();
					
					System.out.println("\nPor favor, introduzca la posición en la que se va a añadir la cadena de caracteres extras.");
					aux=sc.nextLine();
					indiceI=Integer.parseInt(aux);		
					
					//Siendo "indice" el caracter a partir del que va a aparecer la nueva cadena creada.
					
					cc.agregarCaracteresAPosicion(cc.buscarPorIndice(posicion), indiceI, personalizado);
					
					System.out.println();
					break;
					
					
				case 13:
					System.out.println();
					
					cc.mostrarListaConstrasenia();
					
					System.out.println("\nIntroduzca el número de la contraseña a la que quiere añadir los caracteres.");
					aux=sc.nextLine();
					posicion=Integer.parseInt(aux);		
					
					System.out.println("\nPor favor, introduzca desde qué posición va a empezar a borrarse la contraseña.");
					aux=sc.nextLine();
					indiceI=Integer.parseInt(aux);
					
					System.out.println("\nPor favor, introduzca hasta qué posición va a llegar el borrado de la contraseña.");
					aux=sc.nextLine();
					indiceF=Integer.parseInt(aux);		
					
					cc.borrarCaracteresEntreLimites(cc.buscarPorIndice(posicion), indiceI, indiceF);
					
					System.out.println();
					break;
					
					
				case 14:
					System.out.println();
					
					cc.mostrarListaConstrasenia();
					
					System.out.println("\nIntroduzca el número de la contraseña en la que quiere intercambiar algunos caracteres.");
					aux=sc.nextLine();
					posicion=Integer.parseInt(aux);	
					
					System.out.println("\nPor favor, introduzca la cadena de caracteres que servirá de reemplazo.");
					personalizado=sc.nextLine();
					
					System.out.println("\nPor favor, introduzca desde qué posición va a empezar a intercambiar los caracteres.");
					aux=sc.nextLine();
					indiceI=Integer.parseInt(aux);
					
					System.out.println("\nPor favor, introduzca hasta qué posición va a llegar el intercambio de caracteres.");
					aux=sc.nextLine();
					indiceF=Integer.parseInt(aux);		
					
					cc.remplazoDeCaracteres(cc.buscarPorIndice(posicion), indiceI, indiceF, personalizado);
					
					System.out.println();
					break;

					
				case 15:
					System.out.println();
					
					cc.mostrarListaConstrasenia();
					
					System.out.println("\nIntroduzca el número de la contraseña en la que quiere intercambiar algunos caracteres.");
					aux=sc.nextLine();
					posicion=Integer.parseInt(aux);	
					
					System.out.println("\nPor favor, introduzca desde qué posición va a empezar a mostrarse el fragmento de contraseña.");
					aux=sc.nextLine();
					indiceI=Integer.parseInt(aux);
					
					System.out.println("\nPor favor, introduzca hasta qué posición va a llegar la muestra del fragmento de contraseña.");
					aux=sc.nextLine();
					indiceF=Integer.parseInt(aux);		
					
					System.out.println("\nFragmento de contraseña: "+cc.acortarContrasenia(cc.buscarPorIndice(posicion), indiceI, indiceF)); 
					
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