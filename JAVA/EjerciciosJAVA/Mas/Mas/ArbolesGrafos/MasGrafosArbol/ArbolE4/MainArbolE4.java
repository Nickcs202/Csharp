package ArbolE4;

public class MainArbolE4 {

    /**
     * Ejercicio​ ​ 4:
Utilizando​ ​ la​ ​ estructura​ ​ de​ ​ un​ ​ nodo​ ​ para​ ​ crear​ ​ un​ ​ Árbol​ ​ Binario,​ ​ crear​ ​ una​ ​ clase​ ​ BArbol​ ​ (que​ ​ utilice​ ​ dicho
Nodo​ ​ internamente,​ ​ similar​ ​ a ​ ​ listas,​ ​ pilas​ ​ y ​ ​ colas)​ ​ con​ ​ los​ ​ siguientes​ ​ métodos:
BARBOL
-​ ​ NodoArbol​ ​ primero​​ ​ //​ ​ define​ ​ un​ ​ nodo​ ​ árbol​ ​ inicial
+​ ​ Barbol(NodoArbol​ ​ raiz)​​ ​ //​ ​ permite​ ​ asignarle​ ​ una​ ​ árbol​ ​ a ​ ​ partir​ ​ de​ ​ su​ ​ nodo​ ​ raiz.
+​ ​ int​ ​ getNumElementos()​​ ​ //​ ​ devuelve​ ​ el​ ​ número​ ​ de​ ​ elementos​ ​ del​ ​ árbol.
+​ ​ int​ ​ getProfundidad()​​ ​ //​ ​ devuelve​ ​ la​ ​ profundidad​ ​ del​ ​ árbol.
+​ ​ Boolean​ ​ esHoja()​​ ​ //​ ​ devuelve​ ​ VERDADERO​ ​ si​ ​ el​ ​ árbol​ ​ es​ ​ un​ ​ nodo​ ​ hoja,​ ​ FALSO​ ​ en​ ​ caso​ ​ contrario.
+​ ​ int​ ​ caminoMinimo()​​ ​ //​ ​ devuelve​ ​ el​ ​ valor​ ​ del​ ​ camino​ ​ con​ ​ valor​ ​ mínimo​ ​ en​ ​ el​ ​ árbol.​ ​ Recuerde​ ​ que​ ​ el
valor​ ​ de​ ​ un​ ​ camino​ ​ es​ ​ la​ ​ suma​ ​ de​ ​ los​ ​ valores​ ​ de​ ​ sus​ ​ nodos.
+​ ​ BArbol​ ​ copia()​​ ​ //​ ​ devuelve​ ​ una​ ​ copia​ ​ del​ ​ árbol
+​ ​ Boolean​ ​ sonIguales(BARBOL​ ​ s)​​ ​ //​ ​ devuelve​ ​ VERDADERO​ ​ si​ ​ son​ ​ iguales,​ ​ FALSO​ ​ en​ ​ caso
contrario.
+​ ​ Object​ ​ MaxNodo()​​ ​ //​ ​ devuelve​ ​ el​ ​ mayor​ ​ valor​ ​ de​ ​ los​ ​ nodos​ ​ del​ ​ árbol.
+​ ​ Object​ ​ MinNodo()​​ ​ //​ ​ devuelve​ ​ el​ ​ menor​ ​ valor​ ​ de​ ​ los​ ​ nodos​ ​ del​ ​ árbol.
+​ ​ Object​ ​ MaxHoja()​​ ​ //​ ​ devuelve​ ​ el​ ​ mayor​ ​ valor​ ​ de​ ​ las​ ​ hojas​ ​ del​ ​ árbol.
+​ ​ Object​ ​ MinHoja()​​ ​ //​ ​ devuelve​ ​ el​ ​ menor​ ​ valor​ ​ de​ ​ los​ ​ hojas​ ​ del​ ​ árbol.
+​ ​ Object​ ​ MaxDelNivel(int​ ​ nivel)​​ ​ //​ ​ devuelve​ ​ el​ ​ mayor​ ​ valor​ ​ de​ ​ las​ ​ nodos​ ​ de​ ​ un​ ​ nivel​ ​ dado​ ​ del​ ​ árbol.
+​ ​ Object​ ​ MinDelNivel(int​ ​ nivel)​​ ​ //​ ​ devuelve​ ​ el​ ​ menor​ ​ valor​ ​ de​ ​ las​ ​ nodos​ ​ de​ ​ un​ ​ nivel​ ​ dado​ ​ del​ ​ árbol.
+​ ​ Boolean​ ​ estaEn(Object​ ​ e)​​ ​ //​ ​ devuelve​ ​ VERDADERO​ ​ si​ ​ el​ ​ valor​ ​ de​ ​ “e”​ ​ coincide​ ​ con​ ​ el​ ​ de​ ​ algún​ ​ nodo
del​ ​ árbol,​ ​ FALSO​ ​ en​ ​ caso​ ​ contrario.
+​ ​ toString()​​ ​ //​ ​ imprime​ ​ los​ ​ valores​ ​ del​ ​ árbol​ ​ en​ ​ pre-orden.
     * @param args
     */

    public static void main(String[] args){

        NodoArbol nodo1 = new NodoArbol(4);
        //nodo1.setDato();
        NodoArbol nodo2 = new NodoArbol(2);
        NodoArbol nodo3 = new NodoArbol(5);
        NodoArbol nodo4 = new NodoArbol(1);
        NodoArbol nodo5 = new NodoArbol(3);
        NodoArbol nodo6 = new NodoArbol(6);

        nodo1.setIzq(nodo2);
        nodo1.setDer(nodo3);

        nodo2.setIzq(nodo4);
        nodo2.setDer(nodo5);

        nodo3.setDer(nodo6);

        BArbol arbol = new BArbol(nodo1);

        arbol.tString();
        System.out.println(arbol.esEn(8));

        arbol.recorridoAnchura(nodo1);

        System.out.println("Numero elementos = "+arbol.getNumElementos());

        System.out.println("Profundidad "+arbol.getProfundidad());
        System.out.println(">>MAYOR = "+arbol.maxNodo());
        System.out.println("Eleiminar 3");
        arbol.eliminarHoja(1);
        arbol.recorridoAnchura(nodo1);


    }
}
