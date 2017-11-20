package com.frre.tpCalendario;

import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by nux on 22/11/16.
 */
@Service
public class CalendarioService {

    private CalendarioService cal;


    private int primerDia;
	private String unMes;
	private String anio;


	private static Evento evento;
	private static Dia dia;
	//private static Semana semana;
	//private static Mes mes;

	private static Map<String, Dia> day;

	private static Map<String, Dia> lunes;
	private static Map<String, Dia> martes;
	private static Map<String, Dia> miercoles;
	private static Map<String, Dia> jueves;
	private static Map<String, Dia> viernes;
	private static Map<String, Dia> sabado;
	private static Map<String, Dia> domingo;

	private static Map<String, Map<String, Dia>> esteMes;


    public CalendarioService(int primerDia, String uMes, String anio){
    	 this.primerDia=primerDia;
    	 this.unMes=uMes;
    	 this.anio = anio;

    	 esteMes= crearMes(primerDia, uMes, anio);
    }

    public static Dia crearDia(String fecha ){
    	dia = new Dia(fecha);
    	return dia;
    }

    public static Map<String, Dia> crearDay(int i, String mes, String anio){
    	int cont =(((i+7)+7)+7);
    	day = new TreeMap<String, Dia>();
    	for (int n1 = i; n1 <= cont; n1=n1+7) {
			day.put(n1+"", crearDia(n1+"/"+mes+"/"+anio));//AGREDA A LA LISTA DE CADA DIA TODAS LAS FECHAS (EJMPLO AL LUNES TODOS LOS LUNES DEL MES)

		}

    	return day;
    }

    public static Map<String, Map<String, Dia>> crearMes(int n, String mes, String anio){

    	esteMes = new TreeMap<String, Map<String, Dia>>();

    	 lunes= new TreeMap<String, Dia>();
    	 lunes = crearDay(n, mes, anio);
    	 martes= new TreeMap<String, Dia>();
    	 martes = crearDay(n+1, mes, anio);
    	 miercoles= new TreeMap<String, Dia>();
    	 miercoles = crearDay(n+2, mes, anio);
    	 jueves= new TreeMap<String, Dia>();
    	 jueves = crearDay(n+3, mes, anio);
    	 viernes= new TreeMap<String, Dia>();
    	 viernes = crearDay(n+4, mes, anio);
    	sabado= new TreeMap<String, Dia>();
    	sabado	= crearDay(n+5, mes, anio);
    	 domingo= new TreeMap<String, Dia>();
    	 domingo = crearDay(n+6, mes, anio);

    	 esteMes.put("Lunes", lunes);
    	 esteMes.put( "Martes",martes );
    	 esteMes.put("Miercoles" ,miercoles );
    	 esteMes.put("Jueves" ,jueves );
    	 esteMes.put("Viernes" , viernes);
    	 esteMes.put("Sabado" , sabado);
    	 esteMes.put("Domingo" , domingo);

    	return esteMes;
    }


    public CalendarioService() {

         cal=new CalendarioService(1, "2","16" );//INICIALIZO CON EL MES DE FEBRERO

    }

    public Map<String, Map<String, Dia>> getDias(){
        return esteMes;
    }

    public Dia getDiaPorFecha(String clave,String id){
        return esteMes.get(clave).get(id);
    }
	public void crearEvento(String dia,String fecha, Evento event) {

		esteMes.get(dia).get(fecha).crearEvento2(event);
	}
	public void eliminarEvento(String dia,String fecha, String tituloEvento){
		esteMes.get(dia).get(fecha).eliminarEvento(tituloEvento);
	}
	public void modificarTituloEvento(String dia, String fecha, String tituloEvento, String nuevaTitulo){
		esteMes.get(dia).get(fecha).getUnEventoPorTitulo(tituloEvento).setTitulo(nuevaTitulo);
	}
	public void modificarRangoDeDiasEvento(String dia, String fecha, String tituloEvento, String nuevaFecha){
		esteMes.get(dia).get(fecha).getUnEventoPorTitulo(tituloEvento).setRangoDeDias(nuevaFecha);
	}
	public void modificarDescripcionEvento(String dia, String fecha, String tituloEvento, String nuevaDescripcion){
		esteMes.get(dia).get(fecha).getUnEventoPorTitulo(tituloEvento).setDescripcion(nuevaDescripcion);
	}
	public void eliminaInvitadosEvento(String dia, String fecha, String tituloEvento, String nombreinvitado){
		esteMes.get(dia).get(fecha).getUnEventoPorTitulo(tituloEvento).removerInvitado(nombreinvitado);
	}
	public void modificarInvitadosEvento(String dia, String fecha, String tituloEvento, String nombreinvitado, String nuevoNombreinvitado){
		esteMes.get(dia).get(fecha).getUnEventoPorTitulo(tituloEvento).modificarInvitadoEvento(nombreinvitado, nuevoNombreinvitado);
	}
	public void agregarInvitadosEvento(String dia, String fecha, String tituloEvento, String nombreinvitado){
		esteMes.get(dia).get(fecha).getUnEventoPorTitulo(tituloEvento).addParticipanteEvento(nombreinvitado);

	}

	public Map<String, Usuario> getInvitadosEvento(String dia, String fecha, String tituloEvento){
		return esteMes.get(dia).get(fecha).getUnEventoPorTitulo(tituloEvento).getParticipanteEvento();

	}

	public Map<String, Evento> getCalendarioFeriadosMesFebrero() {
		Map calendarFeriados = new TreeMap<String, Evento>();
		Calendario feriados = new Calendario(1, "2", "16");
		Evento eventoDelDia8 = new Evento("Feriado de Carnaval", "Todo el dia", "del 8 al 9", "Verde", "Feriado por carnaval");
		feriados.getCal().crearEvento("Lunes", "8", eventoDelDia8);

		Evento eventoDelDia9 = new Evento("Feriado de Carnaval", "Todo el dia", "del 8 al 9", "Verde", "Feriado por carnaval");
		feriados.getCal().crearEvento("Martes", "9", eventoDelDia9);

		calendarFeriados.put("Lunes", feriados.getCal().getDiaPorFecha("Lunes", "8").getEvento());
		calendarFeriados.put("Martes", feriados.getCal().getDiaPorFecha("Martes", "9").getEvento());

		return calendarFeriados;
	}



}
