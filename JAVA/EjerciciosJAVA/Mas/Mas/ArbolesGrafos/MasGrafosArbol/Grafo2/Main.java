package Grafo2;

public class Main {

    /**
     * Ejercicio​ ​ 3:
Utilizando​ ​ los​ ​ grafos​ ​ de​ ​ las​ ​ siguientes​ ​ figuras,​ ​ escribir​ ​ un​ ​ programa​ ​ que​ ​ permita​ ​ obtener​ ​ la
Matriz​ ​ de​ ​ Adyacencia​ ​ de​ ​ los​ ​ mismos.​ ​ Imprima​ ​ la​ ​ matriz​ ​ por​ ​ pantalla.
     * @param args
     */

    public static void main(String[] args){
        Nodo nodo1 = new Nodo();
        Nodo nodo2 = new Nodo();
        Nodo nodo3 = new Nodo();
        Nodo nodo4 = new Nodo();
        Nodo nodo5 = new Nodo();
        Nodo nodo6 = new Nodo();

        nodo1.addVecinos(nodo2);
        nodo1.addVecinos(nodo3);
        nodo2.addVecinos(nodo1);
        nodo2.addVecinos(nodo4);
        nodo3.addVecinos(nodo1);
        nodo3.addVecinos(nodo4);
        nodo4.addVecinos(nodo2);
        nodo4.addVecinos(nodo3);
        nodo5.addVecinos(nodo6);
        nodo6.addVecinos(nodo5);

        Grafo g = new Grafo(6);

        g.addNodoALista(nodo1);
        g.addNodoALista(nodo2);
        g.addNodoALista(nodo3);
        g.addNodoALista(nodo4);
        g.addNodoALista(nodo5);
        g.addNodoALista(nodo6);

        int[][] m = g.getMatrizAdyacencia();

        System.out.println("   1 2 3 4 5 6");
        for (int i = 0; i < m.length; i++) {

              System.out.print((i+1)+"  ");
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }

        g.dfs(nodo1);

    }
}
