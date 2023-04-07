package hello.servlet.web.frontController.v1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface ControllerV1 {
//컨트롤러 인터페이스
    void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
