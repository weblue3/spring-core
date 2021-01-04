package me.whiteship.ioccomponent;

import me.whiteship.ioccomponent.out.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by 김홍준
 * Date: 2021-01-04
 * Time: 오후 4:01
 */
@Component
public class MyServiceRunner implements ApplicationRunner {

    @Autowired
    MyService myService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        myService.printService();
    }
}
