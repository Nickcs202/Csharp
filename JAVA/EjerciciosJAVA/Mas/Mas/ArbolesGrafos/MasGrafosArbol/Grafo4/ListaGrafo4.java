package Grafo4;


public class ListaGrafo4 {

    private NodoLista primero;
    private NodoLista ultimo;
    private int tamanio;

    public ListaGrafo4() {
        this(null, 0);
    }

    public ListaGrafo4(NodoLista primero, int tamanio) {
        this.primero = primero;
        this.tamanio = tamanio;
    }

    public void add(NodoGrafo4 dato){
        NodoLista nuevo = new NodoLista();
        nuevo.setDato(dato);

        if (nuevo.getAnterior() == null){
            primero = ultimo = nuevo;
        }else{
            ultimo.setSguiente(nuevo);
            ultimo = nuevo;
        }
            tamanio++;
    }

    public NodoGrafo4 getNodo(int pos){
        NodoLista aux = this.primero;
        boolean finBucle = true;
        if (aux != null) {
            for (int i = 0; i < pos && finBucle; i++) {
                aux = aux.getSguiente();
                if(aux == null){
                    finBucle = false;
                }

            }
        }

        return aux.getDato();
    }

    public NodoGrafo4 desencolar(){
        NodoLista aux = primero;

        if (aux.getSguiente() != null) {
            primero = aux.getSguiente();
            primero.setAnterior(null);
            tamanio--;
        }/*else {
            aux=null;
        }*/

        return aux.getDato();
    }

    public int getTamanio() {
        return tamanio;
    }

    public boolean contains(NodoGrafo4 nodo){
        NodoLista aux = primero;
        boolean fin = true,esta = false;
        while (fin && aux.getSguiente() != null){
            if (aux.getDato() == nodo){
                fin = false;
                esta = true;
            }
            aux = aux.getSguiente();
        }
        return esta;
    }


}
