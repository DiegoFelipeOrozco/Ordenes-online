package com.jualjodi.notificador;

import java.util.HashSet;
import java.util.Set;

public abstract class Notificador {

    protected Set<Object> receptores;

    public Notificador(Object... receptores) {
        this.receptores = new HashSet();
        for(Object obj: receptores){
            this.receptores.add(obj);
        }
    }

    public abstract void enviar(String mensaje);
}
