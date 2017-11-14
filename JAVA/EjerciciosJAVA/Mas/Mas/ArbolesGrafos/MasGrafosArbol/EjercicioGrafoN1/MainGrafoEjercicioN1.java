package EjercicioGrafoN1;

public class MainGrafoEjercicioN1 {

    public static void main(String[] args){
        Grafo2N1 g = new Grafo2N1(10);

        g.addNodos(1,2,2);
        g.addNodos(1,4,3);
        g.addNodos(1,3,4);

        g.addNodos(2,7,5);
        g.addNodos(2,4,6);
        g.addNodos(2,6,7);

        g.addNodos(3,3,5);
        g.addNodos(3,2,6);
        g.addNodos(3,4,7);

        g.addNodos(4,4,5);
        g.addNodos(4,1,6);
        g.addNodos(4,5,7);

        g.addNodos(5,7,2);
        g.addNodos(5,3,3);
        g.addNodos(5,4,4);
        g.addNodos(5,1,8);
        g.addNodos(5,4,9);

        g.addNodos(6,4,2);
        g.addNodos(6,2,3);
        g.addNodos(6,1,4);
        g.addNodos(6,6,8);
        g.addNodos(6,3,9);

        g.addNodos(7,6,2);
        g.addNodos(7,4,3);
        g.addNodos(7,5,4);
        g.addNodos(7,3,8);
        g.addNodos(7,3,9);

        g.addNodos(8,1,5);
        g.addNodos(8,6,6);
        g.addNodos(8,3,7);
        g.addNodos(8,3,10);

        g.addNodos(9,4,5);
        g.addNodos(9,3,6);
        g.addNodos(9,3,7);
        g.addNodos(9,4,10);

        g.ImprimirMatrizAdyacencia();



    }
}
