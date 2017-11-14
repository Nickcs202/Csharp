package Grafo5;

public class MainGrafo5 {

    /**
     * ++++++++++++++++++ NO ANDA ++++++++++++++
     * @param args
     */

    public static void main(String[] args) {


     NodoGrafo nodo1 = new NodoGrafo("1");
        NodoGrafo nodo2 = new NodoGrafo("2");
        NodoGrafo nodo3 = new NodoGrafo("3");
        NodoGrafo nodo4 = new NodoGrafo("4");
        NodoGrafo nodo5 = new NodoGrafo("5");
        NodoGrafo nodo6 = new NodoGrafo("6");
/*
        nodo1.setListavecinos(nodo2.getDato());
        nodo1.setListavecinos(nodo3.getDato());
        nodo2.setListavecinos(nodo1.getDato());
        nodo2.setListavecinos(nodo4.getDato());
        nodo3.setListavecinos(nodo1.getDato());
        nodo3.setListavecinos(nodo4.getDato());
        nodo4.setListavecinos(nodo2.getDato());
        nodo4.setListavecinos(nodo5.getDato());
        nodo5.setListavecinos(nodo6.getDato());
        nodo6.setListavecinos(nodo5.getDato());
*/

       nodo1.addVecino(nodo2);
       nodo1.addVecino(nodo3);
       nodo2.addVecino(nodo1);
       nodo2.addVecino(nodo4);
       nodo3.addVecino(nodo1);
       nodo3.addVecino(nodo4);
       nodo4.addVecino(nodo2);
       nodo4.addVecino(nodo5);
       nodo5.addVecino(nodo6);
       nodo6.addVecino(nodo5);

        Grafo5 g = new Grafo5();

        g.bfs(nodo1);
    }
}
