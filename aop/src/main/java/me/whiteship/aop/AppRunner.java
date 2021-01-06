package me.whiteship.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by 김홍준
 * Date: 2021-01-06
 * Time: 오후 5:39
 */
@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    EventService eventService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("EventService : " + eventService);
        eventService.createEvent("EventName");
        eventService.publishEvent();
        eventService.deleteEvent();
    }
}
