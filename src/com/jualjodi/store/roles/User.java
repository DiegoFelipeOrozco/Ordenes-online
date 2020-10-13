package com.jualjodi.store.roles;

import com.jualjodi.store.webRequestManage.WebRequestManager;
import com.jualjodi.store.webRequestManage.InvalidOperationException;

public class User {

    protected String username;

    public User(String username, String password) throws InvalidOperationException{
        String response = sendRequest(new String[]{username, password, this.getClass().getName()}, new String[]{"login"});
        if (response.equals("credenciales autorizadas")){
            this.username=username;
        } else {
            throw new InvalidOperationException();
        }
    }

    protected final String sendRequest(String[] body, String[] metadata) throws InvalidOperationException {
        return new WebRequestManager(body, metadata).execute().getText();
    }

    public final String createOrder(int amount, String item) throws InvalidOperationException {
        return sendRequest(new String[]{String.valueOf(amount), item}, new String[]{"create"});
    }
}
