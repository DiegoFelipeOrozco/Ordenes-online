package com.jualjodi.store.webRequestManage;

import java.util.Hashtable;

public class CachedResponses extends Pipe {

    private Hashtable<WebRequest, WebResponse> cachedResponses;
    @Override
    public WebResponse useWith(WebRequest webRequest) throws InvalidOperationException {
        System.out.println("hurgando la cache...");
        if (cachedResponses.containsKey(webRequest)){
            System.out.println("¡hay respuesta en la cache!");
            return cachedResponses.get(webRequest);
        } else if (next != null) {
            WebResponse response = next.useWith(webRequest);
            if (true) {
                //la respuesta es cacheable
                cachedResponses.put(webRequest, response);
            }
            return response;
        }
        return null;
    }
}
