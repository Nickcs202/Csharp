package POO.E2;

public class Electrodomestico {

    private double precioBase;
    private String color;
    private char consumoEnergetico;  //[] consumoEnergetico  = {'A','B','C','D','E','F'};


    private static final double PRECIOBASEPORDEFECTO = 100.00;
    private static final String COLORPORDEFECTO = "blanco";
    private static final char CONSUMOPORDEFECTO = 'F';

    private static char[] arregloLetras = {'A','B','C','D','E','F'};
    private static String[] arregloColores = {"blanco","rojo","azul","gris","negro"};

    public Electrodomestico() {
        this(PRECIOBASEPORDEFECTO,COLORPORDEFECTO,CONSUMOPORDEFECTO);
    }

    public Electrodomestico(double precioBase, String color) {
        this(precioBase, color, CONSUMOPORDEFECTO);
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico) {
        this.precioBase = precioBase;
        comprobarColor(color);
        //this.color = color;
        comprobarConsumoEnergetico(consumoEnergetico);
        //this.consumoEnergetico = consumoEnergetico;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public static double getPRECIOBASEPORDEFECTO() {
        return PRECIOBASEPORDEFECTO;
    }

    public static String getCOLORPORDEFECTO() {
        return COLORPORDEFECTO;
    }

    public static char getCONSUMOPORDEFECTO() {
        return CONSUMOPORDEFECTO;
    }

    public static char[] getArregloLetras() {
        return arregloLetras;
    }

    public static void setArregloLetras(char[] arregloLetras) {
        Electrodomestico.arregloLetras = arregloLetras;
    }

    public static String[] getArregloColores() {
        return arregloColores;
    }

    public static void setArregloColores(String[] arregloColores) {
        Electrodomestico.arregloColores = arregloColores;
    }

    public void comprobarConsumoEnergetico(char letra){
        String s;

        s = ""+letra;
        boolean letraCorrecta = false;
        int contador = arregloLetras.length;

        //Realizo una comparacion entre letras y si la encuentra sale del while
        while (!letraCorrecta && contador != 0){

            if (s.equalsIgnoreCase(""+arregloLetras[contador-1])){
                letraCorrecta = true;
            }
            contador--;
        }

        if (letraCorrecta == true){
            //Le asigno siempre una letra mayuscula
            this.consumoEnergetico = s.toUpperCase().charAt(0);
        }else
            this.consumoEnergetico = CONSUMOPORDEFECTO;
    }

    public void comprobarColor(String color){

        boolean colorCorrecto = false;
        int contador = arregloColores.length;

        while (!colorCorrecto && contador != 0){

            if (color.equalsIgnoreCase(arregloColores[contador-1])){
                colorCorrecto = true;
            }
            contador--;
        }

        if (colorCorrecto == true){
            this.color = color;
        }else
            this.color = COLORPORDEFECTO;
    }

    public double precioFinal(int tamaño){
        double  precio = 0.0;
        char letra;

        letra = this.getConsumoEnergetico();

        switch (letra){
            case 'A':
                precio += 100.0;
                break;
            case 'B':
                precio += 80.0;
                break;
            case 'C':
                precio += 60.0;
                break;
            case 'D':
                precio += 50.0;
                break;
            case 'E':
                precio += 30.0;
                break;
            case 'F':
                precio += 10.0;
                break;
        }

        if (tamaño >= 0 && tamaño <= 19){
            precio += 10;
        }else
        if (tamaño >= 20 && tamaño <= 49){
            precio += 50;
        }else
        if (tamaño >= 50 && tamaño <= 79){
            precio += 80;
        }else
        if (tamaño > 80)
            precio += 100;


        return precio;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                '}';
    }
}
