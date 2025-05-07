package com.zepam.holamundo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//Necesitamos implementar una llave
@WebServlet("/holaServlet")
public class HolaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        //Creo un objeto de típo PrintWriter me va a permitir escribir en el navegador
        //System.out.print()
        PrintWriter out = resp.getWriter();
        //Generamos el contenido de la respuesta
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hola Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hola Servlet desde Java</h1>");
        out.println("</body>");
        out.println("</html>");

        out.close();
    }
}
