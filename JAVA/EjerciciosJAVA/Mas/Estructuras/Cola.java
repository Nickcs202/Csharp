public class Cola {
	
	private NodoDoble primerNodo;
	private NodoDoble ultimoNodo;
	private int tamanio;
	
	public Cola() {
		this.primerNodo = null;
		this.ultimoNodo = null;
		this.tamanio = 0;
	}

	public Cola(NodoDoble primerNodo, NodoDoble ultimoNodo, int tamanio) {
	//	super();
		this.primerNodo = primerNodo;
		this.ultimoNodo = ultimoNodo;
		this.tamanio = tamanio;
	}
	
	public boolean isVacio(){
		return primerNodo == null;
	}
	
	public void encolar(Object dato){
		NodoDoble nuevo = new NodoDoble();
		nuevo.setDato(dato);
		
		if (isVacio()) {
			primerNodo = ultimoNodo = nuevo;
			tamanio++;
		}else{
			//NodoDoble aux = primerNodo;
			
		}
		
		
	}

}
