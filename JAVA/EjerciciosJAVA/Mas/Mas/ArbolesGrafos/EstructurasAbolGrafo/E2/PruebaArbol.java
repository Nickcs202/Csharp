package Arbol.E1.E2;

/**
 * Created by nux on 26/07/17.
 */
public class PruebaArbol {

    public static void main(String[] ar){
        Arbol a = new Arbol();

        a.insertar(4);
        a.insertar(2);
        a.insertar(5);
        a.insertar(1);
        a.insertar(3);
        a.insertar(6);
        //a.preOrden();
        a.imprimePorNivel();
    }

}
