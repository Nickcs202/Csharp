package com.frre.tpCalendario;


import java.util.*;
/**
 * Created by nux on 22/11/16.
 */
public class Calendario {


 private CalendarioService cal;

		public Calendario() {
            cal=new CalendarioService(1, "2","16" );
    }
        public Calendario(int dia, String fecha, String anio) {
            cal=new CalendarioService(dia, fecha, anio );
    }

        public CalendarioService getCal() {
            return cal;
    }

}
