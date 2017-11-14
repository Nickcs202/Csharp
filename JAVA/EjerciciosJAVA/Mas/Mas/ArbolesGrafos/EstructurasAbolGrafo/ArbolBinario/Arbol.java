package ArbolBinario;

import Estructuras.Cola;

public class Arbol {
	
	private Nodo raiz;
	
	public Arbol(){
		this.raiz=null;
	}
	
	public void insertarNod(String valor){
		if(raiz==null)
			raiz=new Nodo(valor);
		else
			raiz.insertarNodo(valor);
	}
	public void recorridoPreorden(){
		preOrden(raiz);
	}
	public void recorridoPosorden(){
		posOrden(raiz);
	}

	public void recorridoInorden(){
		inOrden(raiz);
	}
	private void inOrden(Nodo raiz) {
	
		if(raiz==null)
			return;
		
		preOrden(raiz.getDrch());
		System.out.print(" "+raiz.getDato()+" ");
		preOrden(raiz.getIzq());
		
	}
	private void posOrden(Nodo raiz) {
		
		if(raiz==null)
			return;
		
		
		preOrden(raiz.getDrch());
		preOrden(raiz.getIzq());
		System.out.print(" "+raiz.getDato()+" ");
	}
	private void preOrden(Nodo raiz) {
		if(raiz==null)
			return;
		
		System.out.print(" "+raiz.getDato()+" ");
		preOrden(raiz.getDrch());
		preOrden(raiz.getIzq());
		
	}
	
	public void recorrerAnchura(Nodo raiz){
		Nodo nodo;
		Cola cola = new Cola();
		cola.encolar(raiz);
		while(!cola.isVacia()){
			nodo = (Nodo) cola.desencolar();
			if(nodo.getIzq() != null){
				cola.encolar(nodo.getDrch());
			}
			if(nodo.getDrch() != null){
				cola.encolar(nodo.getDrch());
			}
		}
	}


}
