package com.jualjodi.notificador;

public class NotificadorSMS extends ListaContactos<Long> implements Notificador {
    public NotificadorSMS(Long... receptores) {
        super(receptores);
    }

    public void enviar(String mensaje) {
        System.out.println("enviando mensaje '"+mensaje+"' por SMS a");
        for (Object receptor: receptores) {
            System.out.println(receptor.toString());
        }
    }
}
