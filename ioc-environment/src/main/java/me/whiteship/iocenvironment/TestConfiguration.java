package me.whiteship.iocenvironment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by 김홍준
 * Date: 2021-01-04
 * Time: 오후 7:01
 */
@Configuration
@Profile(value = "test")
public class TestConfiguration {

    /*@Bean
    public BookRepository bookRepository(){
        return new TestBookRepository();
    }*/
}
