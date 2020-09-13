package com.jualjodi.notificador;

import java.util.ArrayList;
import java.util.Collection;

import static java.util.Arrays.asList;

public class NotificadorMultitipo implements Notificador {

    private Collection<Notificador> notificadores;

    public NotificadorMultitipo(Notificador... notificadores){
        this.notificadores = new ArrayList();
        this.notificadores.addAll(asList(notificadores));
    }

    public void enviar(String mensaje){
        for (Notificador notifi: notificadores){
            notifi.enviar(mensaje);
        }
    }
}
