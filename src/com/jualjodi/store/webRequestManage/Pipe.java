package com.jualjodi.store.webRequestManage;

public abstract class Pipe {

    protected Pipe next;

    public abstract WebResponse useWith(WebRequest webRequest) throws InvalidOperationException;

    public final Pipe setNext(Pipe next) {
        this.next = next;
        return next;
    }
}
