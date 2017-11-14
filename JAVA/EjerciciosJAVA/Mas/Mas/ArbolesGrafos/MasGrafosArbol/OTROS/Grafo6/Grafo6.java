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
public class Grafo6 {
    
        public void bfs(NodoGrafo6 raiz){
        NodoGrafo6 aux = new NodoGrafo6();
        Cola cola = new Cola();
        cola.insertar(raiz);
        while (cola.vacia() != true){
            aux = (NodoGrafo6)cola.extraer();
            System.out.println(">"+aux.toString());

            aux.setVisitado(true);
            for (int i = 0; i < aux.getVecinos().cantidad(); i++) {
                if ((((aux.getVecinos().getDato(i)).isVisitado())) && !(cola.existe(aux.getVecinos().getDato(i)))){
                   cola.insertar(aux.getVecinos().getDato(i));
                }
            }
        }

    }
    
}
