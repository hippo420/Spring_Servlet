package hello.servlet.basic.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import hello.servlet.basic.Data;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "responseJsonServlet",urlPatterns = "/responseJson")
public class ResponseJsonServlet extends HttpServlet {
    private ObjectMapper objectMapper = new ObjectMapper();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       res.setContentType("application/json");
       //application/json은 스펙상 utf-8사용함으로 utf-8을 추가하는건 의미없음.
       res.setCharacterEncoding("utf-8");

        Data data =new Data();
        data.setAge(20);
        data.setUserId("gaebabja");

        String resData = objectMapper.writeValueAsString(data);
        res.getWriter().write(resData);
    }
}
