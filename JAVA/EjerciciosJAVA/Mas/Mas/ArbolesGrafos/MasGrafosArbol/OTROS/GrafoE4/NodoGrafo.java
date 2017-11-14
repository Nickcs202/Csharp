/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicoprog.GrafoE4;

/**
 *
 * @author nux
 */
public class NodoGrafo {
    
    private NodoGrafo[] vecinos;
    private Object dato;
    private boolean visitado;
    private int cantidadVecinos;
    private int contadorPos;

    public NodoGrafo(){
        this.contadorPos = 0;
        this.vecinos = new NodoGrafo[cantidadVecinos];
    }
    
    public NodoGrafo(Object dato){
        this.dato = dato;
        this.contadorPos = 0;
        this.vecinos = new NodoGrafo[cantidadVecinos];
    }
    
    public NodoGrafo(Object dato, int cantidadVecinos) {
        this(dato,false,cantidadVecinos);
    }
    
    public NodoGrafo( Object dato, boolean visitado,int cantidadVecinos) {
        this.vecinos = new NodoGrafo[cantidadVecinos];
        this.dato = dato;
        this.visitado = visitado;
        this.cantidadVecinos = cantidadVecinos;
        this.contadorPos = 0;
    }

    public NodoGrafo[] getVecinos() {
        return vecinos;
    }
    
    public NodoGrafo getVecinos(int pos) {
        if (pos<cantidadVecinos) {
            return vecinos[pos];
        }
        return null;
    }

    public void addVecinos(NodoGrafo vecino,int pos) {
        if (pos<cantidadVecinos) {
            this.vecinos[pos] = vecino;
        }
        
    }
    
    public void addVecinos(NodoGrafo vecino) {
        if (contadorPos<cantidadVecinos) {
            this.vecinos[contadorPos] = vecino;
            contadorPos++;
        }
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public int getCantidadVecinos() {
        return cantidadVecinos;
    }

    public void setCantidadVecinos(int cantidadVecinos) {
        this.cantidadVecinos = cantidadVecinos;
    }

    public int getCantidadVecinosNoAsignada() {
        return contadorPos;
    }
    
    

    @Override
    public String toString() {
        return  "dato=" + dato;
    }
    
    
    
}
