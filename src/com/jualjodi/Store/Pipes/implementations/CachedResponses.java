package com.jualjodi.Store.Pipes.implementations;

import com.jualjodi.Store.Pipes.Pipe;
import com.jualjodi.Store.Pipes.InvalidOperationException;
import com.jualjodi.Store.WebRequest;
import com.jualjodi.Store.WebResponse;

import java.util.Hashtable;

public class CachedResponses extends Pipe {

    private Hashtable<WebRequest, WebResponse> cachedResponses;
    @Override
    protected WebResponse validate(WebRequest request) throws InvalidOperationException {
        if (cachedResponses.containsKey(request)){
            return cachedResponses.get(request);
        } else {
            return null;
        }
    }
}
