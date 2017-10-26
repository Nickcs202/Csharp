/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojuego;

/**
 *
 * @author nux
 */
public abstract class Juego {
    
    protected int numeoVidas;

    public Juego(int numeoVidas) {
        this.numeoVidas = numeoVidas;
    }
    
    public abstract void juega();
    
    public abstract int reiniciarPartida();
    
    public abstract void actualizarRecord();
    
    public abstract boolean quitarVida();
    
    
    
}
