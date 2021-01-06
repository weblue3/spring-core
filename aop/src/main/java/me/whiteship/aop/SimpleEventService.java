package me.whiteship.aop;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

/**
 * Created by 김홍준
 * Date: 2021-01-06
 * Time: 오후 5:37
 */
@Service
public class SimpleEventService implements EventService{

    @PerfLogging
    @NonNull
    @Override
    public String createEvent(@NonNull String event) {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Created an event");
        return event;
    }

    @PerfLogging
    @Override
    public void publishEvent() {
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Published an event");
    }

    @Override
    public void deleteEvent() {
        System.out.println("Delete an Event");
    }
}
