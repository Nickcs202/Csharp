package estructuraDeDatos;

public class Nodo {

	private String valor;
	private Nodo siguiente;
	
	public Nodo(){
		this.valor = null;
		this.siguiente=null;	
	}
	
	public Nodo(String valor){
		this.valor = valor;
		this.siguiente = null;
	}

	@Override
	public String toString() {
		
		return this.valor;
	}
	
	
}
