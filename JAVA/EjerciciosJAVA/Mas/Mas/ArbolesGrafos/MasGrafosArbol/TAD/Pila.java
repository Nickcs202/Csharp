package TAD;

public class Pila {

    private Nodo raiz;

    public Pila(){
        this.raiz=null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public boolean isVacia(){
        if(raiz==null){

            return true;
        }else
            return false;
    }

    public void agregar(Object dato){
        Nodo nodo=new Nodo();
        nodo.setDato(dato);
        if(isVacia()){
            nodo.setSiguienteNodo(null);
            raiz=nodo;
        }else{
            nodo.setSiguienteNodo(raiz);
            raiz=nodo;
        }
    }

    public Object desapilar(){
        Object dato;
        if(isVacia()==false){
            dato = raiz.getDato();
            raiz=raiz.getSiguienteNodo();
            return dato;
        }else
            return null;
    }
    public int tamanio(){
        int n=0;
        Nodo actual= raiz;
        while (actual != null) {
            n++;
            actual=actual.getSiguienteNodo();
        }
        return n;
    }

    public void imprimir(){
        Nodo actual = raiz;
        while(actual != null){
            System.out.println(" "+actual.getDato());
            actual=actual.getSiguienteNodo();
        }
    }

}
