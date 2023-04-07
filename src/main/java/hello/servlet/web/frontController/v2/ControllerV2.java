package hello.servlet.web.frontController.v2;

import hello.servlet.web.frontController.MyView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface ControllerV2 {
//컨트롤러 인터페이스
    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
