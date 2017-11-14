package EjercicioGrafo4;

public class NodoEjercicio4 {

    private int dato;
    private NodoEjercicio4[] vecinos;
    private boolean vicitado;

    public NodoEjercicio4() {
        this(0,null,false);
    }

    public NodoEjercicio4(int dato) {
        this(dato,null,false);
    }

    public NodoEjercicio4(int dato, NodoEjercicio4[] vecinos, boolean vicitado) {
        this.dato = dato;
        this.vecinos = vecinos;
        this.vicitado = vicitado;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoEjercicio4[] getVecinos() {
        return vecinos;
    }

    public void setVecinos(NodoEjercicio4[] vecinos) {
        this.vecinos = vecinos;
    }

    public boolean isVicitado() {
        return vicitado;
    }

    public void setVicitado(boolean vicitado) {
        this.vicitado = vicitado;
    }
}
