package Grafo7;

public class Grafo7 {

    public int[][] getMatriz(NodoGrafo7 raiz, int tamanioMatriz){
    //public void getMatriz(NodoGrafo7 raiz, int tamanioMatriz){
        int[][] mat = new int[tamanioMatriz][tamanioMatriz];
        NodoGrafo7 aux = new NodoGrafo7();
        //aux = raiz;
        Cola cola = new Cola();
        cola.encolar(raiz);
        while (!cola.vacia() ){ //!= true) {
            aux = (NodoGrafo7) cola.desencolar();
//System.out.println(aux.getDato());
           // if (aux.getCantidadVecinos()>0) {
                for (int i = 0; i < aux.getVecinos().length; i++) {
                    if (aux.isVisitado() != true) {
                    mat[(aux.getDato())-1][(((NodoGrafo7) aux.getVecino(i)).getDato())-1]=1;// Integer.parseInt(((aux.getDato())+"") )-1][Integer.parseInt(((NodoGrafo7)aux.getVecino(i)).getDato()+"")-1]= 1;//(Integer) aux.getDato() - 1][(Integer) (((NodoGrafo7) aux.getVecino(i)).getDato()) - 1] = 1;//Integer.parseInt(((NodoGrafo7)aux.getVecino(i)).getDato().toString())] = 1;
                    cola.encolar(((NodoGrafo7) aux.getVecino(i)));//.getDato());
                    }
                }
                aux.setVisitado(true);
           // }
        }
        return mat;
    }
}
