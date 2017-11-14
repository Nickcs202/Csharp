package Grafo4;

public class NodoGrafo4 {

    private ListaGrafo4 listavecinos;
    private String dato;
    private boolean visitado;
    private ListaGrafo4 listaAristas;

    public NodoGrafo4() {
        this(null);
    }

    public NodoGrafo4(String dato) {
        this.dato = dato;
        this.listavecinos = new ListaGrafo4();
        this.listaAristas = new ListaGrafo4();
        this.visitado = false;
    }

    public ListaGrafo4 getListavecinos() {
        return listavecinos;
    }

    public void setListavecinos(NodoGrafo4 vecino) {
        this.listavecinos.add(vecino);
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

    public ListaGrafo4 getListaAristas() {
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
