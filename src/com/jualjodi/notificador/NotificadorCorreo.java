package com.jualjodi.notificador;

public class NotificadorCorreo extends ListaContactos<String> implements Notificador {

    public NotificadorCorreo(String... receptores){
        super(receptores);
    }

    public void enviar(String mensaje) {
        System.out.println("enviando mensaje '"+mensaje+"' por email a");
        for (Object receptor: receptores){
            System.out.println(receptor.toString());
        }
    }
}
