package Grafo7;

/**
 * Clase cola.
 */
public class Cola {

    private Nodo primero;
    private Nodo ultimo;
    private int tamaño;

    public Cola() {
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    // enqueue
    public void encolar(Object valor) {

        Nodo nuevo = new Nodo(valor);

        if (vacia()) {
            this.primero = ultimo = nuevo;
        } else {

            this.ultimo.siguiente = nuevo;
            this.ultimo = nuevo;
        }
        this.tamaño++;
    }

    // dequeue
    public Object desencolar() {

        Nodo aux = this.primero;
        // Nodo aux2 = aux;

        if (aux.siguiente != null) {//vacia()) {
            //   return null;
            // } else {

            // Object aux = this.primero.valor;
            this.primero = this.primero.siguiente;
            this.tamaño--;
        }else
            this.primero = ultimo = null;
        //aux = null;

        return aux.valor;
        //}
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Cola vacia");
        } else {

            Nodo aux = this.primero;
            for(int i = 0; i<this.tamaño; i++) {
                System.out.println(aux.valor+" ");
                aux = aux.siguiente;
            }
        }
    }
}

class Nodo {

    public Object valor;
    public Nodo siguiente;

    public Nodo() {
        this(null);
    }

    public Nodo(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    // toString() retorna el valor del nodo.
    @Override
    public String toString() {
        return this.valor + "";
    }

}











