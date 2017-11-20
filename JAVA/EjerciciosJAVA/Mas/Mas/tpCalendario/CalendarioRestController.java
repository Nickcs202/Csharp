package com.frre.tpCalendario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by nux on 22/11/16.
 */

@RestController
@RequestMapping("/calendario")
public class CalendarioRestController {

    @Autowired
    private CalendarioService calendarioService;

    //MUESTRA LOS DIAS DEL MES
    @RequestMapping(method = RequestMethod.GET)
     public Map<String, Map<String, Dia>> getDia() {
      return calendarioService.getDias();
    }

    //MUESTRA UN DIA ESPECIFICO
    @RequestMapping(method = RequestMethod.GET, value = "{dia}/{fecha}")
    public Dia getUnDia(@PathVariable("dia") String dia, @PathVariable("fecha") String fecha){

        return calendarioService.getDiaPorFecha(dia, fecha);
    }

    //AGREGA UN EVENTO
      @RequestMapping (method = RequestMethod.POST, value = "{dia}/{fecha}")
    public ResponseEntity<Boolean> addDias(@PathVariable("dia") String dia, @PathVariable("fecha")String fecha, @RequestBody Evento e) {
        calendarioService.crearEvento(dia,fecha,  e);
        return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
    }

    //ELIMINAR EVENTO
    @RequestMapping (method=RequestMethod.DELETE, value = "{dia}/{fecha}/{tituloEvento}")
    public ResponseEntity<Boolean> deleteDias(@PathVariable("dia") String dia, @PathVariable("fecha")String fecha,  @PathVariable("tituloEvento")String tituloEvento) {
        calendarioService.eliminarEvento(dia,fecha,tituloEvento );
        return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
    }

    //CAMBIA EL TITULO EN UN EVENTO
    @RequestMapping (method = RequestMethod.POST, value = "/modificarTituloEvento/{dia}/{fecha}/{tituloEvento}")
    public ResponseEntity<Boolean> cambiarTituloEnento(@PathVariable("dia") String dia, @PathVariable("fecha")String fecha, @PathVariable("tituloEvento") String tituloEvento, @RequestBody String nuevoTitulo) {
        calendarioService.modificarTituloEvento(dia, fecha,tituloEvento, nuevoTitulo);
        return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
    }

    //CAMBIA EL RANGO DE DIAS EN UN EVENTO
    @RequestMapping (method = RequestMethod.POST, value = "/modificarRangoDeDiasDeEvento/{dia}/{fecha}/{tituloEvento}")
    public ResponseEntity<Boolean> cambiarRangoDeDiasEnento(@PathVariable("dia") String dia, @PathVariable("fecha")String fecha, @PathVariable("tituloEvento") String tituloEvento, @RequestBody String nuevaFecha) {
        calendarioService.modificarRangoDeDiasEvento(dia, fecha,tituloEvento, nuevaFecha);
        return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
    }

    //CAMBIA LA DESCRIOPCION  EN UN EVENTO
    @RequestMapping (method = RequestMethod.POST, value = "{dia}/{fecha}/{tituloEvento}")
    public ResponseEntity<Boolean> cambiarDescripcionEnento(@PathVariable("dia") String dia, @PathVariable("fecha")String fecha, @PathVariable("tituloEvento") String tituloEvento, @RequestBody String nuevaDescripcion) {
        calendarioService.modificarDescripcionEvento(dia, fecha,tituloEvento, nuevaDescripcion);
        return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
    }

    //ELIMINAR USUARIO INVITADO A EVENTO
    @RequestMapping (method=RequestMethod.DELETE, value = "{dia}/{fecha}/{tituloEvento}/{nombreParticipante}")
    public ResponseEntity<Boolean> deleteUsuarioInvitadoEvento(@PathVariable("dia") String dia, @PathVariable("fecha")String fecha,  @PathVariable("tituloEvento")String tituloEvento, @PathVariable("nombreParticipante")String nombreParticipante) {
        calendarioService.eliminaInvitadosEvento(dia, fecha,tituloEvento, nombreParticipante);
        return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
    }

    //CAMBIA UN PARTICIPANTE EN UN EVENTO
    @RequestMapping (method = RequestMethod.POST, value = "{dia}/{fecha}/{tituloEvento}/{nombreParticipante}/{nuevoNombreParticipante}")
    public ResponseEntity<Boolean> cambiarParticipanteEnento(@PathVariable("dia") String dia, @PathVariable("fecha")String fecha, @PathVariable("tituloEvento") String tituloEvento, @PathVariable("nombreParticipante")String nombreParticipante, @PathVariable("nuevoNombreParticipante")String nuevoNombreParticipante) {
        calendarioService.modificarInvitadosEvento(dia, fecha,tituloEvento, nombreParticipante,nuevoNombreParticipante);
        return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
    }

    //AGREGA UN PARTICIPANTE A UN EVENTO
    @RequestMapping (method = RequestMethod.POST, value = "{dia}/{fecha}/{tituloEvento}/{nombreParticipante}")
    public ResponseEntity<Boolean> addParticipanteEnento(@PathVariable("dia") String dia, @PathVariable("fecha")String fecha, @PathVariable("tituloEvento") String tituloEvento, @PathVariable("nombreParticipante")String nombreParticipante) {
        calendarioService.agregarInvitadosEvento(dia, fecha,tituloEvento, nombreParticipante);
        return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
    }

    //MUESTRA LOS PARTICIPANTES A UN EVENTO
    @RequestMapping(method = RequestMethod.GET, value ="{dia}/{fecha}/{tituloEvento}" )
    public Map<String, Usuario>  getParticipantesEvento(@PathVariable("dia") String dia, @PathVariable("fecha") String fecha, @PathVariable("tituloEvento") String tituloEvento){

        return calendarioService.getInvitadosEvento(dia, fecha, tituloEvento);
    }

    //MOSTRAR FERIADOS
    @RequestMapping(method = RequestMethod.GET, value = "{feriadosDeFebrero}")
    public Map<String, Evento> getFeriadoDelMesFebrero() {
        return calendarioService.getCalendarioFeriadosMesFebrero();
    }

}
