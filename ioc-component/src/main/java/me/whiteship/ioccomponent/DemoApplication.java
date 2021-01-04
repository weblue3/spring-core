package me.whiteship.ioccomponent;

import lombok.extern.slf4j.Slf4j;
import me.whiteship.ioccomponent.out.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

import java.util.function.Supplier;

@Slf4j
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //--SpringApplication.run(DemoApplication.class, args);
        //-- 펑션을 사용한 빈 등록
        new SpringApplicationBuilder()
                .sources(DemoApplication.class)
                .initializers((ApplicationContextInitializer< GenericApplicationContext>)
                        ctx -> {
                            ctx.registerBean(MyService.class);
                            ctx.registerBean(ApplicationRunner.class, () -> args1 -> log.info("Functional Bean Registration"));
                        }).run(args);
    }

}
