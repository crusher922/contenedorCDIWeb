package com.programacion.servlets;

import com.programacion.servicios.Operaciones;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Inherited;

@WebServlet(urlPatterns = "/sumar")
public class SumarServlet extends HttpServlet {
    @Inject
    private Operaciones servicio;
    //Generar el metodo con click derecho, generate y override methods
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int ret = servicio.sumar(9, 14);

        PrintWriter pw = resp.getWriter();

        resp.setContentType("text/html");

        pw.printf("La suma es %d: ", ret);
    }
}
