package EjercicioParcialII;

public class NodoGrafoP {

    private Vecino[] vecinos;
    private int cantVecinos;
    private boolean visitado;

    public NodoGrafoP() {
        this(null,0,false);
    }

    public NodoGrafoP(Vecino[] vecinos, int cantVecinos, boolean visitado) {
        this.vecinos = vecinos;
        this.cantVecinos = cantVecinos;
        this.visitado = visitado;
    }

    public Vecino[] getVecinos() {
        return vecinos;
    }

    public void setVecinos(Vecino[] vecinos) {
        this.vecinos = vecinos;
    }

    public int getCantVecinos() {
        return cantVecinos;
    }

    public void setCantVecinos(int cantVecinos) {
        this.cantVecinos = cantVecinos;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }


}

class Vecino{

    private String nombre;
    private int distancia;

    public Vecino() {
        this(null,0);
    }

    public Vecino(String nombre) {
        this(nombre,0);
    }

    public Vecino(String nombre, int distancia) {
        this.nombre = nombre;
        this.distancia = distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
}