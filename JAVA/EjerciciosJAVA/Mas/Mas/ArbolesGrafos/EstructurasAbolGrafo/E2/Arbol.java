package Arbol.E1.E2;

/**
 * Created by nux on 26/07/17.
 */
public class Arbol {

    private NodoArbol raiz;

    public Arbol() {
        this.raiz = null;
    }


    public boolean isVacio(){
        if(raiz == null){
            return  true;
        }else
            return  false;
    }
    public  boolean isExiste(int dato){
        NodoArbol recorrido = new NodoArbol();
        recorrido = raiz;
        while (recorrido != null){
            if(recorrido.getDato() == dato){
                return  true;
            }else
                if (dato < recorrido.getDato()){
                    recorrido = recorrido.getIzq();
                }else {
                    recorrido = recorrido.getDer();
                }
        }
        return  false;
    }
    public void insertar(int dato){
        NodoArbol nuevo = new NodoArbol();
        nuevo.setDato(dato);


   //     if (isExiste(dato) == false){

           // if (getRaiz() == null){
        if (raiz == null){
               raiz = nuevo;
                // setRaiz(nuevo);
            }else {
                NodoArbol actual = new NodoArbol();
                NodoArbol recorrido = new NodoArbol();
            recorrido = raiz;

                while (recorrido != null){
                    actual = recorrido;
                    if (dato < recorrido.getDato())
                        recorrido = recorrido.getIzq();

                    else
                        recorrido =  recorrido.getDer();
                }
                if(dato < actual.getDato()){
                    actual.setIzq(nuevo);
                }else
                    actual.setDer(nuevo);
            }

      //  }
    }
    public void  preOrden(NodoArbol rec){

        if(rec != null){
System.out.print(rec.getDato()+" ");
            preOrden(rec.getIzq());
            preOrden(rec.getDer());//System.out.print(rec.getDato()+" a");
           // System.out.print(rec.getIzq().getDato()+" "+rec.getDer().getDato());
        }

    }
    public void  preOrden(){
        System.out.print(" Pre orden: ");
        preOrden(raiz);
    }
    public void imprimePorNivel(){
        NodoArbol rec = new NodoArbol();
        rec = raiz;
        System.out.print(rec.getDato()+" ");
        while (rec != null){//(rec.getIzq() == null || rec.getDer() == null){
            rec = rec.getIzq();
            System.out.print(rec.getDato()+" ");
            rec = rec.getDer();
            System.out.print(rec.getDato()+" ");
        }
    }
}
