package Grafo.Grafo2;

import TAD.Lista;

public class Grafo {

    //private Nodo[][] matrizAdyacencia;

    private int[][] matrizAdyacencia;

    private Lista nodos;


    public Grafo(int vertices) {
        //this.matrizAdyacencia = new Nodo[vertices][vertices];
        this.matrizAdyacencia = new int[vertices][vertices];
        this.nodos = new Lista();
    }

    public void addNodoALista(Nodo nodo){
        nodos.agregar(nodo);
    }

    public Nodo[][] getMatrizAdyacencia(){
        //Lista aux = nodos;
        int pos = 0;
        for (int i = 0; i < nodos.getTamanio() - 1; i++) {
            Nodo aux =  (Nodo) (nodos.getDato(i));
            for (int j = 0; j < aux.getTamanioLista()-1; j++) {

                matrizAdyacencia[pos][j] = aux.getNodoAdyasente().getDato(j);
            }
            pos++;
        }
        return matrizAdyacencia;
    }

}
