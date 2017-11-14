package Grafo2;

import TAD.Lista;

public class Nodo {

    private Lista nodoAdyasente;
    private Object dato;
    private boolean visitado;
    private boolean estado;
    private int posicion;
    private Arista arista;

    public Nodo() {
        this(null, false, false);
    }

    public Nodo(Object dato, boolean visitado, boolean estado) {
        this.nodoAdyasente = new Lista();
        this.dato = dato;
        this.visitado = visitado;
        this.estado = estado;
        //posicion++;
        this.arista = new Arista();
    }

    public void addVecinos(Nodo nodo){
        this.nodoAdyasente.agregar(nodo);
    }

    public void addVecinosNodoPonderado(Nodo nodo, int peso){
        this.arista.setInicio(this);
        this.arista.setFin(nodo);
        this.arista.setPeso(peso);
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

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Nodo getVecinoLista(int pos){
       return (Nodo) this.nodoAdyasente.getDato(pos);
    }

    public Arista getArista() {
        return arista;
    }
}
