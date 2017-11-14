/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicoprog.Grafo6;

/**
 *
 * @author nux
 */
public class NodoGrafo6 {
    
    private ListaCircular vecinos;
    private boolean visitado;
    private  String dato;

    public NodoGrafo6() {
        this(null,false,null);
    }

    
    public NodoGrafo6(String dato) {
        this(null,false,dato);
    }
        
    public NodoGrafo6(ListaCircular vecinos, boolean visitado, String dato) {
        this.vecinos = vecinos;
        this.visitado = visitado;
        this.dato = dato;
    }

    public ListaCircular getVecinos() {
        return vecinos;
    }

    public void setVecinos(Object vecinos) {
        this.vecinos.insertarUltimo(vecinos);
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
        return  "dato=" + dato ;
    }
    
    
    
}
