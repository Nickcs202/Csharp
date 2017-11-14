package Arbol.E1.E2;

/**
 * Created by nux on 26/07/17.
 */
public class NodoArbol {

    private NodoArbol izq;
    private NodoArbol der;
    private  int dato;

    public NodoArbol() {
        this.izq = null;
        this.der = null;
    }

    public NodoArbol getIzq() {
        return izq;
    }

    public void setIzq(NodoArbol izq) {
        this.izq = izq;
    }

    public NodoArbol getDer() {
        return der;
    }

    public void setDer(NodoArbol der) {
        this.der = der;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
}
