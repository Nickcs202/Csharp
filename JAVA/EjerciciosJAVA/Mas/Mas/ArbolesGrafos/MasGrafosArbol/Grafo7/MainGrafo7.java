package Grafo7;

public class MainGrafo7 {

    /**
     * Ejercicio​ ​ 3:
Utilizando​ ​ los​ ​ grafos​ ​ de​ ​ las​ ​ siguientes​ ​ figuras,​ ​ escribir​ ​ un​ ​ programa​ ​ que​ ​ permita​ ​ obtener​ ​ la
Matriz​ ​ de​ ​ Adyacencia​ ​ de​ ​ los​ ​ mismos.​ ​ Imprima​ ​ la​ ​ matriz​ ​ por​ ​ pantalla.
     * @param args
     */

    public static void main(String[] args){
        NodoGrafo7 nodo1;// = new NodoGrafo7();
        NodoGrafo7 nodo2;// = new NodoGrafo7();
        NodoGrafo7 nodo3;// = new NodoGrafo7();
        /*NodoGrafo7 nodo4 = new NodoGrafo7();
        NodoGrafo7 nodo5 = new NodoGrafo7();
        NodoGrafo7 nodo6 = new NodoGrafo7();

        nodo3 = new NodoGrafo7(3, new NodoGrafo7[]{nodo2});
        nodo2 = new NodoGrafo7(2,new NodoGrafo7[]{nodo1, nodo3});
        nodo1 = new NodoGrafo7(1, new NodoGrafo7[]{nodo2});
*/

        nodo1 = new NodoGrafo7(1);
        nodo2 = new NodoGrafo7(2);
        nodo3 = new NodoGrafo7(3);
/*
        nodo1.setVecinos( new NodoGrafo7[]{nodo2});
        nodo2.setVecinos(new NodoGrafo7[]{nodo1, nodo3});
        nodo3.setVecinos(new NodoGrafo7[]{nodo2});
*/
        nodo1.setVecinos( new NodoGrafo7[]{nodo2,nodo3});
        nodo2.setVecinos(new NodoGrafo7[]{nodo1, nodo3});
        nodo3.setVecinos(new NodoGrafo7[]{nodo1,nodo2});

        Grafo7 g = new Grafo7();

        int[][] mat = g.getMatriz(nodo1,3);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        }

//g.getMatriz(nodo1,3);

    }
}
