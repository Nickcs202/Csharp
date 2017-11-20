package com.frre.tpCalendario;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by nux on 22/11/16.
*/
    public class Evento {

        private String titulo;
        private String horario;
        private String rangoDeDias;
        private String color;
        private Map<String, Usuario> participanteEvento;

        private String descripcion;
        private static int number;
        private Usuario usuarioInvitado;


    public Evento(){

        participanteEvento = new HashMap<String, Usuario>();
        number =1;
    }
    public Evento(String titulo, String horario, String rangoDeDias, String color, String descripcion) {
    	participanteEvento = new HashMap<String, Usuario>();
        this.titulo = titulo;
        this.horario = horario;
        this.rangoDeDias = rangoDeDias;
        this.color = color;

        this.descripcion = descripcion;

        number =1;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getRangoDeDias() {
        return rangoDeDias;
    }

    public void setRangoDeDias(String rangoDeDias) {
        this.rangoDeDias = rangoDeDias;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void addParticipanteEvento(String nombreParticipante){

        usuarioInvitado=crearUsuario(nombreParticipante);
        participanteEvento.put(usuarioInvitado.getNombre(),usuarioInvitado);

    }

    public Usuario crearUsuario(String nombre){
        Usuario u=new Usuario(nombre);
        return u;
    }
    public Usuario getUsuarioParticipanteEvento(String nombreParticipante){
        return participanteEvento.get(nombreParticipante);
    }
    public void removerInvitado(String nombreParticipante){
        participanteEvento.remove(nombreParticipante);
    }
     public void modificarInvitadoEvento(String nombreParticipante, String nuevoNnombreParticipante){

         participanteEvento.remove(nombreParticipante);
         usuarioInvitado=crearUsuario(nuevoNnombreParticipante);
         participanteEvento.put(usuarioInvitado.getNombre(),usuarioInvitado);
     }


    public Map<String, Usuario> getParticipanteEvento() {
        return participanteEvento;

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


	@Override
	public String toString() {
		return "Evento [titulo=" + titulo + ", horario=" + horario
				+ ", rangoDeDias=" + rangoDeDias + ", color=" + color
				+ ", descripcion=" + descripcion + "]";
	}


}