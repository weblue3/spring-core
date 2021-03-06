package me.whiteship.iocenvironment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Locale;

/**
 * Created by 김홍준
 * Date: 2021-01-04
 * Time: 오후 6:59
 */
@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext ctx;

    @Autowired
    BookRepository bookRepository;

    @Value("${app.about}")
    String appName;

    @Autowired
    MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment environment = ctx.getEnvironment();
        System.out.println(Arrays.toString(environment.getActiveProfiles()));
        System.out.println(Arrays.toString(environment.getDefaultProfiles()));

        System.out.println(environment.getProperty("app.about"));
        System.out.println(appName);

        System.out.println(messageSource);
        System.out.println(messageSource.getMessage("greeting", null, Locale.ROOT));
        System.out.println(messageSource.getMessage("greeting", null, Locale.KOREA));
        System.out.println(messageSource.getMessage("greeting", null, Locale.US));
    }
}
