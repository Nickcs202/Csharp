package com.frre.tpCalendario;

import org.hamcrest.collection.IsMapContaining;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static com.frre.tpCalendario.CalendarioService.crearDay;
import static com.frre.tpCalendario.CalendarioService.crearDia;
import static com.frre.tpCalendario.CalendarioService.crearMes;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

/**
 * Created by nux on 29/11/16.
 */
public class CalendarioServiceTest {


    private static CalendarioService cal;
    private static Evento evento;

    @Before
    public void setUp() throws Exception {
        CalendarioService cal=new CalendarioService(1, "2","16" );
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void crearDiaTest() throws Exception {
        String s = "fecha";
        Dia diaA = new Dia(s);
        assertSame(crearDia(s).getFecha(), diaA.getFecha());

    }

    @Test
    public void crearDayTest() throws Exception {

         assertNotNull((crearDay(1,"2","16")));
         assertThat((crearDay(1,"2","16")).size(), is(4));


        assertThat((crearDay(1,"2","16")), IsMapContaining.hasKey("1"));
        assertThat((crearDay(1,"2","16")), IsMapContaining.hasKey("8"));
        assertThat((crearDay(1,"2","16")), IsMapContaining.hasKey("15"));
        assertThat((crearDay(1,"2","16")), IsMapContaining.hasKey("22"));

        assertEquals("1/2/16",(crearDay(1,"2","16")).get("1").getFecha());
        assertEquals("8/2/16",(crearDay(1,"2","16")).get("8").getFecha());
        assertEquals("15/2/16",(crearDay(1,"2","16")).get("15").getFecha());
        assertEquals("22/2/16",(crearDay(1,"2","16")).get("22").getFecha());
    }

    @Test
    public void crearMesTest() throws Exception {
        assertNotNull((crearMes(1,"2","16")));
        assertThat((crearMes(1,"2","16")).size(), is(7));

        assertEquals("1/2/16",(crearMes(1,"2","16")).get("Lunes").get("1").getFecha());
        assertNull((crearMes(1,"2","16")).get("Lunes").get("1").getEvento());
        assertNotNull((crearMes(1,"2","16")).get("Lunes").get("1").getListaEventos());

        assertEquals("9/2/16",(crearMes(1,"2","16")).get("Martes").get("9").getFecha());
        assertNull((crearMes(1,"2","16")).get("Martes").get("9").getEvento());
        assertNotNull((crearMes(1,"2","16")).get("Martes").get("9").getListaEventos());

        assertEquals("28/2/16",(crearMes(1,"2","16")).get("Domingo").get("28").getFecha());
        assertNull((crearMes(1,"2","16")).get("Domingo").get("28").getEvento());
        assertNotNull((crearMes(1,"2","16")).get("Domingo").get("28").getListaEventos());

    }

    @Test
    public void getDiasTest() throws Exception {
        CalendarioService cal=new CalendarioService(1, "2","16" );
        assertNotNull(cal.getDias());
        assertThat((cal.getDias()).size(), is(7));

        assertEquals("1/2/16",(cal.getDias()).get("Lunes").get("1").getFecha());
        assertNull((cal.getDias()).get("Lunes").get("1").getEvento());
        assertNotNull((cal.getDias()).get("Lunes").get("1").getListaEventos());

        assertEquals("17/2/16",(cal.getDias()).get("Miercoles").get("17").getFecha());
        assertNull((cal.getDias()).get("Miercoles").get("17").getEvento());
        assertNotNull((cal.getDias()).get("Miercoles").get("17").getListaEventos());

        assertEquals("9/2/16",(cal.getDias()).get("Martes").get("9").getFecha());
        assertNull((cal.getDias()).get("Martes").get("9").getEvento());
        assertNotNull((cal.getDias()).get("Martes").get("9").getListaEventos());

        assertEquals("28/2/16",(cal.getDias()).get("Domingo").get("28").getFecha());
        assertNull((cal.getDias()).get("Domingo").get("28").getEvento());
        assertNotNull((cal.getDias()).get("Domingo").get("28").getListaEventos());

    }

    @Test
    public void getDiaPorFechaTest() throws Exception {
        CalendarioService cal=new CalendarioService(1, "2","16" );
        assertNotNull(cal.getDiaPorFecha("Martes", "2"));
        assertEquals("12/2/16",(cal.getDiaPorFecha("Viernes", "12").getFecha()));
        assertNull((cal.getDiaPorFecha("Sabado", "6")).getEvento());
    }

    @Test
    public void crearEventoTest() throws Exception {

        CalendarioService cal=new CalendarioService(1, "2","16" );

        evento = new Evento("TITULO DEL EVENTO", "10hs AM","TODO EL DIA", "COLOR ROJO", "DESCRIPCION DEL VENTO");

        cal.crearEvento("Martes", "16", evento);

        assertNotNull((cal.getDiaPorFecha("Martes", "16")).getEvento());
        assertEquals("TITULO DEL EVENTO", (cal.getDiaPorFecha("Martes", "16")).getEvento().getTitulo());
        assertEquals("10hs AM", (cal.getDiaPorFecha("Martes", "16")).getEvento().getHorario());
        assertEquals("TODO EL DIA", (cal.getDiaPorFecha("Martes", "16")).getEvento().getRangoDeDias());
        assertEquals("COLOR ROJO", (cal.getDiaPorFecha("Martes", "16")).getEvento().getColor());
        assertEquals("DESCRIPCION DEL VENTO", (cal.getDiaPorFecha("Martes", "16")).getEvento().getDescripcion());
    }

    @Test
    public void eliminarEventoTest() throws Exception {

        CalendarioService cal=new CalendarioService(1, "2","16" );

        evento = new Evento("TITULO DEL EVENTO", "10hs AM","TODO EL DIA", "COLOR ROJO", "DESCRIPCION DEL VENTO");

        cal.crearEvento("Martes", "16", evento);
        assertNotNull((cal.getDiaPorFecha("Martes", "16")).getEvento());
        cal.eliminarEvento("Martes","16", "TITULO DEL EVENTO");
        assertNull((cal.getDiaPorFecha("Martes", "16")).getListaEventos().get("TITULO DEL EVENTO"));
    }

    @Test
    public void modificarTituloEventoTest() throws Exception {
        CalendarioService cal=new CalendarioService(1, "2","16" );

        evento = new Evento("TITULO DEL EVENTO", "10hs AM","TODO EL DIA", "COLOR ROJO", "DESCRIPCION DEL VENTO");

        cal.crearEvento("Martes", "16", evento);
        assertEquals("TITULO DEL EVENTO", (cal.getDiaPorFecha("Martes", "16")).getEvento().getTitulo());
        cal.modificarTituloEvento("Martes","16","TITULO DEL EVENTO","Nuevo titulo");
        assertEquals("Nuevo titulo", (cal.getDiaPorFecha("Martes", "16")).getEvento().getTitulo());
    }

    @Test
    public void modificarRangoDeDiasEventoTest() throws Exception {
        CalendarioService cal=new CalendarioService(1, "2","16" );

        evento = new Evento("TITULO DEL EVENTO", "10hs AM","TODO EL DIA", "COLOR ROJO", "DESCRIPCION DEL VENTO");

        cal.crearEvento("Martes", "16", evento);
        assertEquals("TITULO DEL EVENTO", (cal.getDiaPorFecha("Martes", "16")).getEvento().getTitulo());
        cal.modificarRangoDeDiasEvento("Martes","16","TITULO DEL EVENTO","Solo medio Dia");
        assertEquals("Solo medio Dia", (cal.getDiaPorFecha("Martes", "16")).getEvento().getRangoDeDias());

    }

    @Test
    public void modificarDescripcionEventoTest() throws Exception {
        CalendarioService cal=new CalendarioService(1, "2","16" );

        evento = new Evento("TITULO DEL EVENTO", "10hs AM","TODO EL DIA", "COLOR ROJO", "DESCRIPCION DEL VENTO");

        cal.crearEvento("Martes", "16", evento);
        assertEquals("TITULO DEL EVENTO", (cal.getDiaPorFecha("Martes", "16")).getEvento().getTitulo());
        cal.modificarDescripcionEvento("Martes","16","TITULO DEL EVENTO", "Nueva Descripcion");
        assertEquals("Nueva Descripcion", (cal.getDiaPorFecha("Martes", "16")).getEvento().getDescripcion());

    }

    @Test
    public void eliminaInvitadosEventoTest() throws Exception {
        CalendarioService cal=new CalendarioService(1, "2","16" );

        evento = new Evento("TITULO DEL EVENTO", "10hs AM","TODO EL DIA", "COLOR ROJO", "DESCRIPCION DEL VENTO");

        cal.crearEvento("Martes", "16", evento);
        assertNull(cal.getDiaPorFecha("Martes","16").getEvento().getUsuarioParticipanteEvento("Invitado Juan"));
        cal.agregarInvitadosEvento("Martes","16","TITULO DEL EVENTO","Invitado Juan");
        assertEquals("Invitado Juan", cal.getDiaPorFecha("Martes","16").getEvento().getParticipanteEvento().get("Invitado Juan").getNombre());
        cal.eliminaInvitadosEvento("Martes","16","TITULO DEL EVENTO","Invitado Juan");
        assertNull(cal.getDiaPorFecha("Martes","16").getEvento().getUsuarioParticipanteEvento("Invitado Juan"));
    }

    @Test
    public void modificarInvitadosEventoTest() throws Exception {
        CalendarioService cal=new CalendarioService(1, "2","16" );

        evento = new Evento("TITULO DEL EVENTO", "10hs AM","TODO EL DIA", "COLOR ROJO", "DESCRIPCION DEL VENTO");

        cal.crearEvento("Martes", "16", evento);
        assertNull(cal.getDiaPorFecha("Martes","16").getEvento().getUsuarioParticipanteEvento("Invitado Juan"));
        cal.agregarInvitadosEvento("Martes","16","TITULO DEL EVENTO","Invitado Juan");
        assertEquals("Invitado Juan", cal.getDiaPorFecha("Martes","16").getEvento().getParticipanteEvento().get("Invitado Juan").getNombre());
        cal.modificarInvitadosEvento("Martes","16","TITULO DEL EVENTO","Invitado Juan","Otro Invitado Luis");
        assertEquals("Otro Invitado Luis", cal.getDiaPorFecha("Martes","16").getEvento().getParticipanteEvento().get("Otro Invitado Luis").getNombre());

    }

    @Test
    public void agregarInvitadosEventoTest() throws Exception {
        CalendarioService cal=new CalendarioService(1, "2","16" );

        evento = new Evento("TITULO DEL EVENTO", "10hs AM","TODO EL DIA", "COLOR ROJO", "DESCRIPCION DEL VENTO");

        cal.crearEvento("Martes", "16", evento);
        assertNull(cal.getDiaPorFecha("Martes","16").getEvento().getUsuarioParticipanteEvento("Invitado Juan"));
        cal.agregarInvitadosEvento("Martes","16","TITULO DEL EVENTO","Invitado Juan");
        assertEquals("Invitado Juan", cal.getDiaPorFecha("Martes","16").getEvento().getParticipanteEvento().get("Invitado Juan").getNombre());

    }

    @Test
    public void getInvitadosEventoTest() throws Exception {
        CalendarioService cal=new CalendarioService(1, "2","16" );

        evento = new Evento("TITULO DEL EVENTO", "10hs AM","TODO EL DIA", "COLOR ROJO", "DESCRIPCION DEL VENTO");

        cal.crearEvento("Martes", "16", evento);
        assertNull(cal.getDiaPorFecha("Martes","16").getEvento().getUsuarioParticipanteEvento("Invitado Juan"));
        cal.agregarInvitadosEvento("Martes","16","TITULO DEL EVENTO","Invitado Juan");
        cal.agregarInvitadosEvento("Martes","16","TITULO DEL EVENTO","Invitado Pedro");
        cal.agregarInvitadosEvento("Martes","16","TITULO DEL EVENTO","LOPEZ");

        assertEquals("Invitado Juan", cal.getDiaPorFecha("Martes","16").getListaEventos().get("TITULO DEL EVENTO").getParticipanteEvento().get("Invitado Juan").getNombre());
        assertEquals("Invitado Pedro", cal.getDiaPorFecha("Martes","16").getListaEventos().get("TITULO DEL EVENTO").getParticipanteEvento().get("Invitado Pedro").getNombre());

        assertEquals("LOPEZ", cal.getDiaPorFecha("Martes","16").getListaEventos().get("TITULO DEL EVENTO").getParticipanteEvento().get("LOPEZ").getNombre());

    }

    @Test
    public void getCalendarioFeriadosMesFebreroTest() {
        CalendarioService cal=new CalendarioService(1, "2","16" );
        assertNotNull(cal.getCalendarioFeriadosMesFebrero());
        assertEquals("Todo el dia", cal.getCalendarioFeriadosMesFebrero().get("Lunes").getHorario());
        assertEquals("del 8 al 9", cal.getCalendarioFeriadosMesFebrero().get("Lunes").getRangoDeDias());
        assertEquals("Verde", cal.getCalendarioFeriadosMesFebrero().get("Lunes").getColor());
        assertEquals("Feriado por carnaval", cal.getCalendarioFeriadosMesFebrero().get("Lunes").getDescripcion());
        assertEquals("Todo el dia", cal.getCalendarioFeriadosMesFebrero().get("Martes").getHorario());
        assertEquals("del 8 al 9", cal.getCalendarioFeriadosMesFebrero().get("Martes").getRangoDeDias());
        assertEquals("Verde", cal.getCalendarioFeriadosMesFebrero().get("Martes").getColor());
        assertEquals("Feriado por carnaval", cal.getCalendarioFeriadosMesFebrero().get("Martes").getDescripcion());

    }


    /*
    public static Test suite() {
        return new TestSuite(EjemploTest.class);
    } // suite
    public static void main (String[] args) {
        junit.textui.TestRunner.run(suite());
    } // main
    */

}