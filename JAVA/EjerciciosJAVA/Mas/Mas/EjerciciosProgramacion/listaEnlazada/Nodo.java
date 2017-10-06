package listaEnlazada;

public class Nodo {
	
	// miembros de acceso del paquete; Lista puede acceder a ellos directamente
	
	Object datos; // los datos para este nodo
	Nodo siguienteNodo; // referencia al siguiente nodo en la lista
	
	// el constructor crea un objeto NodoLista que hace referencia al objeto
	Nodo( Object objeto ){
		this( objeto, null );
	} // fin del constructor de NodoLista con un argumento
	// el constructor crea un objeto NodoLista que hace referencia a
	// un objeto Object y al siguiente objeto NodoLista
	
	Nodo( Object objeto, Nodo nodo ){
		datos = objeto;
		siguienteNodo = nodo;
	} // fin del constructor de NodoLista con dos argumentos
	// devuelve la referencia a datos en el nodo
	
	Object obtenerObject(){
			return datos; // devuelve el objeto Object en este nodo
		} // fin del método obtenerObject
	// devuelve la referencia al siguiente nodo en la lista
	
	Nodo obtenerSiguiente(){
		return siguienteNodo; // obtiene el siguiente nodo
	}// fin del método obtenerSiguiente
}
