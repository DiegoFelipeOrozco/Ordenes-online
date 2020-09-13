package com.jualjodi;

import com.jualjodi.notificador.NotificadorMultiReceptor;

public class NotificadorWhatsapp extends NotificadorMultiReceptor<Long> {

    public NotificadorWhatsapp(Long... receptores){
        super(receptores);
    }
    public void enviar(String mensaje) {
        System.out.println("enviando mensaje '"+mensaje+"' por Whatsapp a");
        for (Object receptor: receptores) {
            System.out.println(receptor.toString());
        }
    }
}
