package me.whiteship.iocenvironment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * Created by 김홍준
 * Date: 2021-01-04
 * Time: 오후 7:02
 */
@Repository
@Profile("!prod")
public class TestBookRepository implements BookRepository{

}
