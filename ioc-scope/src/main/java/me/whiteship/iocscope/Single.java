package me.whiteship.iocscope;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by 김홍준
 * Date: 2021-01-04
 * Time: 오후 5:26
 */
@Component
public class Single {

    @Autowired
    Proto proto;

    public Proto getProto() {
        return proto;
    }

    /*@Autowired
    private ObjectProvider<Proto> proto;*/

    /*public Proto getProto() {
        return proto.getIfAvailable();
    }*/
}
