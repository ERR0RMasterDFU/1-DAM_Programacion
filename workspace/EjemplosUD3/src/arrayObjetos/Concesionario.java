package arrayObjetos;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Concesionario {

	//ATRIBUTAS----------------------------------------------------------
	private Vehiculo[]lista;
	private int nVs;
	

	//CONSTRUCTORES -----------------------------------------------------
	public Concesionario(Vehiculo[] lista, int nVs) {
		super();
		this.lista = lista;
		this.nVs = nVs;
	}


	//GETTERS & SETTERS--------------------------------------------------
	public Vehiculo[] getLista() {
		return lista;
	}


	public void setLista(Vehiculo[] lista) {
		this.lista = lista;
	}


	public int getnVs() {
		return nVs;
	}


	public void setnVs(int nVs) {
		this.nVs = nVs;
	}


	//TO STRING---------------------------------------------------------
	@Override
	public String toString() {
		return "Concesionario [lista=" + Arrays.toString(lista) + "]";
		
		
		public void agregar (Vehiculo v) {
			
			lista[nVs]=v;
			nVs++;
		}
		
		public void mostrarMasCincuentaCV(int topeCV) {
			for (int i = 0; i < nVs; i++) {
				if(lista[i].getPotencia()>=topePotencia) {
					System.out.println(lista[i].getModelo());
				}
			}
		}
		
		
		
		
		
	System.out.println(c.getLista()[i].getPotencia());	
		
		
		
	}
	
}
