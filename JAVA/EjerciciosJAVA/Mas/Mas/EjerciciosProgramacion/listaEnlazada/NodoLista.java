package listaEnlazada;

public class NodoLista {

	private Object objeto;
	private NodoLista siguienteNodo;
	
	public NodoLista(Object objeto, NodoLista siguienteNodo) {
		this.objeto = objeto;
		this.siguienteNodo = siguienteNodo;
	}

	public Object getObjeto() {
		return objeto;
	}

	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}

	public NodoLista getSiguienteNodo() {
		return siguienteNodo;
	}

	public void setSiguienteNodo(NodoLista siguienteNodo) {
		this.siguienteNodo = siguienteNodo;
	}
	
	
	
	
}
