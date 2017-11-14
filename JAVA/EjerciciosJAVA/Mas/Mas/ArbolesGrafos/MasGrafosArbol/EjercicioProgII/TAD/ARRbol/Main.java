package EjercicioProgII.TAD.ARRbol;

public class Main {

    public static void main(String[] arg){

        /// Ejercicio N 1 y 2
/*
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
*/

        ///Ejercicio N 3
        NodoArbol nodo1 = new NodoArbol("+");
        NodoArbol nodo2 = new NodoArbol("*");
        NodoArbol nodo3 = new NodoArbol("-");
        NodoArbol nodo4 = new NodoArbol("1");
        NodoArbol nodo5 = new NodoArbol("3");
        NodoArbol nodo6 = new NodoArbol("1");
        NodoArbol nodo7 = new NodoArbol("6");

        nodo1.setDer(nodo3);
        nodo1.setIzq(nodo2);

        nodo2.setIzq(nodo4);
        nodo2.setDer(nodo5);

        nodo3.setDer(nodo7);
        nodo3.setIzq(nodo6);


        Arbol arbol = new Arbol(nodo1);


        /*
        Arbol arbol = new Arbol();

        arbol.insercionRecursiva(4);

        arbol.insercionRecursiva(2);

        arbol.insercionRecursiva(5);

        arbol.insercionRecursiva(1);

        arbol.insercionRecursiva(3);

        arbol.insercionRecursiva(6);
        */

        arbol.imprimirPreorden();

        arbol.imprimirInorden();

        arbol.imprimirPosorden();

        arbol.imprimirRecorridoPorNivel();
    }
}
