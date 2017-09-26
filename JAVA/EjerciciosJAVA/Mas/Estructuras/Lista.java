public class Lista {
	
	private Nodo primerNodo;
	//private Nodo ultimoNodo;
	private String nombre;
	private int tamanio;
	
	public Lista(){
		this("lista");
		this.tamanio = 0;
	}
	
	public Lista(String nombre) {
		this.primerNodo = null;
		this.nombre = nombre;
	}
	
	public boolean isVacia(){
		return primerNodo == null;
	}
	
	public void agregar(Object dato){
		Nodo nuevo = new Nodo();
		nuevo.setDato(dato);
		
		if(isVacia()){
			//nuevo.setSiguiNodo(null);
			primerNodo = nuevo;
			tamanio++;
		}else{
			Nodo aux = primerNodo;
			
			while (aux.getSiguiNodo() != null) {
				aux = (aux.getSiguiNodo());
			}
			aux.setSiguiNodo(nuevo);
			aux = nuevo;
			tamanio++;
		}
	}

	public int getTamanio() {
		return tamanio;
	}
	
	public void imprimir(){
		
		if (isVacia()) {
			System.out.println("Lista vacia");
		}else {
			Nodo aux = primerNodo;
			System.out.println(aux.getDato());
			while (aux.getSiguiNodo() != null) {
				//System.out.println(aux.getDato());
				aux = (aux.getSiguiNodo());
				System.out.println(aux.getDato());
			}
		
		}
	}
	
	public Object getDato(int pos) {
		
		Nodo aux = primerNodo;
		int cont = 0;
		while ( cont != pos) {
			
			aux = (aux.getSiguiNodo());
			cont ++;
		}
		return aux.getDato();
	}
	
	public void eliminarElemento(int pos){
		Nodo aux = primerNodo;
		Nodo aux2;
		
		if(pos != 0){
			pos = pos - 1;

			int cont = 0;
			while (cont != pos) {
				aux = aux.getSiguiNodo();
				cont++;
			}
			aux2 = aux.getSiguiNodo();
			aux.setSiguiNodo(aux2.getSiguiNodo());
		}else{
			aux2 = aux.getSiguiNodo();
			primerNodo = aux2;
		}
	}
	



}
