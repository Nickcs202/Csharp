package Grafo4;

public class AristaGrafo4 {

    private int peso;
    private NodoGrafo4 anterior;
    private NodoGrafo4 siguiente;

    public AristaGrafo4() {
        this(0,null,null);
    }

    public AristaGrafo4(int peso, NodoGrafo4 anterior, NodoGrafo4 siguiente) {
        this.peso = peso;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public NodoGrafo4 getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoGrafo4 anterior) {
        this.anterior = anterior;
    }

    public NodoGrafo4 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoGrafo4 siguiente) {
        this.siguiente = siguiente;
    }
}
