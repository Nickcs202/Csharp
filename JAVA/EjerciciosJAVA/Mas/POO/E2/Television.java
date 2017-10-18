package POO.E2;

public class Television extends Electrodomestico{

    private double resolucion;
    private boolean sintonizador;

    private static final double RESOLUCIONPORDEFECTO = 20.00;
    private static final boolean SINTONIZADORPORDEFEWCTO = false;

    public Television() {
        super();
        this.resolucion = RESOLUCIONPORDEFECTO;
        this.sintonizador = SINTONIZADORPORDEFEWCTO;
    }

    public Television(double precioBase, String color , char consumoEnergetico , double resolucion) {
        this(precioBase,color,consumoEnergetico,resolucion,SINTONIZADORPORDEFEWCTO);
    }

    public Television(double precioBase, String color, char consumoEnergetico, double resolucion, boolean sintonizador) {
        super(precioBase, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    @Override
    public double precioFinal(int tamaño) {
        double precio = 0.0;
        if (this.getResolucion() > 40){
            precio += ((precio * 30) / 100);
        }

        precio += super.precioFinal(tamaño);

        return precio;
    }
}
