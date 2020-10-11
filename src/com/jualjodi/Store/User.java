package com.jualjodi.Store;

import com.jualjodi.Store.Pipes.InvalidOperationException;
import com.jualjodi.Store.RequestManagers.WebRequestManager;

public class User {

    private final String username;

    public User(String username){
        this.username=username;
    }

    public final String makeRequest(int amount, String item) throws InvalidOperationException {
        return WebRequestManager.buildWebRequest(amount, item).execute().toJSON();
    }
}
