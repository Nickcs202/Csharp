package TAD;

public class Lista {

    private Nodo primerNodo;
    //private Nodo ultimoNodo;
    private String nombre;
    private int tamanio;

    public Lista(){
        this("lista");
        this.tamanio = 0;
    }

    public Lista(String nombre) {
        this.primerNodo = null;
        this.nombre = nombre;
    }

    public boolean isVacia(){
        return primerNodo == null;
    }

    public void agregar(Object dato){
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);

        if(isVacia()){
            //nuevo.setSiguiNodo(null);
            primerNodo = nuevo;
            tamanio++;
        }else{
            Nodo aux = primerNodo;

            while (aux.getSiguienteNodo() != null) {
                aux = (aux.getSiguienteNodo());
            }
            aux.setSiguienteNodo(nuevo);
            aux = nuevo;
            tamanio++;
        }
    }

    public int getTamanio() {
        return tamanio;
    }

    public void imprimir(){

        if (isVacia()) {
            System.out.println("ListaSimple vacia");
        }else {
            Nodo aux = primerNodo;
            System.out.println(aux.getDato());
            while (aux.getSiguienteNodo() != null) {
                //System.out.println(aux.getDato());
                aux = (aux.getSiguienteNodo());
                System.out.println(aux.getDato());
            }

        }
    }

    public Object getDato(int pos) {

        Nodo aux = primerNodo;
        int cont = 0;
        while ( cont != pos) {

            aux = (aux.getSiguienteNodo());
            cont ++;
        }
        return aux.getDato();
    }

    public void eliminarElemento(int pos){
        Nodo aux = primerNodo;
        Nodo aux2;

        if(pos != 0){
            pos = pos - 1;

            int cont = 0;
            while (cont != pos) {
                aux = aux.getSiguienteNodo();
                cont++;
            }
            aux2 = aux.getSiguienteNodo();
            aux.setSiguienteNodo(aux2.getSiguienteNodo());
        }else{
            aux2 = aux.getSiguienteNodo();
            primerNodo = aux2;
        }
    }

}
