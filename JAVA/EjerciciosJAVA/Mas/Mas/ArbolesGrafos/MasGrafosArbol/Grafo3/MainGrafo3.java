package Grafo3;

public class MainGrafo3 {

public static void main(String[] args){

    NodoGrafo3 nodo1 = new NodoGrafo3("1");
    NodoGrafo3 nodo2 = new NodoGrafo3("2");
    NodoGrafo3 nodo3 = new NodoGrafo3("3");
    NodoGrafo3 nodo4 = new NodoGrafo3("4");
    NodoGrafo3 nodo5 = new NodoGrafo3("5");
    NodoGrafo3 nodo6 = new NodoGrafo3("6");

    nodo1.setVecinos(nodo2);
    nodo1.setVecinos(nodo3);
    nodo2.setVecinos(nodo1);
    nodo2.setVecinos(nodo4);
    nodo3.setVecinos(nodo1);
    nodo3.setVecinos(nodo4);
    nodo4.setVecinos(nodo2);
    nodo4.setVecinos(nodo5);
    nodo5.setVecinos(nodo6);
    nodo6.setVecinos(nodo5);

    Grafo3 g = new Grafo3();

    g.bfs(nodo1);


}


}
