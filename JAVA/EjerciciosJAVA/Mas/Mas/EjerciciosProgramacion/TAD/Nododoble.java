package TAD;

public class Nododoble {
	
	private Nododoble siguiente;
	private Nododoble anterior;
	private Object dato;
	
	public Nododoble(){
		this.siguiente = null;
		this.anterior = null;
		this.dato = 0;
	}
			
	public Nododoble(Nododoble siguiente, Nododoble anterior, Object dato) {
		//super();
		this.siguiente = siguiente;
		this.anterior = anterior;
		this.dato = dato;
	}

	public Nododoble getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nododoble siguiente) {
		this.siguiente = siguiente;
	}

	public Nododoble getAnterior() {
		return anterior;
	}

	public void setAnterior(Nododoble anterior) {
		this.anterior = anterior;
	}

	public Object getDato() {
		return dato;
	}

	public void setDato(Object dato) {
		this.dato = dato;
	}	
	

}
