import java.util.ArrayList;
import java.util.Comparator;

public class Main {

     public static void main(String[] arg){

         /*
         ArrayList monedasDisp=new ArrayList();

         monedasDisp.add(1.00);
         monedasDisp.add(0.50);
         monedasDisp.add(0.25);
         monedasDisp.add(0.10);
         monedasDisp.add(0.01);


        System.out.println("Vuelto monedas es : "+vueltoMonedas(6.39, monedasDisp));
        */

         Actividad actividad1 = new Actividad();
         Actividad actividad2 = new Actividad();
         Actividad actividad3 = new Actividad();
         Actividad actividad4 = new Actividad();
         Actividad actividad5 = new Actividad();
         Actividad actividad6 = new Actividad();
         Actividad actividad7 = new Actividad();
         Actividad actividad8 = new Actividad();

         actividad1.setHoraInicio(10.00);
         actividad1.setHoraFin(13.00);
         actividad2.setHoraInicio(12.00);
         actividad2.setHoraFin(14.00);
         actividad3.setHoraInicio(9.00);
         actividad3.setHoraFin(15.00);
         actividad4.setHoraInicio(13.00);
         actividad4.setHoraFin(16.00);
         actividad5.setHoraInicio(12.00);
         actividad5.setHoraFin(17.00);
         actividad6.setHoraInicio(14.00);
         actividad6.setHoraFin(18.00);
         actividad7.setHoraInicio(15.00);
         actividad7.setHoraFin(19.00);
         actividad8.setHoraInicio(17.00);
         actividad8.setHoraFin(20.00);

         Actividad[] listaActv = new Actividad[8];
         listaActv[0]= actividad1 ;
         listaActv[1]= actividad2 ;
         listaActv[2]= actividad3 ;
         listaActv[3]= actividad4 ;
         listaActv[4]= actividad5 ;
         listaActv[5]= actividad6 ;
         listaActv[6]= actividad7 ;
         listaActv[7]= actividad8 ;

         System.out.println("Maxima cantidad de actividades "+maxCantActiv(listaActv));


     }
     //////////////////////////////////
    //Ejercicio N 1: ejercicio de las monedas
    public static int vueltoMonedas(double monto, ArrayList monedasDisponibles){
        monedasDisponibles.sort(Comparator.naturalOrder());
        int cantidadMonedas = 0, n = 0;
        double sumaMonedasUsadas = 0, moneda;

        while (sumaMonedasUsadas != monto){

            if (sumaMonedasUsadas < monto){
                moneda = (double) monedasDisponibles.get(n);
                sumaMonedasUsadas += moneda;
                cantidadMonedas++;
            }
            if (sumaMonedasUsadas > monto){
                moneda = (double) monedasDisponibles.get(n);
                sumaMonedasUsadas = sumaMonedasUsadas - moneda;
                if (n<monedasDisponibles.size())
                n++;

                moneda = (double) monedasDisponibles.get(n);
                sumaMonedasUsadas += moneda;

                cantidadMonedas++;
            }
        }

        return cantidadMonedas;
    }
    //////////////////////////////////////////////////////////////////////////////////////
    //Ejercicio N2
    public static int maxCantActiv(Actividad[] lista){
        int cantidadActividades = 0, totalActividades, aux = 0;
        totalActividades = lista.length;
        double horaInicio, horaFin;
        int[] total = new int[totalActividades];

        for (int i = 0; i < totalActividades; i++){
            horaFin = lista[i].getHoraFin();
            for(int j = i+1; j<totalActividades; j++){
                horaInicio = lista[j].getHoraInicio();
                if (horaInicio >= horaFin){
                    cantidadActividades++;
                }
            }
            total[i]=cantidadActividades;
            cantidadActividades = 0;
        }
        aux = mayor(total);

        return aux;
    }
    public static int mayor(int[] array){
        int mayor = 0;
        for (int i = 0; i< array.length; i++){
            if (i < array[i]){
                mayor = array[i];
            }
        }
        return mayor;
    }

}
class Actividad{
    private double horaInicio;
    private double horaFin;

    public Actividad() {
        this.horaInicio = 0.00;
        this.horaFin = 0.00;
    }

    public double getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(double horaInicio) {
        this.horaInicio = horaInicio;
    }

    public double getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(double horaFin) {
        this.horaFin = horaFin;
    }

    @Override
    public String toString() {
        return "Actividad{" +
                "horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                '}';
    }
}