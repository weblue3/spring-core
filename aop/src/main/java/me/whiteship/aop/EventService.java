package me.whiteship.aop;

/**
 * Created by 김홍준
 * Date: 2021-01-06
 * Time: 오후 5:37
 */
public interface EventService {
    String createEvent(String event);
    void publishEvent();
    void deleteEvent();
}
