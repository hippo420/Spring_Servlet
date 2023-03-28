package hello.servlet.basic.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "resposeHtmlServlet",urlPatterns = "/respondHtml")
public class ResposeHtmlServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        res.setCharacterEncoding("utf-8");

        PrintWriter writer = res.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1>GAEBABJA</h1>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
