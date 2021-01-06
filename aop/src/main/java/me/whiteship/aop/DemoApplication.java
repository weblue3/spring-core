package me.whiteship.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    /*
    *   Aspect
    *       advice - 해야할 일
    *       Pointcut - 어디에서 실행할 것인가
    *       Join Point - 실행 시점
    * */

    public static void main(String[] args) {
        //--SpringApplication.run(DemoApplication.class, args);
        SpringApplication app = new SpringApplication(DemoApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }

}
