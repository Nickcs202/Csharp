public class ListaCircular {
    
    class Nodo {
        int info;
        Nodo ant,sig;
    }
    
    private Nodo raiz;
    
    public ListaCircular () {
        raiz=null;
    }
              
    public void insertarPrimero(int x) {
        Nodo nuevo=new Nodo();
        nuevo.info=x;
        if (raiz==null) {
            nuevo.sig=nuevo;
            nuevo.ant=nuevo;            
            raiz=nuevo;
        } else {
            Nodo ultimo=raiz.ant;
            nuevo.sig=raiz;
            nuevo.ant=ultimo;
            raiz.ant=nuevo;
            ultimo.sig=nuevo;
            raiz=nuevo;
        }
    }
    
    public void insertarUltimo(int x) {
        Nodo nuevo=new Nodo();
        nuevo.info=x;
        if (raiz==null) {
            nuevo.sig=nuevo;
            nuevo.ant=nuevo;            
            raiz=nuevo;
        } else {
            Nodo ultimo=raiz.ant;
            nuevo.sig=raiz;
            nuevo.ant=ultimo;
            raiz.ant=nuevo;
            ultimo.sig=nuevo;
        }
    }    
    
    public boolean vacia ()
    {
        if (raiz == null)
            return true;
        else
            return false;
    }
    
    public void imprimir ()
    {
        if (!vacia()) {
            Nodo reco=raiz;
            do {
                System.out.print (reco.info + "-");
                reco = reco.sig;                
            } while (reco!=raiz);
            System.out.println();
        }    
    }
    
    public int cantidad ()
    {
        int cant = 0;
        if (!vacia()) {
            Nodo reco=raiz;
            do {
                cant++;
                reco = reco.sig;                
            } while (reco!=raiz);
        }    
        return cant;
    }
    
    public void borrar (int pos)
    {
        if (pos <= cantidad ())    {
            if (pos == 1) {
                if (cantidad()==1) {
                    raiz=null;
                } else {
                    Nodo ultimo=raiz.ant;    
                    raiz = raiz.sig;
                    ultimo.sig=raiz;
                    raiz.ant=ultimo;
                } 
            } else {
                Nodo reco = raiz;
                for (int f = 1 ; f <= pos - 1 ; f++)
                    reco = reco.sig;
                Nodo anterior = reco.ant;
                reco=reco.sig;
                anterior.sig=reco;
                reco.ant=anterior;
            }
        }
    }    
    
    public static void main(String[] ar) {
        ListaCircular lc=new ListaCircular();
        lc.insertarPrimero(100);
        lc.insertarPrimero(45);
        lc.insertarPrimero(12);
        lc.insertarPrimero(4);
        System.out.println("Luego de insertar 4 nodos al principio");
        lc.imprimir();
        lc.insertarUltimo(250);
        lc.insertarUltimo(7);
        System.out.println("Luego de insertar 2 nodos al final");
        lc.imprimir();
        System.out.println("Cantidad de nodos:"+lc.cantidad());
        System.out.println("Luego de borrar el de la primer posición:");
        lc.borrar(1);
        lc.imprimir();
        System.out.println("Luego de borrar el de la cuarta posición:");
        lc.borrar(4);
        lc.imprimir();                
    }
}