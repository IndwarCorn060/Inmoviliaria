package clases;

import java.util.*;

public class Inmoviliaria {
	
	private TreeSet<Propiedad> lista;
	
	public Inmoviliaria() {
		this.lista = new TreeSet<Propiedad>();
	}
	
	public boolean añadePropiedad(Propiedad pro){
		return this.lista.add(pro);
	}
	
	public Propiedad buscar(int cod) {
		Iterator<Propiedad> i = this.lista.iterator();
		boolean f=false;
		Propiedad aux=null;
		while(i.hasNext()&&!f) {
			aux=i.next();
			if(aux.getCodigo()==cod){
				f=true;
			}
		}
		return aux;
	}
	
	public boolean buscar(Propiedad pro) {
		Iterator<Propiedad> i = this.lista.iterator();
		boolean f=false;
		while(i.hasNext()&&!f) {
			if(i.next().equals(pro)){
				f=true;
			}
		}
		return f;
	}
	
	public boolean buscarCod(int cod) {
		Iterator<Propiedad> i = this.lista.iterator();
		boolean f=false;
		while(i.hasNext()&&!f) {
			if(i.next().getCodigo()==cod){
				f=true;
			}
		}
		return f;
	}
	
	public boolean borra(int cod) {
		return this.lista.remove(this.buscar(cod));
	}
	
	public boolean borra(Propiedad pro) {
		return this.lista.remove(pro);
	}
	
	@Override
	public String toString() {
		String cadena = "Lista:";
		Iterator<Propiedad> i = this.lista.iterator();
		while(i.hasNext()) {
			cadena+="\n+++++++++++++++\n"+i.next().toString();
		}
		return cadena;
	}
	
	public String getPropiedadesPrecio() {
		return "hola";
	}

}
