package me.whiteship.iocevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/**
 * Created by 김홍준
 * Date: 2021-01-04
 * Time: 오후 8:26
 */
@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationEventPublisher publisher;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //-- 이벤트 발생 공급자 (이벤트 전달하는 객체 선언 필요함. MyEventHandler)
        publisher.publishEvent(new MyEvent(this, 100));

        //-- 4.2 이후 이벤트 발생 핸들러는 빈으로 등록하고 @EventListener 붙이면 된다.
        //-- 순서가 필요한 경우는 @Order 붙이면 된다. 단 동기식을때만 의미있음.
        publisher.publishEvent(new AdvancedEvent(100, this));

        //-- 비동기로 실행할 경우 @Async 붙여야 하며, @EnableAsync 도 필요하며 스레드풀도 설정해야함.
    }
}
