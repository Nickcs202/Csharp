package TAD;

public class Cola {

    private Nodo raiz;
    private Nodo fondo;
    private int tamanio;

    public Cola(){
        this.raiz=null;
        this.fondo=null;
    }

    public void setRaiz(Nodo r){
        this.raiz=r;
    }
    public void setFondo(Nodo f){
        fondo=f;
    }
    public Object getRaiz(){
        return this.raiz;
    }
    public Object getFondo(){
        return this.fondo;
    }
    public boolean isVacia(){
        if(raiz==null)
            return true;

        else
            return false;
    }

    public void encolar(Object dato){
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);

        if(isVacia()){
            raiz = nuevo;
            fondo = nuevo;
        }else {
            fondo.setSiguienteNodo(nuevo);
            fondo = nuevo;
        }
        tamanio++;
    }
    public Object desEncolar(){
        Object dato = raiz.getDato();

        if(isVacia()){

            if(raiz == fondo){
                raiz = null;
                fondo = null;
                return dato;
            }else {
                raiz = raiz.getSiguienteNodo();
                tamanio--;
                return dato;
            }
        }else {
            return null;
        }
    }
    public int tamanio(){
        int n = 0;
        Nodo actual= raiz;
        while(actual != null){
            n++;
            actual = actual.getSiguienteNodo();
        }
        return n;
    }
    public void imprimir(){
        Nodo actual = raiz;
        while(actual != null){
            System.out.println(" "+ actual.getDato());
            actual = actual.getSiguienteNodo();
        }
    }

    public int tamañio(){
        return this.tamanio;
    }
}
