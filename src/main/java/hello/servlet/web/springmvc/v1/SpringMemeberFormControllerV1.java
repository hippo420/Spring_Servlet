package hello.servlet.web.springmvc.v1;

import hello.servlet.web.frontController.ModelView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//Controller 의 역할
//1. ComponentScan의 대상이 된다.
//2. RequestMappingHandlerMapping동작
public class SpringMemeberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process(){
        return new ModelAndView("new-form");
    }
}
