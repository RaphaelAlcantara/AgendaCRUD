package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;



@WebServlet(urlPatterns = {"/Controller", "/main"})
public class Controller extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        if (action.equals("/main")) {
            contatos(request, response);
        }
    }

    //Listar contatos
    protected void contatos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("agenda.jsp");
    }

}
