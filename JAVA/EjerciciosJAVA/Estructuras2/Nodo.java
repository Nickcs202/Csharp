public class Nodo {
	
	private Object dato;
	private Nodo siguienteNodo;
	
	public Nodo(){
		this.dato=null;
		this.siguienteNodo=null;
		
	}
	
	public void setDato(Object dato){
		this.dato=dato;
	}
	public void setSiguienteNodo(Nodo siguiente){
		this.siguienteNodo=siguiente;
	}
	public Object getDato(){
		return this.dato;
	}
	public Nodo getSiguienteNodo(){
		return this.siguienteNodo;
	}
	
	

}
