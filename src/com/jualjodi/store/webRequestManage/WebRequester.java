package com.jualjodi.store.webRequestManage;

public class WebRequester extends Pipe {
    @Override
    public WebResponse useWith(WebRequest webRequest) throws InvalidOperationException {
        System.out.println("enviando los datos al servidor");
        return new WebResponse();
    }
}
