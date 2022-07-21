package servelets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/home")
public class HomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String fullName = request.getParameter("user_fullName");
        int examPoints = Integer.parseInt(request.getParameter("user_examPoints"));

        if (examPoints >= 90) {
            out.print("<h1>" + fullName + " got A for exam</h1>");
        } else if (examPoints >= 75 && examPoints <= 89) {
            out.print("<h1>" + fullName + " got B for exam</h1>");
        } else if (examPoints >= 60 && examPoints <= 74) {
            out.print("<h1>" + fullName + " got C for exam</h1>");
        } else if (examPoints >= 50 && examPoints <= 59) {
            out.print("<h1>" + fullName + " got D for exam</h1>");
        } else {
            out.print("<h1>" + fullName + " got F for exam");
        }

    }

}
