package me.whiteship.iocevent;

import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by 김홍준
 * Date: 2021-01-04
 * Time: 오후 8:32
 */
@Component
public class AdvancedEventHandler {

    @EventListener
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public void handler1(AdvancedEvent advancedEvent){
        System.out.println("handler1 이벤트 발생 데이터는 " + advancedEvent.getData() + " 입니다.");
    }

    @EventListener
    @Order(Ordered.HIGHEST_PRECEDENCE + 2)
    public void handler2(AdvancedEvent advancedEvent){
        System.out.println("handler2 이벤트 발생 데이터는 " + advancedEvent.getData() + " 입니다.");
    }
}
