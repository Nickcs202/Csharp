package EjercicioParcialII;

public class ArbolP {

    private NodoArbolP raiz;

    public ArbolP() {
        this(null);
    }

    public ArbolP(NodoArbolP raiz) {
        this.raiz = raiz;
    }

    public boolean crearEstructura(NodoArbolP raiz){
        boolean creado = false;
        if (raiz != null){
            this.raiz = raiz;
            creado = true;
        }

        return creado;
    }

    public void imprimirCarpetas(){
        imprimirCarpetas(raiz);
    }

    public void imprimirCarpetas( NodoArbolP raiz){
        NodoArbolP aux;
        Cola cola = new Cola();
        cola.encolar(raiz);
        while (cola.vacia() != true){
            aux = (NodoArbolP) cola.desencolar();
            System.out.println(aux);

            if (aux.getIzq() != null){
                cola.encolar(aux.getIzq());
            }
            if (aux.getDer() != null){
                cola.encolar(aux.getDer());
            }

        }
    }
    public void imprimirCarpeta( String dato){
        NodoArbolP aux;
        boolean encontrado = false;
        Cola cola = new Cola();
        cola.encolar(this.raiz);
        while (cola.vacia() != true && encontrado != true){
            aux = (NodoArbolP) cola.desencolar();
            if (aux.getDato() == dato) {
                System.out.println("Los archivos de la carpeta "+aux+" son: ");
                System.out.println(aux.getIzq()+"\n"+aux.getDer());
                encontrado = true;
            }

            if (aux.getIzq() != null){
                cola.encolar(aux.getIzq());
            }
            if (aux.getDer() != null){
                cola.encolar(aux.getDer());
            }
        }//FinWhile
        if (encontrado == false){
            System.out.println("Archivo no encontrado");
        }
    }

    public void eliminarArchivo( String dato){
        NodoArbolP aux = this.raiz;
        boolean encontrado = false;
        String hijo = "";
        Cola cola = new Cola();
        cola.encolar(this.raiz);
        while (cola.vacia() != true && encontrado != true){
            aux = (NodoArbolP) cola.desencolar();
            if (aux.getDer() != null || aux.getIzq() != null) {


                if (aux.getIzq().getDato() == dato) {
                    encontrado = true;
                    hijo = "izq";
                }
                if (aux.getDer().getDato() == dato) {
                    encontrado = true;
                    hijo = "der";
                }
            }
            if (aux.getIzq() != null){
                cola.encolar(aux.getIzq());
            }
            if (aux.getDer() != null){
                cola.encolar(aux.getDer());
            }
        }//FinWhile
        if (encontrado){
            if (hijo == "izq"){
                aux.setIzq(null);
            }else
                if (hijo == "der") {
                    aux.setDer(null);
                }
        }else {
            System.out.println("Archivo no encontrado");
        }
    }

}



/**
 * Clase cola.
 */
class Cola {

    private Nodo primero;
    private Nodo ultimo;
    private int tamaño;

    public Cola() {
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    // enqueue
    public void encolar(Object valor) {

        Nodo nuevo = new Nodo(valor);

        if (vacia()) {
            this.primero = ultimo = nuevo;
        } else {

            this.ultimo.siguiente = nuevo;
            this.ultimo = nuevo;
        }
        this.tamaño++;
    }

    // dequeue
    public Object desencolar() {

        Nodo aux = this.primero;

        if (aux.siguiente != null) {
            this.primero = this.primero.siguiente;
            this.tamaño--;
        }else
            this.primero = ultimo = null;


        return aux.valor;

    }

}

class Nodo {

    public Object valor;
    public Nodo siguiente;

    public Nodo() {
        this(null);
    }

    public Nodo(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    // toString() retorna el valor del nodo.
    @Override
    public String toString() {
        return this.valor + "";
    }

}
