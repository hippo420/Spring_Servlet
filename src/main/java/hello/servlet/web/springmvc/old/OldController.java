package hello.servlet.web.springmvc.old;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
@ComponentScan("/springmvc/old-controller/")
public class OldController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController.handleRequest()");

        //view Resolver Test -> application.properties에 설정
        //InternalResourceViewResolver라는 뷰리졸버를 자동으로 등록함.
        return new ModelAndView("new-form");
    }
}
