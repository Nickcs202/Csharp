package TAD.EjercicioEstructuraS;

public class E5 {

    public static void main(String[] arg){
     Cola cola = new Cola();
     int hora = 0;
     int minuto = 2;
     int totalMinutos = 60 * 10;
     int contador = 0, contadorPersona;

    // cola.encolar("1");
    // cola.encolar("1");
     for (int i = 2; i <= totalMinutos; i = i+2 ){
         //cola.encolar("Hora= "+hora+":"+minuto);
         minuto+=2;
         if (minuto == 60) {
             hora++;
             minuto = 0;
         }
/*
         if (i % 4 == 0 && i != 2) {
             if (!cola.isVacia())
             cola.desencolar();
         }*/

        cola.encolar("Hora= "+hora+":"+minuto);
         if (i % 4 == 0 )
             cola.desencolar();

     }

     cola.imprimir();

     System.out.println(cola.isVacia());
     System.out.println("TamanioCola: "+cola.getTamanio());
     System.out.println(">"+contador);
     System.out.println(cola.desencolar().toString());
     System.out.println(cola.desencolar().toString());
     System.out.println(cola.desencolar().toString());

    }
}

class NodoDoble{

    private NodoDoble siguiente;
    private NodoDoble anterior;
    private Object dato;

    public NodoDoble() {
        this.siguiente = null;
        this.anterior = null;
        this.dato = null;
    }

    public NodoDoble(NodoDoble siguiente, NodoDoble anterior, Object dato) {
        this.siguiente = siguiente;
        this.anterior = anterior;
        this.dato = dato;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "NodoDoble{" +
                "dato=" + dato +
                '}';
    }
}

class Cola{

    private NodoDoble primero;
    private NodoDoble ultimo;
    private int tamanio;

    public Cola() {
        primero = null;
        ultimo = null;
        tamanio = 0;
    }

    public Cola(NodoDoble primero, NodoDoble ultimo, int tamanio) {
        this.primero = primero;
        this.ultimo = ultimo;
        this.tamanio = tamanio;
    }

    public boolean isVacia(){
        return primero == null;
    }

    public void encolar(Object dato){
        NodoDoble nuevo = new NodoDoble();
        nuevo.setDato(dato);

        if (isVacia()){
            primero = ultimo = nuevo;
        }else {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }
        tamanio++;
    }

    public int getTamanio(){
        return this.tamanio;
    }

    public Object desencolar(){
        NodoDoble aux = new NodoDoble();
        NodoDoble aux2 = new NodoDoble();

        if (isVacia()){
            return null;
        }else {
            aux2 = ultimo.getAnterior();
            aux = ultimo;
            aux2.setSiguiente(null);
            ultimo = aux2;

            tamanio--;
        }

        return aux;
    }
    public void imprimir(){
       NodoDoble aux = this.primero;

     //  while (aux.getSiguiente() != null){
        for (int i =0; i<tamanio;i++){
           System.out.println(aux.getDato());
           aux = aux.getSiguiente();
       }

    }

}
