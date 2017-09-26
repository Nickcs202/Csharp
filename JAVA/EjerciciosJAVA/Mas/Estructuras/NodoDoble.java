public class NodoDoble extends Nodo{
	
	private NodoDoble anterior;
	
	
	public NodoDoble(){
		super();
	}
	
	public NodoDoble(Nodo siguiente, Object dato,  NodoDoble anterior){
		super(dato, siguiente);
		this.anterior = anterior;
		
	}

	public NodoDoble getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoDoble anterior) {
		this.anterior = anterior;
	}
	
	
}
