package POO.E3;

import java.util.Scanner;

public class Hora {

    private int horas;
    private int minutos;
    private int segundos;

    public static Scanner sc = new Scanner(System.in);

    public Hora() {
        this(00,00,00);
    }

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;

        validar();
    }

    public void leer(){

        System.out.println("/tIngrese la hora:");
        this.horas = sc.nextInt();

        System.out.println("/tIngrese minuto:");
        this.minutos = sc.nextInt();

        System.out.println("/tIngrese segundos:");
        this.segundos = sc.nextInt();

        validar();
    }

    private void validar(){

        if (!(horas >= 0 && horas <= 24)){
            this.horas = 0;
        }else
            if (!(minutos >= 0 && minutos <= 60)){
                this.minutos = 0;
        }else
            if (!(segundos >= 0 && segundos <= 60)){
                this.segundos = 0;
            }
    }

    public void print(){

        if (horas < 10 && minutos != 0 && segundos != 0) {
            System.out.println("\t0" + horas + " : " + minutos + " : " + segundos);
        }
        else
            if (minutos < 10 && horas != 0 && segundos != 0) {
                System.out.println("\t" + horas + " : 0" + minutos + " : " + segundos);
            }
        else
            if (segundos <10 && horas != 0 && minutos != 0) {
                System.out.println("\t" + horas + " : " + minutos + " : 0" + segundos);
            }
        else
            if (horas <  10 && minutos < 10 && segundos != 0) {
                System.out.println("\t0" + horas + " : 0" + minutos + " : " + segundos);
            }
        else
            if (horas < 10 && minutos < 10 && segundos < 10) {
                System.out.println("\t0" + horas + " : 0" + minutos + " : 0" + segundos);
            }
    }

    public int aSegundos(){
        int segundosDesdeLaMedianoche = 0;

        segundosDesdeLaMedianoche = 43200 - segundos;

        return segundosDesdeLaMedianoche;
    }

    public int deSegundos(int segundosIngresados){
        int segundosTranscurridos = 0;

        segundosTranscurridos = 43200 - segundosIngresados;

        return segundosTranscurridos;
    }

    public int segundosDesde(int hora){
        int horasTranscurridas = 0;

        horasTranscurridas = ( horas - horas ) * 3600;

        return horasTranscurridas;
    }

    public int siguiente(){
        int sSiguiente = 0;

        if (segundos < 60)
            sSiguiente = this.segundos + 1;

        return sSiguiente;
    }

    public int anterior(){
        int sAnterior = 0;

        if (segundos != 0)
            sAnterior = this.segundos - 1;

        return sAnterior;
    }

    public void copia(){}

    public boolean igualQue(int hora){

        return this.horas == hora;
    }

    public boolean menorQue(int hora){
        return this.horas < hora;
    }

    public boolean mayorQue(int hora){
        return this.horas > hora;
    }
}
