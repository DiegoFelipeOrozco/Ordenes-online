package com.jualjodi;

import com.jualjodi.notificador.*;

public class Aplicacion {


    private static Notificador notificador;

    public static void main(String[] args) {
        setNotificador(new NotificadorSMS(3212786281L, 3304281L));
        hacerAlgo();
    }

    public static void setNotificador(Notificador notificador) {
        Aplicacion.notificador = notificador;
    }

    private static void hacerAlgo() {
        //usar el envio
        notificador.enviar("Alerta!");
    }
}
