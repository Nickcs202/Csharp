package estructuraDeDatos;

public abstract class Lista implements ILista {
	
	private Nodo primero;
	private int tamanio;

	public Lista(){
		this.primero = null;
		this.tamanio = 0;
	}
	
	
	@Override
	public boolean vacia() {
		return primero == null;
	}

	@Override
	public void agregarAlInicio() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarUltimo() {
		

	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub

	}


}
