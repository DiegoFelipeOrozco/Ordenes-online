package com.jualjodi.notificador;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class NotificadorMultiReceptor<TipoId> implements Notificador {

    protected Set<TipoId> receptores;

    public NotificadorMultiReceptor(TipoId... receptores) {
        this.receptores = new HashSet<>();
        Collections.addAll(this.receptores, receptores);
    }

    public void nuevoReceptor(TipoId receptor){
        receptores.add(receptor);
    }
    public void eliminarReceptor(TipoId receptor){
        receptores.remove(receptor);
    }
}
