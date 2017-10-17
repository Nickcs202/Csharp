package EjercicioProgII.TAD;

import java.util.*;

public class Arbol {

    private NodoArbol raiz;

    public Arbol() {
        this(null);
    }

    public Arbol(NodoArbol raiz) {
        this.raiz = raiz;
    }

    public void imprimirPreorden(){
        System.out.println(" Recorrido Preorden ");
        recorridoPreorden(raiz);
    }
    public void imprimirInorden(){
        System.out.println(" Recorrido Inorden ");
        recorridoInorden(raiz);
    }
    public void imprimirPosorden(){
        System.out.println(" Recorrido Posorden ");
        recorridoPosorden(raiz);
    }
    public void recorridoPreorden(NodoArbol recorrido){
        if (recorrido != null){
            System.out.println(""+recorrido.getDato());
            recorridoPreorden(recorrido.getIzq());
            recorridoPreorden(recorrido.getDer());
        }
    }
    public void recorridoInorden(NodoArbol recorrido){
        if (recorrido != null){
            recorridoInorden(recorrido.getIzq());
            System.out.println(""+recorrido.getDato());
            recorridoInorden(recorrido.getDer());
        }
    }
        public void recorridoPosorden(NodoArbol recorrido){
        if (recorrido != null){
            recorridoPosorden(recorrido.getIzq());
            recorridoPosorden(recorrido.getDer());
            System.out.println(""+recorrido.getDato());
        }
    }
    public void imprimirRecorridoPorNivel(){
            System.out.println(" Recorrido por nivel ");
            recorridoPorNivel(raiz);
    }

    public void recorridoPorNivel(NodoArbol raiz){
            NodoArbol nodo;
       // PriorityQueue cola = new PriorityQueue();
        Queue<NodoArbol> cola = new LinkedList<>();
        cola.offer(raiz);

            //Cola cola = new Cola();
            //cola.encolar(raiz);
            //while (!cola.isVacia()){
        while (!cola.isEmpty()){
                //nodo = (NodoArbol) cola.desencolar();
            nodo = (NodoArbol) cola.poll();
            System.out.println(nodo.getDato()+"");
                if (nodo.getIzq() != null){
                    //cola.encolar(nodo.getIzq());
                    cola.offer(nodo.getIzq());
                }
                if (nodo.getDer()!= null){
                    //cola.encolar(nodo.getDer());
                    cola.offer(nodo.getDer());
                }
               // System.out.println(nodo.getDato()+"");
            }
    }



}
class NodoDoble{

    private NodoDoble siguiente;
    private NodoDoble anterior;
    private Object dato;

    public NodoDoble() {
        this(null,null,null);
    }

    public NodoDoble(NodoDoble siguiente, NodoDoble anterior, Object dato) {
        this.siguiente = siguiente;
        this.anterior = anterior;
        this.dato = dato;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "NodoDoble{" +
                "dato=" + dato +
                '}';
    }
}

class Cola {

    private NodoDoble primero;
    private NodoDoble ultimo;
    private int tamanio;

    public Cola() {
        primero = null;
        ultimo = null;
        tamanio = 0;
    }

    public Cola(NodoDoble primero, NodoDoble ultimo, int tamanio) {
        this.primero = primero;
        this.ultimo = ultimo;
        this.tamanio = tamanio;
    }

    public boolean isVacia() {
        return primero == null;
    }

    public void encolar(Object dato) {
        NodoDoble nuevo = new NodoDoble();
        nuevo.setDato(dato);

        if (isVacia()) {
            primero = ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }
        tamanio++;
    }

    public int getTamanio() {
        return this.tamanio;
    }

    public Object desencolar() {
        NodoDoble aux = new NodoDoble();
        NodoDoble aux2 = new NodoDoble();

        if (isVacia()) {
            return null;
        } else {
            aux2 = ultimo.getAnterior();
            aux = ultimo;
            aux2.setSiguiente(null);
            ultimo = aux2;

            tamanio--;
        }

        return aux;
    }

    public void imprimir() {
        NodoDoble aux = this.primero;

        //  while (aux.getSiguiente() != null){
        for (int i = 0; i < tamanio; i++) {
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }

    }
}