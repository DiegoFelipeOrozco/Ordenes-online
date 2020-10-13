package com.jualjodi.store.webRequestManage;

public class Sanitizer extends Pipe {
    @Override
    public WebResponse useWith(WebRequest webRequest) throws InvalidOperationException {
        System.out.println("saneando los datos");
        if (next != null){
            return next.useWith(webRequest);
        }
        return null;
    }
}
