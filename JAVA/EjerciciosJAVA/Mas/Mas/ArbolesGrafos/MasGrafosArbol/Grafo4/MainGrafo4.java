package Grafo4;

public class MainGrafo4 {

    /**
     *
     *              +++++++++ NO ANDA ++++++
     *
     * @param args
     */
    public static void main(String[] args) {

        NodoGrafo4 nodo1 = new NodoGrafo4("1");
        NodoGrafo4 nodo2 = new NodoGrafo4("2");
        NodoGrafo4 nodo3 = new NodoGrafo4("3");
        NodoGrafo4 nodo4 = new NodoGrafo4("4");
        NodoGrafo4 nodo5 = new NodoGrafo4("5");
        NodoGrafo4 nodo6 = new NodoGrafo4("6");

        nodo1.setListavecinos(nodo2);
        nodo1.setListavecinos(nodo3);
        nodo2.setListavecinos(nodo1);
        nodo2.setListavecinos(nodo4);
        nodo3.setListavecinos(nodo1);
        nodo3.setListavecinos(nodo4);
        nodo4.setListavecinos(nodo2);
        nodo4.setListavecinos(nodo5);
        nodo5.setListavecinos(nodo6);
        nodo6.setListavecinos(nodo5);

        Grafo4 g = new Grafo4();

        g.bfs(nodo1);
    }
}
