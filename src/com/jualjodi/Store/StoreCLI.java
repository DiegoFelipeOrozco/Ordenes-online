package com.jualjodi.Store;

import com.jualjodi.Store.Pipes.InvalidOperationException;
import com.jualjodi.Store.RequestManagers.WebRequestManager;

public class StoreCLI {

    private User loggedIn;

    public String logIn(String username, String password){
        WebResponse webResponse = null;
        try {
            webResponse = WebRequestManager.buildWebRequest(username, password).execute();
            if (webResponse.role == "admin"){
                return (loggedIn = new Admin(username)).toString();
            } else {
                return (loggedIn = new User(username)).toString();
            }
        } catch (InvalidOperationException e) {
            return e.getMessage();
        }
    }

    public void logOut(){
        loggedIn = null;
    }

    public String createRequest(int amount, String item) {
        try {
            return loggedIn.makeRequest(amount, item);
        } catch (InvalidOperationException e) {
            return e.getMessage();
        }
    }

    public void lookStatusRequests(){
        ((Admin)loggedIn).lookStatusRequests();
    }

    public void cancelRequest(String id){
        ((Admin)loggedIn).cancelRequest(id);
    }
}
