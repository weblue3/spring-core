package me.whiteship.iocevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by 김홍준
 * Date: 2021-01-04
 * Time: 오후 8:28
 */
@Component
public class MyEventHandler implements ApplicationListener<MyEvent> {
    /*
    * 4.2 이전 버전에는 ApplicationListener 구현해야 했다.
    * publishEvent 이벤트 공급자가 발생시킨 이벤트가 리스너에 전달된다.
    * */
    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        System.out.println("이벤트 받았다. 데이터는 " + myEvent.getData());
    }
}
