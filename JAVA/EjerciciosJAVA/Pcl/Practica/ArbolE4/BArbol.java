package ArbolE4;

import javafx.scene.control.TreeItem;

public class BArbol {

    private NodoArbol primero;
    private int numElementos;
    private int prof;

    public BArbol() {
        this(null);
    }

    public BArbol(NodoArbol primero) {
        this.primero = primero;
        numElementos = 0;
        prof = 0;
    }

    /**
     * devuelve el número de elementos del árbol.
     * @return
     */
    public int getNumElementos(){
        cantidad(primero);
        return this.numElementos;
    }

    /**
     * devuelve la profundidad del árbol.
     * @return
     */
    public int getProfundidad(){
        prof = 0;
        getProfundidad(primero, 1);
        return prof;
    }

    private void getProfundidad(NodoArbol prim, int i) {
        if (prim != null)
        {
            getProfundidad (prim.getIzq(),i+1);
            if (i > prof)
                prof = i;
            getProfundidad (prim.getDer(),i+1);
        }
    }

    /**
     * devuelve VERDADERO si el árbol es un nodo hoja, FALSO en caso
     contrario.
     * @return
     */
    public boolean isHoja(){
        if (primero.getIzq() == null)
            return true;

        if (primero.getDer() == null)
            return true;

        return false;
    }

    /**
     * devuelve el valor del camino con valor mínimo en el árbol.
         Recuerde que el valor de un camino es la suma de los valores de sus nodos.
     * @return
     */
    public int caminoMinimo(){
        NodoArbol aux = primero;
        int caminoMin = 0;

        while (aux != null){
            caminoMin += (Integer)aux.getDato();
            aux = aux.getIzq();
        }
        return caminoMin;
    }

    /**
     * devuelve una copia del árbol
     * @return
     */
    public BArbol copia(){
        return BArbol.this;
    }

    /**
     * devuelve VERDADERO si son iguales, FALSO en
        caso contrario.
     * @param arbol
     * @return
     */
    public boolean sonIguales(BArbol arbol){
        boolean igual = true;
        NodoArbol nodoArbol = primero;
        NodoArbol nodoArbol2 = arbol.primero;

        Cola thisNodos = getRecAnchura(nodoArbol);
        Cola itNodos = getRecAnchura(nodoArbol2);

        int dato1, dato2;

        while (thisNodos.vacia() != true  && igual != false ) {
            dato1 = (Integer) thisNodos.desencolar();
            dato2 = (Integer) itNodos.desencolar();

            if (dato1 == dato2) {
                igual = true;
            } else {
                igual = false;
            }
        }
        return igual;
    }

    /**
     * devuelve el mayor valor de los nodos del árbol.
     * @return
     */
    public Object maxNodo(){
        NodoArbol actual = primero;
        if (actual != null){
            while (actual.getDer() != null){
                actual = actual.getDer();
            }
        }

        return actual.getDato();
    }

    /**
     *  devuelve el menor valor de los hojas del árbol.
     * @return
     */
    public Object minNodo(){
        NodoArbol actual = primero;
        if (actual != null){
            while (actual.getIzq() != null){
                actual = actual.getIzq();
            }
        }

        return actual.getDato();
    }

    /**
     * devuelve el mayor valor de los hojas del árbol.
     * @return
     */
    public Object maxHoja(){
        NodoArbol actual = primero;
        if (actual != null){
            while (actual.getDer().getDer() != null){
                actual = actual.getDer();
            }
        }

        return actual.getDato();
    }

    public Object minHoja(){
        NodoArbol actual = primero;
        if (actual != null){
            while (actual.getIzq().getIzq() != null){
                actual = actual.getIzq();
            }
        }

        return actual.getDato();
    }

    /**
     * devuelve VERDADERO si el valor de “e” coincide con el de
        algún nodo del árbol, FALSO en caso contrario.
     * @param e
     * @return
     */

    public boolean esEn(Object e){
        NodoArbol rec = primero;

        while(rec != null){
           if((Integer) e == (rec.getDato())){
               return true;
           }else{
               if ((Integer)e < (Integer) rec.getDato()){
                   rec = rec.getIzq();
               }else {
                   rec = rec.getDer();
               }
           }
        }
        return false;
    }

    public void recPreOrd(NodoArbol nodo){

        if (nodo != null){
            System.out.println(nodo.getDato()+" ");
            recPreOrd(nodo.getIzq());
            recPreOrd(nodo.getDer());
        }
    }


    public void tString() {

        recPreOrd(primero);
    }

    public void recorridoAnchura(NodoArbol raiz){
        NodoArbol aux;
        Cola cola = new Cola();
        cola.encolar(raiz);

        while (cola.vacia() != true){

            aux = (NodoArbol) cola.desencolar();

            System.out.print(aux.getDato()+" ");

            if ((aux).getIzq() != null){
                cola.encolar(aux.getIzq());
            }
            if (aux.getDer() != null){
                cola.encolar(aux.getDer());
            }
        }
    }

    public Cola getRecAnchura(NodoArbol raiz){
        NodoArbol aux;
        Cola cola = new Cola();
        Cola cola1 = new Cola();

        cola.encolar(raiz);

        while (cola.vacia() != true){

            aux = (NodoArbol) cola.desencolar();

            cola1.encolar(aux.getDato());

            if ((aux).getIzq() != null){
                cola.encolar(aux.getIzq());
            }
            if (aux.getDer() != null){
                cola.encolar(aux.getDer());
            }
        }
        return cola1;
    }

    private void cantidad(NodoArbol reco)
    {
        if (reco!=null)
        {
            this.numElementos++;
            cantidad(reco.getIzq());
            cantidad(reco.getDer());
        }
    }
/*
    public void imprimirNivel(NodoArbol raiz, int nivel) {

        if (nivel != 0){//raiz != null){


            imprimirNivel(raiz.getIzq(),nivel-1);

            System.out.print(raiz.getDato()+" ");


            imprimirNivel(raiz.getDer(),nivel-1);

        }
    }

    public void imprimirNivel(int nivel) {
        imprimirNivel(primero,nivel);
    }

    */

    public void eliminarHoja(int valor){
            NodoArbol actual = primero;
            boolean salir = false;
            while ((actual.getIzq() != null || actual.getDer() != null) && salir != true ){
                //if ((Integer)actual.getDato() == valor){
                    //if (actual.getDer()== null && actual.getIzq() == null){
                    //    actual = null;
                    //}
                if (((Integer)(actual.getIzq().getDato())) == valor){
                    actual.setIzq(null);
                    salir = true;
                   // break;
                }else
                    if (((Integer)(actual.getDer().getDato())) == valor){
                    actual.setDer(null);
                    salir = true;
                   // break;
                }else
                    if (valor < (Integer)actual.getDato()){
                    actual = actual.getIzq();
                }else
                    if (valor > (Integer)actual.getDato()){
                    actual = actual.getDer();
                }

            }
    }
/*
    public boolean dfs( int valor){
        boolean igual = false;
       return dfs(primero,igual,valor);
    }

    public boolean dfs(NodoArbol nodo,boolean igual, int valor){


        if (nodo != null && igual != true){

            dfs(nodo.getIzq(),igual ,valor);
            if ((Integer)nodo.getDato() == valor) {
                igual = true;

            }
            dfs(nodo.getDer(),igual ,valor);


        }return igual;
    }
    */
}
