package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("Probando Articulo");
        Articulo articulo = new Articulo("lapicera", 1, 2.15, 1.1);

        double ganancia = articulo.consultarGanancia();

        System.out.println("Ganancia del articulo " + articulo.getDescripcion() + ": " + ganancia);
    }
}
