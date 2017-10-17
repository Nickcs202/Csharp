package EjercicioProgII.TAD;

public class NodoArbol {

    private NodoArbol izq;
    private NodoArbol der;
    private Object dato;

    public NodoArbol() {
        this(null, null,null);
    }

    public NodoArbol(Object dato) {
        this(null, null,dato);
    }

    public NodoArbol(NodoArbol izq, NodoArbol der, Object dato) {
        this.izq = izq;
        this.der = der;
        this.dato = dato;
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

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "NodoArbol{" +
                "dato=" + dato +
                '}';
    }
}
