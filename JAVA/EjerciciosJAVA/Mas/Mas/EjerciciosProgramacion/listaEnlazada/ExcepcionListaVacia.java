package listaEnlazada;

public class ExcepcionListaVacia extends Exception {
	
	// constructor sin argumentos
	public ExcepcionListaVacia()
	{
	this( "Lista" ); // llama al otro constructor de ExcepcionListaVacia
	} // fin del constructor de ExcepcionListaVacia sin argumentos
	// constructor con un argumento
	public ExcepcionListaVacia( String nombre )
	{
	super( nombre + " esta vacia" ); // llama al constructor de la superclase
	} // fin del constructor de ExcepcionListaVacia con un argumento

}
