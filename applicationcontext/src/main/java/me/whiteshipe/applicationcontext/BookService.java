package me.whiteshipe.applicationcontext;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 김홍준
 * Date: 2021-01-04
 * Time: 오후 1:50
 */
@Service
@Slf4j
public class BookService {

    BookRepository bookRepository;

    @Autowired
    List<BookRepository> bookRepositories;

    @Autowired(required = false)
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void printBookRepository(){
        log.info("BookService 의 bookRepository 는 {} 입니다.", bookRepository.getClass());
    }

    public void printRepositories(){
        log.info("bookRepository 추출 시작");
        bookRepositories.stream().forEach(repo -> {
            log.info(repo.getClass().getName());
        });
        log.info("bookRepository 추출 완료");

    }

}
