package com.programacion.servicios;

public class ServicioLogImpl implements ServicioLog{
    @Override
    public void log(String msj) {
        System.out.println("LOG: " + msj);
    }
}
