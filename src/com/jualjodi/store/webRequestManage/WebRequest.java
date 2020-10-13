package com.jualjodi.store.webRequestManage;

class WebRequest {
    private final String[] body;
    private final String[] meta;

    public WebRequest(String[] body, String[] metadata) {
        this.body = body;
        this.meta = metadata;
    }
}
