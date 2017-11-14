package Grafo2;

import TAD.Cola;
import TAD.Lista;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Grafo {

    //private Nodo[][] matrizAdyacencia;

    private int[][] matrizAdyacencia;

    private Lista nodos;

    private int numPos = 0;


    public Grafo(int vertices) {
        //this.matrizAdyacencia = new Nodo[vertices][vertices];
        this.matrizAdyacencia = new int[vertices][vertices];
        this.nodos = new Lista();
    }

    public void addNodoALista(Nodo nodo){
        nodo.setPosicion(numPos);
        nodos.agregar(nodo);
        this.numPos++;
    }

    //public Nodo[][] getMatrizAdyacencia(){
    public int[][] getMatrizAdyacencia(){
        //ListaSimple aux = nodos;
        int pos = 0;
        for (int i = 0; i < nodos.getTamanio(); i++) {
            Nodo aux =  (Nodo) (nodos.getDato(i));
            for (int j = 0; j < aux.getTamanioLista(); j++) {

                //matrizAdyacencia[pos][j] = aux.getNodoAdyasente().getDato(j);
                //if (aux.getNodoAdyasente().getDato(j) != null)
               // if (aux.getVecinoLista(j).getPosicion() == j)
                matrizAdyacencia[pos][aux.getVecinoLista(j).getPosicion()] = 1;
            }
            pos++;
        }
        return matrizAdyacencia;
    }

    public void dfs(Nodo raiz){
        //Cola2 cola = new Cola2();
        Queue<Nodo> cola = new PriorityQueue<>();
        //cola.encolar(raiz);
        cola.add(raiz);
        Nodo aux;
        Lista vecinos;
       // while (!cola.isVacia()){
        while (cola.isEmpty()){
            //aux = (Nodo) cola.desEncolar();
            aux = cola.remove();
            System.out.println(aux.getPosicion()+"");//.getPosicion()+"");
            vecinos = aux.getNodoAdyasente();

           // if (aux.isVisitado()) {
             //   aux.setVisitado(true);
            if (vecinos.getTamanio()>0){
                for (int i = 0; i < vecinos.getTamanio(); i++) {
                    if (((Nodo)(vecinos.getDato(i))).isVisitado()) {
                        cola.add((Nodo) vecinos.getDato(i));
                        ((Nodo)(vecinos.getDato(i))).setVisitado(true);
                    }
                }
            }
        }
    }

}
