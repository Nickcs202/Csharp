package cola;

public class Main {

	public static void main(String[] args) throws ColaVacia {
		TadCola cola = new TadCola();
		
		cola.inicializarCola();
		
		cola.imprimirCola();
		
		System.out.println("Numero de elementos de la cola = "+cola.numElemCola());
		
		for (int j = 1; j < 5; j++) {
			cola.encolar(j);
		}
		
		System.out.println("Numero de elementos de la cola = "+cola.numElemCola());
		System.out.println("Desencolar = "+cola.desencolar());
		System.out.println("Desencolar = "+cola.desencolar());
		System.out.println("Numero de elementos de la cola = "+cola.numElemCola());
	}

}
