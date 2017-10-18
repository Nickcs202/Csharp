package POO.E2;

public class Lavarropas extends Electrodomestico {

    private double carga;

    private static final double CARGAPORDEFECTO = 5.00;

    public Lavarropas() {
        super();
        this.carga = CARGAPORDEFECTO;
    }

    public Lavarropas(double precioBase, String color, char consumoEnergetico) {
        this(precioBase, color,consumoEnergetico,CARGAPORDEFECTO);
    }

    public Lavarropas(double precioBase, String color, char consumoEnergetico, double carga) {
        super(precioBase, color, consumoEnergetico);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal(int tamaño) {
        double precio = 0.0;
        if (this.getCarga() > 30.00){
            precio += 50;
        }

        precio += super.precioFinal(tamaño);

        return precio;
    }
}
