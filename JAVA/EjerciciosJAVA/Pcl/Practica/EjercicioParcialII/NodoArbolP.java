package EjercicioParcialII;

public class NodoArbolP {

    private NodoArbolP izq;
    private NodoArbolP der;
    private Object dato;

    public NodoArbolP() {
        this(null,null,null);
    }

    public NodoArbolP(Object dato) {
        this(null,null,dato);
    }

    public NodoArbolP(NodoArbolP izq, NodoArbolP der, Object dato) {
        this.izq = izq;
        this.der = der;
        this.dato = dato;
    }

    public NodoArbolP getIzq() {
        return izq;
    }

    public void setIzq(NodoArbolP izq) {
        this.izq = izq;
    }

    public NodoArbolP getDer() {
        return der;
    }

    public void setDer(NodoArbolP der) {
        this.der = der;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return dato +" ";
    }
}
