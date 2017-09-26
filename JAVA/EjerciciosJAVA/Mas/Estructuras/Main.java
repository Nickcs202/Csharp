import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		Lista lista = new Lista();
		
		lista.agregar("Juan");
		lista.agregar("Pedro");
		lista.agregar("Ana");
		lista.agregar("Nina");
		System.out.println("Tamanio = "+lista.getTamanio());
		lista.imprimir();
		System.out.println("Get Dato pos 0 = "+lista.getDato(2));
		lista.eliminarElemento(2);
		lista.imprimir();
		*/
		
		ListaDoble listaDoble = new ListaDoble();
		listaDoble.agregarAlfinal("a");
		listaDoble.agregarAlfinal("b");
		listaDoble.agregarAlfinal("c");
		listaDoble.agregarAlfinal("d");
		listaDoble.agregarAlfinal("e");
		
		listaDoble.imprimirListaEnOrden();
		//listaDoble.imprimirListaEnOrdenInverso();
		
		listaDoble.agregarAlInicio("A");
		listaDoble.imprimirListaEnOrden();
	}

}
