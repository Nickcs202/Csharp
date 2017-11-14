package EjercicioGrafo4;

import Grafo7.NodoGrafo7;

public class GrafoE4 {

    private ListaSimple nodos;

    public GrafoE4() {
        this(null);
    }

    public GrafoE4(ListaSimple nodos) {
        this.nodos = nodos;
    }

    public ListaSimple getNodos() {
        return nodos;
    }

    public void setNodos(ListaSimple nodos) {
        this.nodos.agregar(nodos);
    }

    public ListaSimple getGrafo(int[][] matriz){
        ListaSimple listaVecinos = new ListaSimple();
        this.nodos = new ListaSimple();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == 1){
                    //Nodo vecino = new Nodo(j+1);
                    NodoGrafo7 vecino = new NodoGrafo7(j+1);
                    listaVecinos.agregar(vecino);
                }
            }
            //NodoEjercicio4 nodo = new NodoEjercicio4(i+1);
            NodoGrafo7 nodo = new NodoGrafo7(i+1);
            nodo.setVecinos(listaVecinos.getArray());
            nodos.agregar(nodo);
        }

        return nodos;
    }
}
