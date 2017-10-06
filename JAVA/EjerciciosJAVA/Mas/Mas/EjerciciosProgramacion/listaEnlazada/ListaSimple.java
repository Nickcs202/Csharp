package listaEnlazada;

public class ListaSimple {
	
	private NodoLista primerNodo;
	private NodoLista ultimoNodo;
	private String nombre;
	
	public ListaSimple(){
		this("Lista");
	}
	
	public ListaSimple(String nombre){
		this.nombre=nombre;
		primerNodo=ultimoNodo=null;
		
	}
	
	public void insertar(){
		
	}

}
