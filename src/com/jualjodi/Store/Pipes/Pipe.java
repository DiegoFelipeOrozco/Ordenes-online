package com.jualjodi.Store.Pipes;

import com.jualjodi.Store.WebRequest;
import com.jualjodi.Store.WebResponse;

public abstract class Pipe {

    private Pipe next;

    protected abstract WebResponse validate(WebRequest request) throws InvalidOperationException;

    public final WebResponse useWith(WebRequest webRequest) throws InvalidOperationException {
        WebResponse webResponse = validate(webRequest);
        if (next != null)
            return next.useWith(webRequest);
        return webResponse;
    }

    public Pipe setNext(Pipe next) {
        this.next = next;
        return next;
    }
}
