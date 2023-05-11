package controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        if (name==null){
            name = "World!";
        } else if (name.equals("bgates")) {
            resp.sendRedirect("https://microsoft.com");
            return;
        }
        req.setAttribute("name", name);
        req.getRequestDispatcher("/hello.jsp").forward(req,resp);
    }
}
