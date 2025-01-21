package com.programacion.servicios;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class OperacionesImpl implements Operaciones {

    //DI
    @Inject
    private ServicioLog logger;

    @Override
    public int sumar(int a, int b) {
        return a+b;
    }

    @PostConstruct
    public void init() {
        logger.log("***OperacionesImpl::init");
    }

    @PreDestroy
    public void destroy() {
        logger.log("***OperacionesImpl::destroy");
    }
}
