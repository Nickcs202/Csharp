public class ListaDoble { //extends Lista {
	
	private NodoDoble primerNodo;
	private NodoDoble ultimoNodo;
	private int tamanio;
	
	public ListaDoble(){

		this.primerNodo = null;
		this.ultimoNodo = null;
		this.tamanio = 0;
	}

	public ListaDoble(NodoDoble primerNodo, NodoDoble ultimoNodo) {
		//super();
		this.primerNodo = primerNodo;
		this.ultimoNodo = ultimoNodo;
		this.tamanio = 0;
	}
	
	public boolean isVacio(){
		return this.primerNodo == null;
	}
	public void agregarAlfinal(Object dato){
		
		NodoDoble nuevo = new NodoDoble();
		nuevo.setDato(dato);
		
		if(isVacio()){
			//System.out.println("Lista vacia...");
			primerNodo = nuevo;
			ultimoNodo = nuevo;
		}else{
			//NodoDoble aux = primerNodo;
			NodoDoble aux = ultimoNodo;
			/*
			while(aux.getSiguiNodo() != null ){
				aux = (NodoDoble) aux.getSiguiNodo();
			}*/
			aux.setSiguiNodo(nuevo);
			nuevo.setAnterior(aux);
			ultimoNodo = nuevo;
		}
		tamanio++;
	}
	
	public void agregarAlInicio(Object dato){
		
		NodoDoble nuevo = new NodoDoble();
		nuevo.setDato(dato);
		
		if(isVacio()){
			//System.out.println("Lista vacia...");
			primerNodo = nuevo;
			ultimoNodo = nuevo;
		}else{
			NodoDoble aux = primerNodo;

			aux.setAnterior(nuevo);
			nuevo.setSiguiNodo(aux);
			primerNodo = nuevo;
		}
		tamanio++;
	}
	
	public void imprimirListaEnOrden(){
		NodoDoble nuevo = new NodoDoble();
		if(isVacio()){
			System.out.println("Lista vacia...");
		}else{
			NodoDoble aux = primerNodo;
			System.out.println(aux.getDato());
			while(aux.getSiguiNodo() != null){
				aux = (NodoDoble) aux.getSiguiNodo();
				System.out.println(aux.getDato());
			}
		}
	}
	
	public void imprimirListaEnOrdenInverso(){
		NodoDoble nuevo = new NodoDoble();
		if(isVacio()){
			System.out.println("Lista vacia...");
		}else{
			NodoDoble aux = ultimoNodo;
			System.out.println(aux.getDato());
			while(aux.getAnterior() != null){
				aux = (NodoDoble) aux.getAnterior();
				System.out.println(aux.getDato());
			}
		}
	}
	
	public void getDato(int pos){
		NodoDoble nuevo = new NodoDoble();
		if(isVacio()){
			System.out.println("Lista vacia...");
		}else{
			NodoDoble aux = primerNodo;
			int cont = 0;
			while( cont != pos ){
				aux = (NodoDoble) aux.getSiguiNodo();
				cont++;
			}
			aux.getDato();
		}
	}
	
	public void eliminarUltimo(){
		
		tamanio--;
	}
	
	public void eliminarPrimero(){
		
		
		tamanio--;
	}
}



