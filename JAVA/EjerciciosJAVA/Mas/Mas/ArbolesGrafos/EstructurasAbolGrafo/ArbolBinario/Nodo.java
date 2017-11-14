package ArbolBinario;

public class Nodo {
	
	private Object dato;
	private Nodo izq;
	private Nodo drch;
	
	public Nodo(){
		
	}
	public Nodo(Object dat){
		this.dato=dat;
		this.drch=this.izq=null;
	}
	public Object getDato() {
		return dato;
	}
	public void setDato(Object dato) {
		this.dato = dato;
	}
	public Nodo getIzq() {
		return izq;
	}
	public void setIzq(Nodo izq) {
		this.izq = izq;
	}
	public Nodo getDrch() {
		return drch;
	}
	public void setDrch(Nodo drch) {
		this.drch = drch;
	}
	
	public void insertarNodo(String var){
		
		//Integer valor = Integer.parseInt((String)var);
		
		//if((Integer)var>0)
		
		Integer valor = Integer.parseInt(var);
		
		if((Integer)this.dato< valor){
			if(izq==null)
				izq=new Nodo(valor);
			else
				izq.insertarNodo(""+valor);
		}else
			if((Integer)dato>valor){
				if(drch==null)
					drch=new Nodo(valor);
				else
					drch.insertarNodo(""+valor);
			}
	}

}
