package Grafo2;

public class Arista {

    private int peso;
    private Nodo inicio;
    private Nodo fin;

    public Arista() {
        this(0,null,null);
    }

    public Arista(int peso) {
        this(peso,null,null);
    }

    public Arista(int peso, Nodo inicio, Nodo fin) {
        this.peso = peso;
        this.inicio = inicio;
        this.fin = fin;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }
}
