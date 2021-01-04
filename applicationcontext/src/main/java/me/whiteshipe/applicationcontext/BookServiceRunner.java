package me.whiteshipe.applicationcontext;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by 김홍준
 * Date: 2021-01-04
 * Time: 오후 3:19
 */
@Slf4j
@Component
public class BookServiceRunner implements ApplicationRunner {

    @Autowired
    BookService bookService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        bookService.printBookRepository();
        bookService.printRepositories();
    }
}
