package com.programacion.config;

import com.programacion.servicios.ServicioLog;
import com.programacion.servicios.ServicioLogImpl;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class AppConfig {

    //Esta clase es un productor del contenedor

    @Produces
    @ApplicationScoped
    public ServicioLog createLog(){ //creacion del componente ServicioLogImpl
        System.out.println("*******PRODUCTOR");
        return new ServicioLogImpl();
    }

//    @Produces
//    @ApplicationScoped
//    public Operaciones createOperacion(){ creacion del componente OperacionesImpl
//        System.out.println("*******PRODUCTOR");
//        return new OperacionesImpl();
//    }

}
