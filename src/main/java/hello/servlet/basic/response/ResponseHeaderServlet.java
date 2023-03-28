package hello.servlet.basic.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name ="responseHeaderServlet", urlPatterns = "/responseHeader")
public class ResponseHeaderServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //
        res.setStatus(HttpServletResponse.SC_OK);
        res.setHeader("Content-Type","text/plain;charset=utf-8");
        res.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
        res.setHeader("Pragama","np-cache");
        res.setHeader("gaebababja","developer");

        //content(res);
        //cookie(res);
        //redirect(res);

        //단순 텍스트,HTML 응답
        PrintWriter writer = res.getWriter();
        writer.println("good!!!");
    }

    private void content(HttpServletResponse response){
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");

        //response.setContentLength(7); 생략시 자동생성
    }

    private void cookie(HttpServletResponse response){
        Cookie cookie = new Cookie("gaebabja-cookie","taste-good");
        cookie.setMaxAge(500);
        response.addCookie(cookie);
    }

    private void redirect(HttpServletResponse response) throws IOException {
        response.setStatus(HttpServletResponse.SC_FOUND);
        response.sendRedirect("./basic/redirect.html");
    }
}
