package com.jualjodi.Store.RequestManagers;

import com.jualjodi.Store.Pipes.Pipe;
import com.jualjodi.Store.Pipes.InvalidOperationException;
import com.jualjodi.Store.RequestManagers.implementations.AutenticatedRequestManager;
import com.jualjodi.Store.RequestManagers.implementations.UnautenticatedWebRequestManager;
import com.jualjodi.Store.WebRequest;
import com.jualjodi.Store.WebResponse;

public abstract class WebRequestManager {
    protected WebRequest webRequest;
    protected Pipe pipeLine;

    public static final UnautenticatedWebRequestManager buildWebRequest(String username, String password) {
        return new UnautenticatedWebRequestManager(username, password);
    }

    public static final AutenticatedRequestManager buildWebRequest(int amount, String item) {
        return new AutenticatedRequestManager();
    }

    public final WebResponse execute() throws InvalidOperationException {
        return pipeLine.useWith(webRequest);
    }
}
