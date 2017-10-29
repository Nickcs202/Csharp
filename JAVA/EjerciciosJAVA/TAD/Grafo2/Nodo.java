package Grafo.Grafo2;

import TAD.Lista;

public class Nodo {

    private Lista nodoAdyasente;
    private Object dato;
    private boolean visitado;
    private boolean estado;

    public Nodo() {
        this(null, false, false);
    }

    public Nodo(Object dato, boolean visitado, boolean estado) {
        this.nodoAdyasente = new Lista();
        this.dato = dato;
        this.visitado = visitado;
        this.estado = estado;
    }

    public void addVecinos(Nodo nodo){
        this.nodoAdyasente.agregar(nodo);
    }
    public Object getDato(){
        return this.dato;
    }

    public Lista getNodoAdyasente() {
        return nodoAdyasente;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getTamanioLista(){
        return nodoAdyasente.getTamanio();
    }
}
