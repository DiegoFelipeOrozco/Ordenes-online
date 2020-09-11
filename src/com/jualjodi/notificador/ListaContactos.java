package com.jualjodi.notificador;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class ListaContactos<T> {

    protected Set<T> receptores;

    public ListaContactos(T... receptores) {
        this.receptores = new HashSet<>();
        Collections.addAll(this.receptores, receptores);
    }
}
