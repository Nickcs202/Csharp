package Grafo3;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Grafo3 {

    /**
     * Ejercicio​ ​ 3:
Utilizando​ ​ los​ ​ grafos​ ​ de​ ​ las​ ​ siguientes​ ​ figuras,​ ​ escribir​ ​ un​ ​ programa​ ​ que​ ​ permita​ ​ obtener​ ​ la
Matriz​ ​ de​ ​ Adyacencia​ ​ de​ ​ los​ ​ mismos.​ ​ Imprima​ ​ la​ ​ matriz​ ​ por​ ​ pantalla.
     */

    private List<NodoGrafo3> listaNosdos;


    public Grafo3() {
        this(null);
    }

    public Grafo3(List<NodoGrafo3> listaNosdos) {
        this.listaNosdos = new LinkedList<NodoGrafo3>();
    }

    public List<NodoGrafo3> getListaNosdos() {
        return listaNosdos;
    }

    public void setListaNosdos(List<NodoGrafo3> listaNosdos) {
        this.listaNosdos.add((NodoGrafo3) listaNosdos);
    }

    public void bfs(NodoGrafo3 raiz){
        NodoGrafo3 aux = new NodoGrafo3();
        LinkedList<NodoGrafo3> cola = new LinkedList<NodoGrafo3>();
        cola.addLast(raiz);
        while (cola.size() > 0){
            aux = cola.pollFirst();
            System.out.println(">"+aux.toString());

            aux.setVisitado(true);
            for (int i = 0; i < aux.getVecinos().size(); i++) {
                if ((!(aux.getVecinos().get(i).isVisitado())) && !(cola.contains(aux.getVecinos().get(i)))){
                   cola.addLast( aux.getVecinos().get(i));
                }
            }
        }

    }

}
