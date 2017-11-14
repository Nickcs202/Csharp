package Grafo5;

public class Grafo5 {

       private ListaDoble lisatNodos;

    public Grafo5() {
        this(null);
    }

    public Grafo5(ListaDoble lisatNodos) {
        this.lisatNodos = new ListaDoble();
    }

     public void bfs(NodoGrafo raiz){

        NodoGrafo aux = new NodoGrafo();
         String aux2;
        Cola2 cola = new Cola2();
        cola.insertar(raiz);
        while (cola.vacia() != true){
            //aux.setDato(cola.desencolar().getDato()+"");
            //aux2 = (cola.extraer());
            aux = (NodoGrafo) cola.extraer();
            System.out.println(">"+aux);

            aux.setVisitado(true);
            int i = 0;
          // while (aux.tamanioListaVecino()>0){//getListavecinos().vacia() != true) {
               /*
                if (){
                    cola.add(aux.getListavecinos().getNodo(i));
                }*/
            for (int j = 0; j < aux.tamanioListaVecino(); j++) {


               cola.insertar(aux.getListavecinos(j));//aux.getListavecinos().getNodo(i));
              //  i++;
            }
        }
     }

}
