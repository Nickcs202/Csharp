/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicoprog.GrafoE4;

/**
 *
 * @author nux
 */
public class Grafo {
    
    private NodoGrafo[] arregloNodos;
    private int cantidadNodos;

    public Grafo() {
    }

    public Grafo(int cantidadNodos) {
        this.arregloNodos = new NodoGrafo[cantidadNodos];
        this.cantidadNodos = cantidadNodos;
    }

    public NodoGrafo[] getArregloNodos() {
        return arregloNodos;
    }
/*
    public void setArregloNodos(NodoGrafo[] arregloNodos) {
        this.arregloNodos = arregloNodos;
    }*/

    public int getCantidadNodos() {
        return cantidadNodos;
    }

    public void setCantidadNodos(int cantidadNodos) {
        this.cantidadNodos = cantidadNodos;
    }
    
    
    
    
    
    public NodoGrafo[] getGrafo(int[][] matriz){
        NodoGrafo[] nodos = new NodoGrafo[matriz.length];//cantidadNodos];
        for (int i = 0; i < matriz.length; i++) {   //FILAS
          //  if(nodos[0]== null){
             NodoGrafo nodo = new NodoGrafo(i+1);
             nodo.setCantidadVecinos(matriz.length);
             /*
            }else{
                if (nodos[i].getVecinos(i).getDato().equals(i+1)) {
                    NodoGrafo nodo =nodos[i].getVecinos(i);
                }else
                NodoGrafo nodo = new NodoGrafo(i+1);
            }
        */
            for (int j = 0; j < matriz.length; j++) {   //COLUMNAS
                
                if(matriz[i][j] == 1){
                    NodoGrafo nodo2 = new NodoGrafo(j+1);
                   nodo.addVecinos(nodo2);
                }
                
            }
           nodos[i] = nodo;
        }
        
        return nodos;
    }  
    /*
    public void bfs(NodoGrafo3 raiz){
        NodoGrafo3 aux = new NodoGrafo3();
        LinkedList<NodoGrafo3> cola = new LinkedList<NodoGrafo3>();
        cola.addLast(raiz);
        while (cola.size() > 0){
            aux = cola.pollFirst();
            System.out.println(">"+aux.toString());

            aux.setVisitado(true);
            for (int i = 0; i < aux.getVecinos().size(); i++) {
                if ((!(aux.getVecinos().get(i).isVisitado())) && !(cola.contains(aux.getVecinos().get(i)))){
                   cola.addLast( aux.getVecinos().get(i));
                }
            }
        }

    }*/
}
