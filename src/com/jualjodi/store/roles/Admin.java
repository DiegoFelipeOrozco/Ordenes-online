package com.jualjodi.store.roles;

import com.jualjodi.store.webRequestManage.InvalidOperationException;

public final class Admin extends User {

    public Admin(String username, String password) throws InvalidOperationException {
        super(username, password);
    }

    public String lookStatusRequests() throws InvalidOperationException {
        return sendRequest(null, new String[]{"look status"});
    }

    public String cancelRequest(String id) throws InvalidOperationException {
        return sendRequest(null, new String[]{"cancel"});
    }
}
