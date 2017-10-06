package TAD;

public class Nodo {
	
	private Nodo siguiente;
	private Object dato;
	
	public Nodo(){
		this.siguiente = null;
		this.dato = null;	
	}
	
	public Nodo(Nodo siguiente, Object dato) {
		this.siguiente = siguiente;
		this.dato = dato;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public Object getDato() {
		return dato;
	}

	public void setDato(Object dato) {
		this.dato = dato;
	}

	@Override
	public String toString() {
		return  getDato()+"";
	}
	
	

}
