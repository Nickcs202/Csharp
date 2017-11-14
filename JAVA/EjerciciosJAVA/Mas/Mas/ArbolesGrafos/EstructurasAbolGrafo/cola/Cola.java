package cola;

import java.io.IOException;

public interface Cola {

	void inicializarCola();
	boolean ColaVacia();
	void eliminarCola();
	int primero()throws ColaVacia;
	void encolar(int x);
	int desencolar()throws ColaVacia;
	void mostrarEstadoCola();
	void imprimirCola();
	void leerCola()throws NumberFormatException, IOException;
	int numElemCola();
	void invertirCola()throws ColaVacia;
	
}
