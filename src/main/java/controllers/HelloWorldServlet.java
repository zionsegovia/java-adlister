package controllers;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

<<<<<<< HEAD:src/main/java/controllers/HelloWorldServlet.java
@WebServlet(name = "controllers.HelloWorldServlet", urlPatterns = "/hello")
=======
@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
>>>>>>> main:src/main/java/HelloWorldServlet.java
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("<h1>Hello, World!</h1>");
    }
}
