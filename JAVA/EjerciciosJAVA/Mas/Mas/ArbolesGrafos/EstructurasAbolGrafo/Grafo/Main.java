package Grafo;

/**
 * Created by nux on 29/10/17.
 */
public class Main {

    public static void main(String[] args){
        Nodo nodo1=new Nodo("A");
        Nodo nodo2=new Nodo("B");
        Nodo nodo3=new Nodo("C");
        Nodo nodo4=new Nodo("D");
        Nodo nodo5=new Nodo("E");
        Nodo nodo6=new Nodo("F");

        nodo1.addVecinos(nodo2);
        nodo1.addVecinos(nodo3);
        nodo2.addVecinos(nodo4);
        nodo3.addVecinos(nodo5);

        Grafo grafo = new Grafo(6);



    }
}
