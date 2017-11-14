package Grafo;

import java.util.LinkedList;

/**
 * Created by nux on 28/10/17.
 */
public class Grafo {

   // private Nodo[][] matrizAdyacencia;
    private int[][] matrizAdyacencia;

    private LinkedList nodos;


    public Grafo(int vertices) {
        //this.matrizAdyacencia = new Nodo[vertices][vertices];
        this.matrizAdyacencia = new int[vertices][vertices];
        this.nodos = new LinkedList();
    }

    public void addNodoALista(Nodo nodo){
        nodos.add(nodo);
    }

    public int[][] getMatrizAdyacencia(){
        //Lista aux = nodos;
        int pos = 0;
        for (int i = 0; i < nodos.size() - 1; i++) {
            Nodo aux =  (Nodo) (nodos.get(i));
            for (int j = 0; j < aux.getTamanioLista()-1; j++) {

               // matrizAdyacencia[pos][j] = aux.getNodoAdyasente().getDato(j);
                matrizAdyacencia[pos][j] = 1;
            }
            pos++;
        }
        return matrizAdyacencia;
    }


}
