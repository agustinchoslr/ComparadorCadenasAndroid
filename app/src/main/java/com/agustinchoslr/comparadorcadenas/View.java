package com.agustinchoslr.comparadorcadenas;

import android.widget.TextView;

public class View {
    private TextView textoResultado;

    public void mostrarResultado(boolean iguales) {
        if (iguales) {
            textoResultado.setText("Las cadenas son iguales");
        } else {
            textoResultado.setText("Las cadenas son diferentes");
        }
    }
}
