public class Lista {
	
	private Nodo primerNodo;
	private Nodo ultimoNodo;
	private String nombre;
	
	public Lista(){
		this("lista");
	}
	
	public Lista(String nombre) {
		
		this.primerNodo = null;
	
		this.nombre = nombre;
	}
	
	public boolean isVacia(){
		return primerNodo==null;
		
	}
	
	

}
