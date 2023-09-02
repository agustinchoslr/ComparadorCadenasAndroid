package com.agustinchoslr.comparadorcadenas;

public class Controller {
    private Model modelo;
    private View vista;

    public Controller(Model modelo, View vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void comparar() {
        boolean iguales = modelo.getCadena1().equals(modelo.getCadena2());
        vista.mostrarResultado(iguales);
    }
}
