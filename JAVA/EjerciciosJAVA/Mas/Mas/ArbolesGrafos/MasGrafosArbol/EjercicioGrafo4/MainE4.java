package EjercicioGrafo4;

import Grafo7.Grafo7;
import Grafo7.NodoGrafo7;

public class MainE4 {

    /**
     * Utilizando​ ​ las​ ​ matrices​ ​ de​ ​ adyacencia​ ​ C ​ ​ y ​ ​ D ​ ​ unen​ ​ los​ ​ nodos​ ​ numerados​ ​ con​ ​ las​ ​ etiquetas​ ​ 1 ​ , ​ ​ 2 ​ ,
3​ , ​ ​ escriba​ ​ un​ ​ programa​ ​ que​ ​ permita​ ​ cargar​ ​ un​ ​ grafo​ ​ en​ ​ memoria​ ​ utilizando​ ​ una​ ​ estructura
utilizando​ ​ un​ ​ NodoGrafo​ ​ que​ ​ permita​ ​ almacenar​ ​ sus​ ​ Nodos​ ​ Vecinos.
     * @param args
     */

    public static void main(String[] args){
        int[][] matriz = new  int[3][3];
        matriz[0][0]= 0;
        matriz[0][1]= 1;
        matriz[0][2]= 0;
        matriz[1][0]= 1;
        matriz[1][1]= 0;
        matriz[1][2]= 1;
        matriz[2][0]= 0;
        matriz[2][1]= 1;
        matriz[2][2]= 0;

        GrafoE4 g = new GrafoE4();
        ListaSimple nodos = new ListaSimple();

                //nodos g.getGrafo(matriz);
        //NodoEjercicio4[] nodoss = nodos.getArray();
        //NodoGrafo7[] nodoss = nodos.getArray();


        /*
        Grafo7 g7 = new Grafo7();
*/
        for (int i = 0; i <g.getGrafo(matriz).tamaño; i++) {
            for (int j = 0; j < ((NodoGrafo7)(g.getGrafo(matriz).getDatos(i))).getVecinos().length; j++) {
                System.out.println("#"+ ((NodoGrafo7)(g.getGrafo(matriz).getDatos(i))).getVecinos()[j] );
            }
        }
/*
        int[][] mat = g7.getMatriz( (NodoGrafo7)nodos.getDatos(0),3);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        }
        */

    }
}
