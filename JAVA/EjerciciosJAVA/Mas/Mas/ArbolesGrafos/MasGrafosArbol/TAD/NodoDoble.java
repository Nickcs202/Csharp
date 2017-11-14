package TAD;

public class NodoDoble {

    private NodoDoble siguiente;
    private NodoDoble anterior;
    private Object dato;

    public NodoDoble() {
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
