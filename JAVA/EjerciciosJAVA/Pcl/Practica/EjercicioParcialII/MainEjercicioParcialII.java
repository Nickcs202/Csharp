package EjercicioParcialII;

public class MainEjercicioParcialII {

    public static void main(String[] args){

        NodoArbolP nodo1 = new NodoArbolP("Mis Archivos");
        NodoArbolP nodo2 = new NodoArbolP("CarpetaA");
        NodoArbolP nodo3 = new NodoArbolP("A.txt");
        NodoArbolP nodo4 = new NodoArbolP("CarpetaB");
        NodoArbolP nodo5 = new NodoArbolP("B.txt");
        NodoArbolP nodo6 = new NodoArbolP("BB.txt");
        NodoArbolP nodo7 = new NodoArbolP("CarpetaC");
        NodoArbolP nodo8 = new NodoArbolP("carpetaD");
        NodoArbolP nodo9 = new NodoArbolP("D.txt");
        NodoArbolP nodo10 = new NodoArbolP("DD.txt");
        NodoArbolP nodo11 = new NodoArbolP("CarpetaE");
        NodoArbolP nodo12 = new NodoArbolP("E.txt");
        NodoArbolP nodo13 = new NodoArbolP("EE.txt");

        nodo1.setIzq(nodo2);
        nodo1.setDer(nodo7);

        nodo2.setIzq(nodo3);
        nodo2.setDer(nodo4);

        nodo7.setIzq(nodo8);
        nodo7.setDer(nodo11);

        nodo4.setIzq(nodo5);
        nodo4.setDer(nodo6);

        nodo8.setIzq(nodo9);
        nodo8.setDer(nodo10);

        nodo11.setIzq(nodo12);
        nodo11.setDer(nodo13);

        ArbolP a = new ArbolP();
        System.out.println("Creado: "+a.crearEstructura(nodo1));
        a.imprimirCarpetas();
        a.imprimirCarpeta("CarpetaB");
        a.eliminarArchivo("E.txt");
        a.imprimirCarpetas();


    }

}
