package Grafo3;

import java.util.LinkedList;
import java.util.List;

public class NodoGrafo3 {
    private LinkedList<NodoGrafo3> vecinos;
    private LinkedList<AristaGrafo3> aristaGrafo3s;
    private boolean visitado;
    private  String dato;

    public NodoGrafo3() {
        this(false,null);
    }

    public NodoGrafo3(String dato) {
        this(false, dato);
    }

    public NodoGrafo3(boolean visitado, String dato) {
        this.vecinos = new LinkedList<>();
        this.aristaGrafo3s = new LinkedList<>();
        this.visitado = visitado;
        this.dato = dato;
    }

    public List<NodoGrafo3> getVecinos() {
        return vecinos;
    }

    public void setVecinos(NodoGrafo3 vecinos) {
        this.vecinos.add(vecinos);
    }

    public List<AristaGrafo3> getAristaGrafo3s() {
        return aristaGrafo3s;
    }

    public void setAristaGrafo3s(AristaGrafo3 aristaGrafo3s) {
        this.aristaGrafo3s.add(aristaGrafo3s);
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "NodoGrafo3{" +
                "dato='" + dato + '\'' +
                '}';
    }
}
