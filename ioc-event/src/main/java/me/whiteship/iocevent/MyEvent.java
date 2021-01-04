package me.whiteship.iocevent;

import org.springframework.context.ApplicationEvent;

/**
 * Created by 김홍준
 * Date: 2021-01-04
 * Time: 오후 8:25
 */
//-- 4.2 버전 이전에는 ApplicationEvent 상속받아야 했다.
public class MyEvent extends ApplicationEvent {

    private int data;

    public MyEvent(Object source) {
        super(source);
    }

    public MyEvent(Object source, int data) {
        super(source);
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
