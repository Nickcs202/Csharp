package TAD;

public class Lista {
	
	private Nodo primero;
	private int tamanio;
	
	public Lista(){
		this.primero = null;
		this.tamanio = 0;
	}
	
	public Lista(Nodo primero, int tamanio) {
		this.primero = primero;
		this.tamanio = tamanio;
	}
	
	public boolean isVacio(){
		return primero == null;
	}
	
	public void agregar(Object dato){
		Nodo nuevo = new Nodo();
		nuevo.setDato(dato);
		
		if(isVacio()){
			
		}
	}

}
