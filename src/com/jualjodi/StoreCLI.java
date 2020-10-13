package com.jualjodi;

import com.jualjodi.store.roles.Admin;
import com.jualjodi.store.webRequestManage.InvalidOperationException;
import com.jualjodi.store.roles.User;

public class StoreCLI {

    private User loggedIn;

    public String logIn(String username, String password){
        try {
            loggedIn = new Admin(username, password);
            return "credenciales autorizadas";
        } catch (InvalidOperationException e) {
            try {
                loggedIn = new User(username, password);
                return "credenciales autorizadas";
            } catch (InvalidOperationException ex) {
                return "credenciales invalidas";
            }
        }
    }

    public void logOut(){
        loggedIn = null;
    }

    public String createRequest(int amount, String item) {
        try {
            return loggedIn.createOrder(amount, item);
        } catch (InvalidOperationException e) {
            return e.getMessage();
        } catch (NullPointerException e){
            return "debe estar autenticado para ejecutar esta operacion";
        }
    }

    public String lookStatusRequests(){
        try {
            return ((Admin)loggedIn).lookStatusRequests();
        } catch (InvalidOperationException e) {
            return e.getMessage();
        } catch (NullPointerException e){
            return "debe estar autenticado para ejecutar esta operacion";
        } catch (ClassCastException e){
            return "no tiene permisos para realizar esta operacion";
        }
    }

    public String cancelRequest(String id){
        try {
            return ((Admin)loggedIn).cancelRequest(id);
        } catch (InvalidOperationException e) {
            return e.getMessage();
        } catch (NullPointerException e){
            return "debe estar autenticado para ejecutar esta operacion";
        } catch (ClassCastException e){
            return "no tiene permisos para realizar esta operacion";
        }
    }
}
