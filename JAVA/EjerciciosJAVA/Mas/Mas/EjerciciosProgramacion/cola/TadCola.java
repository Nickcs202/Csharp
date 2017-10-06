package cola;

import java.io.IOException;

public class TadCola implements Cola {
	
	private NodoCola principio;
	private NodoCola fin;
	

	@Override
	public void inicializarCola() {
		principio=null;
		fin=null;
	}

	@Override
	public boolean ColaVacia() {
		
		return principio==null;
	}

	@Override
	public void eliminarCola() {
		// TODO Auto-generated method stub

	}

	@Override
	public int primero() throws cola.ColaVacia {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void encolar(int x) {
		NodoCola aux=new NodoCola(x, null);
		if(principio==null){
			principio=aux;
			fin=aux;
		}else{
			fin.setSiguiente(aux);
			fin=aux;
		}
	}

	@Override
	public int desencolar() throws cola.ColaVacia {
		int resultado;
		if(ColaVacia())
			throw new ColaVacia("Desencolar: la cola esta vacia");
			resultado=principio.getDato();
			principio=principio.getSiguiente();
		if(principio==null)
			fin=null;
		return resultado;
	}

	@Override
	public void mostrarEstadoCola() {
		// TODO Auto-generated method stub

	}

	@Override
	public void imprimirCola() {
		// TODO Auto-generated method stub
		System.out.println();
	}

	@Override
	public void leerCola() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public int numElemCola() {
		NodoCola aux;
		int result;
		aux=principio;
		result=0;
		while(aux!=null){
			++result;
			aux=aux.getSiguiente();
		}
		return result;
	}

	@Override
	public void invertirCola() throws cola.ColaVacia {
		int elem;
		if(!ColaVacia()){
			elem=desencolar();
			invertirCola();
			encolar(elem);
		}
			

	}

}
