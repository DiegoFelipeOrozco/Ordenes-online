package com.jualjodi;

import com.jualjodi.Store.StoreCLI;

public class Aplicacion {

    public static void main(String[] args) {
        StoreCLI cli = new StoreCLI();
        try {
            System.out.println(cli.createRequest(3, "gafas de sol"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        cli.logIn("Diego", "miContraseña");
        System.out.println(cli.createRequest(3, "gafas de sol"));
    }
}
