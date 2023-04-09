package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ServletComponentScan //서블릿 자동등록
@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}


	//ViewResolver 해당의 소스를 자동적으로 해줌 prefix,subfix는 application.proterties에서 가져옴!
	//필요없음!!!
	//	@Bean
	//	ViewResolver internalResourceViewResolver(){
	//		return new InternalResourceViewResolver("/WEB-INF/views/",".jsp");
	//	}
}
