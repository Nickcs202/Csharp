/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicoprog.Grafo6;

/**
 *
 * @author nux
 */
public class MainGrafo6 {
    
    public static void main(String[] args){

    NodoGrafo6 nodo1 = new NodoGrafo6("1");
    NodoGrafo6 nodo2 = new NodoGrafo6("2");
    NodoGrafo6 nodo3 = new NodoGrafo6("3");
    NodoGrafo6 nodo4 = new NodoGrafo6("4");
    NodoGrafo6 nodo5 = new NodoGrafo6("5");
    NodoGrafo6 nodo6 = new NodoGrafo6("6");

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

    Grafo6 g = new Grafo6();

    g.bfs(nodo1);
    }
    
}
