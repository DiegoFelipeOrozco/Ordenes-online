package com.jualjodi.notificador;

public class NotificadorCorreo extends NotificadorMultiReceptor<String> {

    public NotificadorCorreo(String... receptores){
        super(receptores);
    }

    public void enviar(String mensaje) {
        System.out.println("enviando mensaje '"+mensaje+"' por correo a");
        for (Object receptor: receptores){
            System.out.println(receptor.toString());
        }
    }
}
