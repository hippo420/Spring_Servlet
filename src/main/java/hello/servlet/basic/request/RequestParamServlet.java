package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="requestParamServlet",urlPatterns = "/requestParam")
public class RequestParamServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //super.service(req, res);

        //전체 조회
        System.out.println("[전체 파라미터 조회]");
        req.getParameterNames().asIterator()
                .forEachRemaining(paramName -> System.out.println(paramName+ ":"+ req.getParameter(paramName)));
        System.out.println();

        //특정 파라미터 조회
        System.out.println("[특정 파라미터 조회]");
        System.out.println("req_userId: "+req.getParameter("userId"));
        System.out.println("req_age   : "+req.getParameter("age"));
        System.out.println();

        //중복된 파라미터 값 조회, 중복시 단일 파라미터 조회시 첫 파라미터 값이 나옴
        System.out.println("[중복된 파라미터 값 조회]");
        System.out.println("req_userId:::LIST ");
        String[] userIds = req.getParameterValues("userId");
        for (String id: userIds) {
            System.out.println("id = " + id);
        }

        System.out.println();

        res.getWriter().write("ok");
    }

}
