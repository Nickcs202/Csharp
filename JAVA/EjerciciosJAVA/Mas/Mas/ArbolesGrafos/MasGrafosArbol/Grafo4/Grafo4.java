package Grafo4;

public class Grafo4 {

    private ListaGrafo4 lisatNodos;

    public Grafo4() {
        this(null);
    }

    public Grafo4(ListaGrafo4 lisatNodos) {
        this.lisatNodos = new ListaGrafo4();
    }

     public void bfs(NodoGrafo4 raiz){

        NodoGrafo4 aux = new NodoGrafo4();
        ListaGrafo4 cola = new ListaGrafo4();
        cola.add(raiz);
        while (cola.getTamanio() > 0){
            aux.setDato(cola.desencolar().getDato()+"");
            //aux = (cola.desencolar());
            System.out.println(">"+aux.getDato());

            aux.setVisitado(true);
            for (int i = 0; i <aux.getListavecinos().getTamanio(); i++) {
                if ((aux.getListavecinos().getNodo(i).isVisitado()) != true && (cola.contains(aux.getListavecinos().getNodo(i))) != true ){
                    cola.add(aux.getListavecinos().getNodo(i));
                }
            }
        }
     }
}
