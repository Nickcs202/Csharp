package Grafo7;

public class NodoGrafo7 {

    private int dato;
    private NodoGrafo7[] vecinos;
    private boolean visitado;
    private int cantidadVecinos;

    public NodoGrafo7() {
        this(0,null, false);
    }

    public NodoGrafo7(int dato) {
        this(dato,null,false);
    }

    public NodoGrafo7(int dato, NodoGrafo7[] vecinos) {
        this(dato, vecinos, false);
    }

    public NodoGrafo7(int dato, NodoGrafo7[] vecinos, boolean visitado) {
        this.dato = dato;
        this.vecinos = vecinos;
        this.visitado = visitado;
        this.cantidadVecinos = 0;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoGrafo7[] getVecinos() {
        return vecinos;
    }

    public void setVecinos(NodoGrafo7[] vecinos) {
        this.vecinos = vecinos;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    @Override
    public String toString() {
        return  ">"+dato;
    }

    public Object getVecino(int i) {
        return vecinos[i];
    }

    public int getCantidadVecinos() {
        return this.vecinos.length;
    }
}
