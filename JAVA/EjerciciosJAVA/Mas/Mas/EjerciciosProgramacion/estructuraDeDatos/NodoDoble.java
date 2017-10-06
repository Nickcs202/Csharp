package estructuraDeDatos;

public class NodoDoble extends Nodo{

	//private String valor;
	private NodoDoble anterior;
	//private NodoDoble siguiente;
	
	public NodoDoble(){
		super();
	}
	
	public NodoDoble(String valor){
		super(valor);
		//this.valor=valor;
		this.anterior=null;
		//this.siguiente=null;
		
	}
	/*
	@Override
	public String toString(){
		return this.valor;
	}*/
	
	
}
