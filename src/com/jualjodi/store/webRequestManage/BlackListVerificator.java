package com.jualjodi.store.webRequestManage;

public class BlackListVerificator extends Pipe {

    private String[] blackList;

    public WebResponse useWith(WebRequest webRequest) throws InvalidOperationException {
        System.out.println("validando que no sea un ataque de fuerza bruta");
        if (true) {
            //no es un ataque de fuerza bruta
            if (next != null) {
                return next.useWith(webRequest);
            } else {
                return null;
            }
        } else {
            throw new InvalidOperationException("el emisor esta en la lista negra...no podra hacer mas solicitudes");
        }
    }
}
