package me.whiteship.iocevent;

/**
 * Created by 김홍준
 * Date: 2021-01-04
 * Time: 오후 8:31
 */
public class AdvancedEvent {

    private int data;

    private Object source;

    public AdvancedEvent(int data, Object source) {
        this.data = data;
        this.source = source;
    }

    public int getData() {
        return data;
    }

    public Object getSource() {
        return source;
    }
}
