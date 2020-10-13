package com.jualjodi;

public class Aplicacion {

    public static void main(String[] args) {
        StoreCLI cli = new StoreCLI();
        System.out.println(cli.createRequest(3, "gafas de sol"));
        cli.logIn("Diego", "miContraseña");
        System.out.println(cli.createRequest(3, "gafas de sol"));
    }
}
