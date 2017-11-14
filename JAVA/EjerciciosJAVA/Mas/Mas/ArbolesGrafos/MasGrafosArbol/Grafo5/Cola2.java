package Grafo5;

public class Cola2 {

        class NodoCola2 {
            Object info;
            NodoCola2 sig;
        }

        private NodoCola2 raiz,fondo;

        Cola2() {
            raiz=null;
            fondo=null;
        }

        boolean vacia (){
            if (raiz == null)
                return true;
            else
                return false;
        }

        void insertar (Object info)
        {
           NodoCola2 nuevo;
            nuevo = new NodoCola2();
            nuevo.info = info;
            nuevo.sig = null;
            if (vacia ()) {
                raiz = nuevo;
                fondo = nuevo;
            } else {
                fondo.sig = nuevo;
                fondo = nuevo;
            }
        }

        Object extraer ()
        {
            if (!vacia ())
            {
                Object informacion = raiz.info;
                if (raiz == fondo){
                    raiz = null;
                    fondo = null;
                } else {
                    raiz = raiz.sig;
                }
                return informacion;
            } else
                return Integer.MAX_VALUE;
        }

        public void imprimir() {
            NodoCola2 reco=raiz;
            System.out.println("Listado de todos los elementos de la cola.");
            while (reco!=null) {
                System.out.print(reco.info+"-");
                reco=reco.sig;
            }
            System.out.println();
        }

    }
