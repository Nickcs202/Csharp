public class Main {

	public static void main(String[] args) {
	/*
		Pila p = new Pila();
		String s = "Lala";
		p.agregar(s);		
		p.agregar("A");
		p.agregar("B");
		System.out.println("tamanio: "+p.tamanio());
		System.out.println(""+ p.isVacia());
		p.imprimir();
		System.out.println(">"+ p.desapilar());
		System.out.println("tamanio: "+p.tamanio());
*/
		/*
		Cola c = new Cola();
		c.encolar("A");
		c.encolar("B");
		c.encolar("C");		
		c.encolar("D");
		System.out.println("tamanio: "+c.tamanio());
		c.imprimir();
		*/
		
		Arbol a = new Arbol();
		a.insertar(17);
		a.insertar(54);
		a.insertar(3);
		a.insertar(30);
		a.insertar(95);
		a.insertar(69);
		a.insertar(85);
		a.insertar(88);
		a.insertar(16);
		a.insertar(30);
		
		
		a.recorridoInorden();
		a.recorridoPosorden();
		a.recorridoPreorden();
	}

}
