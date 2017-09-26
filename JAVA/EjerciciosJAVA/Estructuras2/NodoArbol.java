public class NodoArbol {
	/*
	private Object dato;
	private NodoArbol izq;
	private NodoArbol der;
	
	public NodoArbol() {
	
		this.dato = null;
		this.izq = null;
		this.der = null;
	}

	public Object getDato() {
		return dato;
	}

	public void setDato(Object dato) {
		this.dato = dato;
	}

	public NodoArbol getIzq() {
		return izq;
	}

	public void setIzq(NodoArbol izq) {
		this.izq = izq;
	}

	public NodoArbol getDer() {
		return der;
	}

	public void setDer(NodoArbol der) {
		this.der = der;
	}
	
	*/
	private int dato;
	private NodoArbol izq;
	private NodoArbol der;
	
	public NodoArbol() {
		
	
		this.izq = null;
		this.der = null;
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public NodoArbol getIzq() {
		return izq;
	}

	public void setIzq(NodoArbol izq) {
		this.izq = izq;
	}

	public NodoArbol getDer() {
		return der;
	}

	public void setDer(NodoArbol der) {
		this.der = der;
	}

	
	

}
