package com.frre.tpCalendario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nux on 22/11/16.
 */
public class Usuario {

    private String nombre;
    private List<CalendarioService> calendarios;

    public Usuario(){}

   public Usuario(String nombre) {

        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<CalendarioService> getCalendarios() {
        return calendarios;
    }

    public void setCalendarios(List<CalendarioService> calendarios) {
        this.calendarios = calendarios;
    }

    public Object tieneOtrosCalendarios(List<CalendarioService> calendario){

        if(calendario==null){
            return "Sin Calendarios";
        }else return calendario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", calendarios=" + tieneOtrosCalendarios(calendarios) +
                "}  ";
    }
}
