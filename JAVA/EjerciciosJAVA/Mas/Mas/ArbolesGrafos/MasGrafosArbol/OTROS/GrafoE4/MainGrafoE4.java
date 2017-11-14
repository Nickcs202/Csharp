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
public class MainGrafoE4 {
    
    public static void main(String[] args) {
        
        int[][] matriz = new int[3][3];
        matriz[0][0]= 0;
        matriz[0][1]= 1;
        matriz[0][2]= 0;
        matriz[1][0]= 1;
        matriz[1][1]= 0;
        matriz[1][2]= 1;
        matriz[2][0]= 0;
        matriz[2][1]= 1;
        matriz[2][2]= 0;
        
        Grafo g = new Grafo();
        NodoGrafo [] nodos = g.getGrafo(matriz);
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(nodos[i]+" "+nodos[i].getCantidadVecinosNoAsignada());/*
            for (int j = 0; j < nodos[j].getCantidadVecinosNoAsignada(); j++) {
                System.out.println(nodos[j].getVecinos(j)+" ");
            }*/
        }
    }
    
}
