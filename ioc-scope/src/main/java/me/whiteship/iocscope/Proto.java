package me.whiteship.iocscope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Created by 김홍준
 * Date: 2021-01-04
 * Time: 오후 5:26
 */
@Component
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
//--@Scope(value = "prototype")
public class Proto {
}
