package com.jualjodi.notificador;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class NotificadorMasivo implements Notificador {

    private ArrayList<Notificador> notificadores;

    public NotificadorMasivo(Notificador... notificadores){
        this.notificadores = new ArrayList();
        this.notificadores.addAll(asList(notificadores));
    }

    public void enviar(String mensaje){
        for (Notificador notifi: notificadores){
            notifi.enviar(mensaje);
        }
    }
}
