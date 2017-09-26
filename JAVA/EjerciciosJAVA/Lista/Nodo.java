public class Nodo {

	private Object dato;
	private Nodo siguiNodo;
	
	public Nodo(Object dato) {
	
		this.dato = dato;
		this.siguiNodo = null;
	}



	public Nodo(Object dato, Nodo siguiNodo) {
		
		this.dato = dato;
		this.siguiNodo = siguiNodo;
	}



	public Object getDato() {
		return dato;
	}
/*
	public void setDato(Object dato) {
		this.dato = dato;
	}*/

	public Nodo getSiguiNodo() {
		return siguiNodo;
	}

	public void setSiguiNodo(Nodo siguiNodo) {
		this.siguiNodo = siguiNodo;
	}
	
	
	
}
