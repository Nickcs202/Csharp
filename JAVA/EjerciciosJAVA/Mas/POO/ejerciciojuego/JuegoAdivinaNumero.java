/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojuego;

import java.util.Scanner;

/**
 *
 * @author nux
 */
public class JuegoAdivinaNumero extends Juego{ 

    protected int numero;
    static Scanner sc = new Scanner(System.in);
    
    public JuegoAdivinaNumero(int numeoVidas, int numero) {
        super(numeoVidas);
        this.numero = numero;
    }
    
    
    @Override
    public void juega() {
        int n;
        boolean tieneOtraOportunidad = true;
        
        reiniciarPartida();
        while (tieneOtraOportunidad) {            
            n = reiniciarPartida();
            if (n == this.numero) {
                actualizarRecord();
                tieneOtraOportunidad = false;
            }else{
                tieneOtraOportunidad = quitarVida();
                if (tieneOtraOportunidad) {
                    if (numeoVidas > n) {
                        System.out.println("El numero a adivinar es mayor que "+n);
                    }else{
                        System.out.println("numero a adivinar es menor que "+n);
                    }
                System.out.println(" Vuelva a intentarlo ");
                }
            }
        }
    }

    @Override
    public int reiniciarPartida() {
        System.out.println("Ingrese un numero entero entre 0 y 10 ");
        int n = sc.nextInt();
        return n;
    }

    @Override
    public void actualizarRecord() {
        System.out.println("Acertaste!!");
    }

    @Override
    public boolean quitarVida() {
        boolean tieneVidas = false;
        
        if (this.numeoVidas > 0) {
            this.numeoVidas -= 1;
            tieneVidas = true;
        }else
            System.out.println("Se le Terminaron las vidas");
        
        return tieneVidas;
    }
    
    
}
