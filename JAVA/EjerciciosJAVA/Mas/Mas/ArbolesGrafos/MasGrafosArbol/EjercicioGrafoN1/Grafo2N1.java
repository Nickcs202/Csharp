package EjercicioGrafoN1;

import TAD.Lista;
import TAD.Pila;

public class Grafo2N1 {

    private int[][] matrizAdyacencia;

    private Lista listaAdyacencia;

    public Grafo2N1(int catElem) {
        this.matrizAdyacencia = new int[catElem][catElem];
        this.listaAdyacencia = new Lista();
    }

    /**
     *
     */
    public void addNodos(int nodo, int[] adyacentes){
        for (int i = 0; i < adyacentes.length; i++) {
            matrizAdyacencia[nodo-1][i] = adyacentes[i];
        }
    }

    public void addNodos(int nodo, int peso, int pos){

            matrizAdyacencia[nodo-1][pos-1] = peso;

    }

    public int[][] getMatrizAdyacencia() {
        return matrizAdyacencia;
    }

    public void ImprimirMatrizAdyacencia(){
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = 0; j < matrizAdyacencia.length; j++) {
                System.out.print(matrizAdyacencia[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public void caminoMasCorto(int init, int fin){
        Pila pila = new Pila();
        Pila pilaAux = new Pila();
        int cont = 0;

        Lista lista = new Lista();
        Lista listaAux = new Lista();
        int contAux = 0;
/*
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            pila.agregar(i);
            cont += (this.matrizAdyacencia[i]).clone()[i];

            for (int j = 0; j < matrizAdyacencia.length; j++) {

            }
        }
*/
        int i,j = i = 0, posDato, menor;
        i = init;
        boolean encontrado = false;
        while (matrizAdyacencia[i][j] == fin){
            menor = menor(i, matrizAdyacencia);
            for (int k = 0; k < matrizAdyacencia.length && encontrado != true; k++) {
                if (menor-1 == matrizAdyacencia[i][k]){
                    posDato = k;
                    encontrado = true;
                }
            }
          //  pila.agregar(posDato+"");
        }


    }

    public int menor(int pos, int[][] matriz){
        int menor = 10000000;

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[pos][i] < menor ){
                menor = matriz[pos][i];
            }
        }

        return menor;
    }

    public int menor(int pos, int[][] matriz, int exep){
        int menor = 10000000;

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[pos][i] < menor && matriz[pos][i] != exep){
                menor = matriz[pos][i];
            }
        }

        return menor;
    }
}
