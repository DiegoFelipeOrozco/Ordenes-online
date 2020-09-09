package com.jualjodi.notificador;

import java.util.ArrayList;

public class NotificadorMasivo {

    private ArrayList<Notificador> notificadores;

    public NotificadorMasivo(Notificador... notificadores){
        this.notificadores = new ArrayList<>();
        for (Notificador notifi: notificadores){
            this.notificadores.add(notifi);
        }
    }

    public void enviarMasivamente(String mensaje){
        for (Notificador notifi: notificadores){
            notifi.enviar(mensaje);
        }
    }
}
