package com.frre.tpCalendario;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nux on 22/11/16.


/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dia dia = (Dia) o;

        if (id != dia.id) return false;
        if (diaF != null ? !diaF.equals(dia.diaF) : dia.diaF != null) return false;
        if (fecha != null ? !fecha.equals(dia.fecha) : dia.fecha != null) return false;
        if (listaEventos != null ? !listaEventos.equals(dia.listaEventos) : dia.listaEventos != null) return false;
        return evento != null ? evento.equals(dia.evento) : dia.evento == null;

    }*/
public class Dia implements Comparable{

    private static String diaF;
    private String fecha;
    private Map<String, Evento> listaEventos;
    private int id;

    private Evento evento;

    public Dia() {
    	listaEventos = new HashMap<String, Evento>();
    }
    public Dia( String fecha) {
    	listaEventos = new HashMap<String, Evento>();

        this.fecha = fecha;
    }

    public Dia(String d, int id) {
    	listaEventos = new HashMap<String, Evento>();
        this.diaF = d;
        this.id = id;
    }

    public Dia(String diaF, String fecha, Map<String, Evento> listaEventos, Evento evento) {
    	listaEventos = new HashMap<String, Evento>();
        this.diaF = diaF;
        this.fecha = fecha;
        this.listaEventos = listaEventos;
        this.evento = evento;
    }

    public Dia(String diaF, Map<String, Evento> listaEventos) {
    	listaEventos = new HashMap<String, Evento>();
        this.diaF = diaF;
        this.listaEventos = listaEventos;
    }

    public String getDiaF() {
        return diaF;
    }

    public void setDiaF(String diaF) {
        this.diaF = diaF;
    }

    public Map<String, Evento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(Map<String, Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public void crearEvento(String titulo, String horario, String rangoDeDias, String color, String descripcion){
        evento = new Evento(titulo, horario, rangoDeDias, color, descripcion);
        listaEventos.put(evento.getTitulo(), evento);

    }
 public void crearEvento2(Evento e){
        evento = new Evento(e.getTitulo(),e.getHorario(), e.getRangoDeDias(), e.getColor(), e.getDescripcion());
        listaEventos.put(evento.getTitulo(), evento);

    }
    public void eliminarEvento(String titulo){
    	listaEventos.remove(titulo);
    }

    public void modificarTituloEvento(String nombreEvento, String nuevoTitulo){
        listaEventos.get(nombreEvento).setTitulo(nuevoTitulo);
    }

    public void modificarRangoDDiasEvento(String nombreEvento, String nuevoRangoDeDias){
    	listaEventos.get(nombreEvento).setRangoDeDias(nuevoRangoDeDias);
    }

    public void modificarHorarioEvento(String nombreEvento, String nuevoHorario){
    	listaEventos.get(nombreEvento).setHorario(nuevoHorario);
    }
    public void agregrInvitadoEvento(String nombreEvento){
        listaEventos.get(nombreEvento).addParticipanteEvento(nombreEvento);
    }
    public Evento getUnEventoPorTitulo(String tituloEvento){
       return listaEventos.get(tituloEvento);
    }
     public void setEventos(String s, Evento eventos) {
        listaEventos.put(s, eventos);
    }



    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public int compareTo(Object o) {
        return (((Comparable)id).compareTo(((Dia)o).id));
    }


    @Override
    public String toString() {
        return "Dia{" +
                "fecha='" + fecha + '\'' +
                ", listaEventos=" + listaEventos +
                ", evento=" + evento +
                '}';
    }
}
