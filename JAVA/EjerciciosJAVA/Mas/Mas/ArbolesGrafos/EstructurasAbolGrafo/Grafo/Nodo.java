package Grafo;

import java.util.LinkedList;

/**
 * Created by nux on 28/10/17.
 */
public class Nodo {

    private LinkedList vecinos;
    private Object dato;
    private boolean visitado;
    private boolean esatado;
    private Nodo nodoAdyasente;

    public Nodo() {
        this(null,false, false);
    }

    public Nodo(Object dato) {
        this(dato,false,false);
    }

    public Nodo(Object dato, boolean visitado, boolean esatado) {
        this.dato = dato;
        this.visitado = visitado;
        this.esatado = esatado;
    }

    public Object getDato() {
        return dato;
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

    public boolean isEsatado() {
        return esatado;
    }

    public void setEsatado(boolean esatado) {
        this.esatado = esatado;
    }

    public void addVecinos(Nodo nodo){
        vecinos.add(nodo);
    }

    public LinkedList getVecinos() {
        return vecinos;
    }

    public int getTamanioLista(){

        return vecinos.size();
    }

    public Nodo getNodoAdyasente() {
        return nodoAdyasente;
    }
}
