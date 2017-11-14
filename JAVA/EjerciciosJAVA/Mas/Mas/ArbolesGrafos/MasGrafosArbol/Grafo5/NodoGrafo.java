package Grafo5;

public class NodoGrafo {

    private ListaDoble listavecinos;
    private String dato;
    private boolean visitado;
    private ListaDoble listaAristas;
    private NodoGrafo[] vecinos;

    public NodoGrafo() {
        this(null);
    }

    public NodoGrafo(String dato) {
        this.dato = dato;
        this.listavecinos = new ListaDoble();
        this.listaAristas = new ListaDoble();
        this.visitado = false;
    }

    public ListaDoble getListavecinos() {
        return listavecinos;
    }
    public NodoGrafo getListavecinos(int pos) {
        return vecinos[pos];
    }

    public int tamanioListaVecino(){
        return vecinos.length;
    }

    public void setListavecinos(String vecino) {
        this.listavecinos.agregar(vecino);
    }

    public void addVecino(NodoGrafo nodo){
        if(vecinos == null){
            vecinos = new NodoGrafo[1];
            vecinos[0] = nodo;
        }else {
            NodoGrafo[] aux = new NodoGrafo[vecinos.length+1];
            aux[vecinos.length] = nodo;
            vecinos = aux;
        }
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public ListaDoble getListaAristas() {
        return listaAristas;
    }
/*
    public void setListaAristas(AristaGrafo4 arista) {
        this.listaAristas.add(arista);
    }*/

    @Override
    public String toString() {
        return "NodoGrafo4{" +
                "dato='" + dato + '\'' +
                '}';
    }

}
