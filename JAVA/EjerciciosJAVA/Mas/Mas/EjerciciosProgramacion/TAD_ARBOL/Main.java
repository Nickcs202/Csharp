package EjercicioProgII.TAD;

public class Main {

    public static void main(String[] arg){



        NodoArbol nodo1 = new NodoArbol("1");
        NodoArbol nodo2 = new NodoArbol("2");
        NodoArbol nodo3 = new NodoArbol("3");
        NodoArbol nodo4 = new NodoArbol("4");
        NodoArbol nodo5 = new NodoArbol("5");
        NodoArbol nodo6 = new NodoArbol("6");

        nodo4.setDer(nodo5);
        nodo4.setIzq(nodo2);

        nodo2.setIzq(nodo1);
        nodo2.setDer(nodo3);

        nodo5.setDer(nodo6);
        nodo5.setIzq(null);


        Arbol arbol = new Arbol(nodo4);

        arbol.imprimirPreorden();

        arbol.imprimirInorden();

        arbol.imprimirPosorden();

        arbol.imprimirRecorridoPorNivel();
    }
}
