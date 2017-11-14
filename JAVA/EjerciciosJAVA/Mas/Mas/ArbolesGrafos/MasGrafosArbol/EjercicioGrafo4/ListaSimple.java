package EjercicioGrafo4;

import Grafo7.NodoGrafo7;

public class ListaSimple {
    private Nodo primero;
    public int tamaño;

    public ListaSimple() {
        this.primero = null;
        this.tamaño = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    public void agregar(Object valor) {

        Nodo nuevo = new Nodo(valor);

        if (vacia()) {
            // agregamos el primer nodo
            this.primero = nuevo;
        } else {
            // se tiene que recorrer la lista hasta llegar al ultimo nodo
            Nodo aux = this.primero;

            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        this.tamaño++;
    }

    public void eliminarUltimo() {
        if (vacia()) {
            System.out.println("ListaSimple vacia");
        } else {
            // se tiene que recorrer la lista hasta llegar al ultimo nodo
            Nodo aux = primero;
            Nodo nodoAnterior = aux;

            while (aux.siguiente != null) {
                nodoAnterior = aux;
                aux = aux.siguiente;
            }

            // Verifico si realmente avanzó en la lista hasta llegar al
            // último nodo que sea distinto del primero.
            // Si estoy en el primero, entonces lo hago null para indicar que la lista esta vacia.
            if (aux == this.primero) {
                this.primero = null;
            } else {
                // Le indico al nodo anterior que no apunte más al nodo a eliminar "aux".
                nodoAnterior.siguiente = null;
            }

            // Decremento el tamaño
            this.tamaño--;
        }
    }

        public Object getDatos(int pos) {
            Nodo aux = this.primero;
            if (!vacia()) {

                for(int i = 0; i<pos; i++) {
                    System.out.println(aux.valor);
                    aux = aux.siguiente;
                }
            }
            return aux.valor;
        }


   // public NodoEjercicio4[] getArray() {
    public NodoGrafo7[] getArray() {

        //NodoEjercicio4[] array = new NodoEjercicio4[tamaño];
        NodoGrafo7[] array = new NodoGrafo7[tamaño];
        if (!vacia()) {
            Nodo aux = this.primero;
            for(int i = 0; i<this.tamaño; i++) {
               // array[i]= (NodoEjercicio4) aux.valor;
                array[i]= (NodoGrafo7) aux.valor;
                aux = aux.siguiente;
            }
        }
        return array;
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
        return this.valor+"";
    }
}
