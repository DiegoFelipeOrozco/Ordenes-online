package com.jualjodi.Store.RequestManagers.implementations;

import com.jualjodi.Store.Pipes.implementations.BlackListVerificator;
import com.jualjodi.Store.Pipes.implementations.CachedResponses;
import com.jualjodi.Store.Pipes.implementations.Sanitizer;
import com.jualjodi.Store.Pipes.implementations.WebRequester;
import com.jualjodi.Store.RequestManagers.WebRequestManager;

public class UnautenticatedWebRequestManager extends WebRequestManager {

    public UnautenticatedWebRequestManager(String username, String password) {
        (pipeLine = new Sanitizer()).setNext(new BlackListVerificator()).setNext(new CachedResponses())
                .setNext(new WebRequester());
    }

}