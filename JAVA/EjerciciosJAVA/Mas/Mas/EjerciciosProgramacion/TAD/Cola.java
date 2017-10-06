package TAD;

public class Cola {
	
	private Nododoble primerNodo;
	private Nododoble ultimoNodo;
	private int tamanio;
	
	public Cola(){
		this.primerNodo=null; 
		this.ultimoNodo=null; 
		this.tamanio=0;
	}
	
	public Cola(Nododoble primerNodo, Nododoble ultimoNodo, int tamanio) {
		
		this.primerNodo = primerNodo;
		this.ultimoNodo = ultimoNodo;
		this.tamanio = tamanio;
	}
	
	public boolean isVacio(){
		return primerNodo == null;
	}
	
	public void encolar(Object dato){
		Nododoble nuevo = new Nododoble();
		nuevo.setDato(dato);
		
		if (isVacio()) {
			primerNodo = nuevo;
			ultimoNodo = nuevo;
			tamanio++;
		}else {
			ultimoNodo.setSiguiente(nuevo);
			nuevo.setAnterior(ultimoNodo);
			ultimoNodo = nuevo;
			tamanio++;
		}
		
	}
	
	public Object desencolar(){
		if (isVacio()) {
			return null;
		}else {
			Nododoble aux = primerNodo;
			Object dato = aux.getDato();
			primerNodo = aux.getAnterior();
			tamanio--;
			return dato;
		}
		
	}
	
	public int getTamanio(){
		return tamanio;
	}

}
