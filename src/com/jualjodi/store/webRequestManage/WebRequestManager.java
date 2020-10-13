package com.jualjodi.store.webRequestManage;

public class WebRequestManager {
    protected WebRequest webRequest;
    protected Pipe pipeLine;

    public WebRequestManager(String[] body, String[] metadata) {
        webRequest = new WebRequest(body, metadata);
        (pipeLine = new Sanitizer()).setNext(new BlackListVerificator()).setNext(new CachedResponses())
                .setNext(new WebRequester());
    }

    public final WebResponse execute() throws InvalidOperationException {
        return pipeLine.useWith(webRequest);
    }
}
