package me.whiteshipe.applicationcontext;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * Created by 김홍준
 * Date: 2021-01-04
 * Time: 오후 3:18
 */
@Primary
@Repository
public class OracleBookRepository implements BookRepository{
}
