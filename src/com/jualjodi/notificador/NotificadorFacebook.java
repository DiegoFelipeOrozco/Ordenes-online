package com.jualjodi.notificador;

public class NotificadorFacebook extends NotificadorMultiReceptor<String> {

    public NotificadorFacebook(String... receptores){
        super(receptores);
    }
    public void enviar(String mensaje) {
        System.out.println("enviando mensaje '"+mensaje+"' por Facebook a");
        for (Object receptor: receptores){
            System.out.println(receptor.toString());
        }
    }
}
