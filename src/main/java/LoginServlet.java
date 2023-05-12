import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("isLoggedIn") != null && (boolean) session.getAttribute("isLoggedIn")) {
            response.sendRedirect("/profile");
        } else {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");

        if (validAttempt) {
            HttpSession session = request.getSession();
            session.setAttribute("isLoggedIn", true);
            session.setAttribute("username", username);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}
