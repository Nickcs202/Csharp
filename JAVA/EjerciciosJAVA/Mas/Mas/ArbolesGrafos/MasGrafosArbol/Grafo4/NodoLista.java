package Grafo4;

public class NodoLista {

    private NodoLista sguiente;
    private NodoLista anterior;
    private NodoGrafo4 dato;

    public NodoLista getSguiente() {
        return sguiente;
    }

    public void setSguiente(NodoLista sguiente) {
        this.sguiente = sguiente;
    }

    public NodoLista getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoLista anterior) {
        this.anterior = anterior;
    }

    public NodoGrafo4 getDato() {
        return dato;
    }

    public void setDato(NodoGrafo4 dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return dato + "";
    }
}
